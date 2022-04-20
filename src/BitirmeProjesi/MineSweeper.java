package BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber;
    int userInputRow;
    int userInputCol;
    int bomb=0;
    int sayac=0;
    int isWin;

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
                System.out.println("Oyunu Kazandınız !");
                gameStatus=false;
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
                            System.out.println("\nMayına Basıldı Oyun Bitti.\n");
                            gameStatus=false;
                        }
                        else if(sayac<1&& userInputRow == i && userInputCol == j)
                        {
                             sayac++;
                             //islemler
                            isWin--;
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
                System.out.print(x[i][j] + "\t");
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
        if (x>0&&x<rowNumber&&y>0&&y<colNumber)
         for (int r = x - 1; r <= x + 1; r++)
            for (int c = y - 1; c <= y + 1; c++)
                if (r >= 0 && c >= 0 && !(r == x && c == y) && r <= rowNumber && y <= colNumber)
                    if (bombMap[r][c] == "*") bomb++;

        String s=""+bomb;
        return s;
    }
    void modifieMap()
    {
        for (int r=1; r< bombMap.length-1;r++)
            for (int c=1 ; c<bombMap[r].length-1;c++)
                if (bombMap[r][c]!="*") {
                    bombMap[r][c] = check_around_bomb(r,c);
                }
        printMap(bombMap);
    }
}
