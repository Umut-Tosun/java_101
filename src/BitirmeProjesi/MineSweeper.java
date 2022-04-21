package BitirmeProjesi;

import java.net.PortUnreachableException;
import java.util.Random;
import java.util.Scanner;


public class MineSweeper {
    public static final String ANSI_CLS = "\u001b[2J";
    public static final String ANSI_HOME = "\u001b[H";
    public static final String ANSI_BOLD = "\u001b[1m";
    public static final String ANSI_AT55 = "\u001b[10;10H";
    public static final String ANSI_REVERSEON = "\u001b[7m";
    public static final String ANSI_NORMAL = "\u001b[0m";
    public static final String ANSI_WHITEONBLUE = "\u001b[37;44m";
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_BEYAZ = "\u001B[37m";

    Random r = new Random();
    Scanner input = new Scanner(System.in);

    int rowNumber, colNumber, mineNumber, userInputRow, userInputCol, isWin, bomb = 0, score = 0;

    boolean gameStatus = true;

    String[][] matris;
    String[][] tempMatris;
    String[][] bombMap;

    public MineSweeper(int rowNumber, int colNumber)
    {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.bombMap = new String[rowNumber][colNumber];
        this.matris = new String[rowNumber][colNumber];
        this.tempMatris = new String[rowNumber][colNumber];
        mineNumber = (rowNumber * colNumber) / 3;
        isWin = (rowNumber * colNumber) - mineNumber;
    }

    public void run()
    {
        startgame();
        while (gameStatus)
        {
            if (isWin == 0) {
                gameOver(true);
                break;
            }
            do {
                System.out.print("Satır Giriniz : ");
                userInputRow = input.nextInt();
            } while (userInputRow < 1 || userInputRow > rowNumber);
            userInputRow--;
            do {
                System.out.print("Sutün Giriniz : ");
                userInputCol = input.nextInt();
            } while (userInputCol < 1 || userInputCol > colNumber);
            userInputCol--;
            modifieMap();
            check_isZero(userInputRow, userInputCol);
            if (bombMap[userInputRow][userInputCol].equals("*") && gameStatus) {
                gameOver(false);
            } else if (matris[userInputRow][userInputCol].equals("-")) {
                check_isZero(userInputRow, userInputCol);

            }
            isWin--;
            System.out.println("isWin : "+isWin);
            score += 10;
            printMap(matris);

        }
    }

    public void check_isZero(int r, int y)
    {
        matris[r][y] = bombMap[r][y];
        if (bombMap[r][y].equals(" ")) {

            int[][] a = {{r - 1, y}, {r, y - 1}, {r, y + 1}, {r + 1, y}};

            for (int[] x : a) {
                if (x[0] >= 0 && x[1] >= 0 && x[0] < rowNumber && x[1] < colNumber)
                    if (!bombMap[x[0]][x[1]].equals("*") && matris[x[0]][x[1]].equals("-"))
                    {
                        check_isZero(x[0], x[1]);
                        isWin--;
                    }
            }
        }
    }

    public void printMap(String x[][])
    {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (!x[i][j].equals("*") && !x[i][j].equals("-") && !x[i][j].equals("0")) System.out.print(ANSI_KIRMIZI + x[i][j] + "\t");
                else System.out.print(ANSI_BEYAZ + x[i][j] + "\t");
                System.out.print(ANSI_BEYAZ + "");
            }
            System.out.println();
        }
    }

    public void startgame()
    {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < mineNumber; ) {
            int a = r.nextInt(0, rowNumber);
            int b = r.nextInt(0, colNumber);

            if (bombMap[a][b] == null) {
                bombMap[a][b] = "*";
                i++;
            }
        }
        for (int i = 0; i < matris.length; i++)
            for (int j = 0; j < matris[i].length; j++) {
                tempMatris[i][j] = "-";
                if (matris[i][j] == null) matris[i][j] = "-";
                if (bombMap[i][j] == null) bombMap[i][j] = "-";
            }
        printMap(bombMap);
        System.out.println("======================================================");
        modifieMap();
        System.out.println(ANSI_KIRMIZI+"Mayın Tarlası Oyununa Hoşgeldiniz !");
        System.out.println("Yerleştirilen Bomba Sayısı : "+mineNumber);
        printMap(tempMatris);
        System.out.println(ANSI_BEYAZ+"======================================================");
    }

    public String check_around_bomb(int x, int y)
    {
        int bomb = 0;
        if (x >= 0 && x < rowNumber && y >= 0 && y < colNumber)
            for (int r = x - 1; r <= x + 1; r++)
                for (int c = y - 1; c <= y + 1; c++)
                    if (r >= 0 && c >= 0 && !(r == x && c == y) && r < bombMap.length && c < bombMap[0].length)
                        if (bombMap[r][c].equals("*")) bomb++;

        return Integer.toString(bomb);
    }

    public void modifieMap()
    {
        int c, r;
        for (r = 0; r < bombMap.length; r++)
            for (c = 0; c < bombMap[r].length; c++)
                if (!bombMap[r][c].equals("*")) {
                    String b = check_around_bomb(r, c);
                    if (b.equals("0")) bombMap[r][c] = " ";
                    else bombMap[r][c] = b;
                }
    }

    public void gameOver(boolean status)
    {
        if (status){
            System.out.println(ANSI_KIRMIZI+"Oyunu Kazandınız ! Toplam Puan : " + score);
            gameStatus = false;
            restartGame();
        } else {
            System.out.println(ANSI_KIRMIZI+"\nMayına Basıldı Oyun Bitti.\nScore : " + score);
            gameStatus = false;
            restartGame();
        }

    }
    public void restartGame()
    {
        MineSweeper ms=new MineSweeper(3,3);
        System.out.print(ANSI_KIRMIZI+"Tekrardan oynamak için [1] çıkmak için [0]  : ");
        int isFinish = input.nextInt();
        do {
            if (isFinish==1)ms.run();
            else if(isFinish==0)System.exit(0);
            System.out.print(ANSI_KIRMIZI+"Tekrardan oynamak için [1] çıkmak için [0]  : ");
            isFinish = input.nextInt();

        }while (isFinish!=1||isFinish!=0);
    }
}