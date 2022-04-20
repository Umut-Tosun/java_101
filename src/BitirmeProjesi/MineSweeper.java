package BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_BEYAZ = "\u001B[37m";
    int rowNumber;
    int colNumber;
    int mineNumber;
    int userInputRow;
    int userInputCol;
    int bomb=0;
    int sayac=0;
    int isWin;
    int score=0;

    boolean gameStatus=true;

    String [][] matris;
    String [][] tempMatris;
    String [][] bombMap;

    Random r=new Random();
    Scanner input = new Scanner(System.in);

    public MineSweeper(int rowNumber, int colNumber)
    {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.bombMap=new String[rowNumber][colNumber];
        this.matris=new String[rowNumber][colNumber];
        this.tempMatris=new String[rowNumber][colNumber];
        mineNumber=(rowNumber*colNumber)/4;
        isWin=(rowNumber*colNumber)-mineNumber;
    }
    void run()
    {
        startgame();
        while (gameStatus) {
            sayac=0;
            bomb=0;
            if (isWin==0){
                gameOver(true);
                break;
            }
            do {
                System.out.print("Satır Giriniz : ");
                userInputRow = input.nextInt();
            }while (userInputRow<1||userInputRow>rowNumber);
            userInputRow--;
            do {
                System.out.print("Sutün Giriniz : ");
                userInputCol = input.nextInt();
            }while (userInputCol<1||userInputCol>colNumber);
            userInputCol--;

            if ((rowNumber > userInputRow) && (colNumber > userInputCol) && (userInputRow >= 0) && (userInputCol >= 0)) {
                for (int i = 0; i < matris.length; i++) {
                    for (int j = 0; j < matris[i].length; j++)
                        if (matris[i][j] == "*" && userInputRow == i && userInputCol == j&& gameStatus==true) {
                            gameOver(false);
                            break;
                        }
                        else if(sayac<1&& userInputRow == i && userInputCol == j)
                        {
                             isWin--;
                             score+=10;
                             sayac++;
                             matris[i][j]=bombMap[i][j];
                             printMap(matris);
                        }
                    }
                }
            else {
                System.out.println("\nGeçersiz Kordinat\n");
            }
        }
    }
    void printMap(String x[][])
    {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j]!="*"&&x[i][j]!="-"&&x[i][j]!="0") System.out.print(ANSI_KIRMIZI +x[i][j]+"\t");
                else System.out.print(ANSI_BEYAZ +x[i][j]+"\t");
                System.out.print(ANSI_BEYAZ+"");
            }
            System.out.println();
        }
    }
    void startgame()
    {
        System.out.println("Mayınların Konumu");
        for (int i=0;i<mineNumber;)
        {
            int a=r.nextInt(0,rowNumber);
            int b=r.nextInt(0,colNumber);

            if (matris[a][b]==null) {
                matris[a][b] = "*";
                bombMap[a][b] = "*";
                i++;
            }
        }
        for (int i=0;i<matris.length;i++)
            for (int j=0;j<matris[i].length;j++) {
                tempMatris[i][j]="-";
                if (matris[i][j]==null) matris[i][j]="-";
                if (bombMap[i][j]==null) bombMap[i][j]="-";
            }
        printMap(bombMap);
        System.out.println("======================================================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        modifieMap();
        System.out.println("======================================================");
    }
    public String  check_around_bomb(int x, int y)
    {
        int bomb = 0;
        if (x>=0&&x<rowNumber&&y>=0&&y<colNumber)
         for (int r = x - 1; r <= x + 1; r++)
            for (int c = y - 1; c <= y + 1; c++)
                if (r >= 0 && c >= 0 && !(r == x && c == y) &&r < bombMap.length && c < bombMap[0].length)
                    if (bombMap[r][c] == "*") bomb++;
        return ""+bomb;
    }
    void modifieMap()
    {
        for (int r=0; r< bombMap.length;r++)
            for (int c=0 ; c<bombMap[r].length;c++)
                if (bombMap[r][c]!="*") {
                    bombMap[r][c] = check_around_bomb(r,c);
                }
        printMap(bombMap);
    }
    void gameOver(boolean status)
    {
        if (status==true)
        {
            System.out.println("Oyunu Kazandınız ! Toplam Puan : "+score);
            gameStatus=false;
        }
        else if (status==false)
        {
            System.out.println("\nMayına Basıldı Oyun Bitti.\nScore : "+score);
            gameStatus=false;
        }

    }
}
