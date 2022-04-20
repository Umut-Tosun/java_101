package BitirmeProjesi;
/*
Oyun Kuralları :
Oyun metin tabanlıdır.
Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda
 ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz,
sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
 */
import com.sun.source.doctree.ValueTree;

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


    Random r=new Random();
    Scanner input = new Scanner(System.in);

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        mineNumber=(rowNumber*colNumber)/4;
        isWin=(rowNumber*colNumber)-mineNumber;
    }
    void run()
    {
        startgame();
        while (gameStatus) {
            sayac=0;
            bomb=0;
            String ix;
            if (isWin==0){
                System.out.println("Oyunu Kazandınız !");
                gameStatus=false;
                break;
            }
            System.out.print("Satır Giriniz : ");
            userInputRow = input.nextInt();
            System.out.print("Sutün Giriniz : ");
            userInputCol = input.nextInt();

            if ((rowNumber > userInputRow) && (colNumber > userInputCol) && (userInputRow >= 0) && (userInputCol >= 0)) {
                for (int i = 0; i < matris.length; i++) {
                    for (int j = 0; j < matris[i].length; j++) {
                        if (matris[i][j] == "*" && userInputRow == i && userInputCol == j&& gameStatus==true) {
                            System.out.println("\nMayına Basıldı Oyun Bitti.\n");
                            gameStatus=false;
                        }
                        else if(sayac<1&& userInputRow == i && userInputCol == j)
                        {
                             sayac++;
                            if (j==0&&i<rowNumber-1&&i!=0)
                            {
                                if (matris[i][j+1]=="*") bomb++;
                                if (matris[i+1][j]=="*") bomb++;
                                if (matris[i+1][j+1]=="*") bomb++;
                                if (matris[i-1][j]=="*") bomb++;
                                if (matris[i-1][j+1]=="*") bomb++;
                                modifieMap(bomb,i,j);
                                printMap();
                            }
                            else if (i==0&&j==colNumber-1)
                            {
                                if (matris[i][j-1]=="*") bomb++; //sol
                                if (matris[i+1][j-1]=="*") bomb++; //alt sol
                                if (matris[i+1][j]=="*") bomb++; //alt
                                String s=String.valueOf(bomb);
                                tempMatris[i][j]=s;
                                printMap();
                            }
                            else if (i==0&&j>0)
                            {
                                if (matris[i][j-1]=="*") bomb++; //sol
                                if (matris[i][j+1]=="*") bomb++; //sag
                                if (matris[i+1][j+1]=="*") bomb++; //alt sag
                                if (matris[i+1][j-1]=="*") bomb++; //alt sol
                                modifieMap(bomb,i,j);
                                printMap();
                            }
                            else if (i==0&&j==0)
                            {
                                if (matris[i][j+1]=="*") bomb++; //sag
                                if (matris[i+1][j]=="*") bomb++; //alt
                                if (matris[i+1][j+1]=="*") bomb++; //alt sag
                                String s=String.valueOf(bomb);
                                tempMatris[i][j]=s;
                                printMap();
                            }
                            else if (i>0&&j>0&&i<rowNumber-1&&j<colNumber-1)
                            {
                                if (matris[i][j-1]=="*") bomb++; //sol
                                if (matris[i][j+1]=="*") bomb++; //sag
                                if (matris[i+1][j]=="*") bomb++; //alt
                                if (matris[i-1][j]=="*") bomb++; //üst
                                if (matris[i+1][j+1]=="*") bomb++; //alt sag
                                if (matris[i+1][j-1]=="*") bomb++; //alt sol
                                if (matris[i-1][j+1]=="*") bomb++; //üst sag
                                if (matris[i-1][j-1]=="*") bomb++; //üst sol
                                modifieMap(bomb,i,j);
                                printMap();
                            }
                            else if(i==rowNumber-1&&j==colNumber-1)
                            {
                                if (matris[i][j-1]=="*") bomb++; //sol
                                if (matris[i-1][j]=="*") bomb++; //üst
                                if (matris[i-1][j-1]=="*") bomb++; //üst sol
                                modifieMap(bomb,i,j);
                                printMap();
                            }
                            else if (j==colNumber-1&&i<rowNumber-1)
                            {
                                if (matris[i][j-1]=="*") bomb++; //sol
                                if (matris[i-1][j]=="*") bomb++; //üst
                                if (matris[i-1][j-1]=="*") bomb++; //üst sol
                                if (matris[i+1][j-1]=="*") bomb++; //alt sol
                                if (matris[i+1][j]=="*") bomb++; //alt
                                modifieMap(bomb,i,j);
                                printMap();
                            }
                            else if (i==rowNumber-1&&j<colNumber-1&&j!=0)
                            {
                                if (matris[i][j-1]=="*") bomb++; //sol
                                if (matris[i-1][j]=="*") bomb++; //üst
                                if (matris[i-1][j-1]=="*") bomb++; //üst sol
                                if (matris[i-1][j+1]=="*") bomb++; //üst sag
                                if (matris[i][j+1]=="*") bomb++; //sag
                                modifieMap(bomb,i,j);
                                printMap();
                            }
                            else if (j==0&&i==rowNumber-1)
                            {
                                if (matris[i-1][j]=="*") bomb++; //üst
                                if (matris[i][j+1]=="*") bomb++; //sag
                                if (matris[i-1][j+1]=="*") bomb++; //üst sag
                                String s=String.valueOf(bomb);
                                tempMatris[i][j]=s;
                                printMap();
                            }
                            isWin--;
                        }
                    }
                }
            }
            else {
                System.out.println("\nGeçersiz Kordinat\n");
            }
        }
    }
    void printMap()
    {
        for (int i=0;i<tempMatris.length;i++)
        {
            for (int j=0;j<tempMatris[i].length;j++)
            {
                System.out.print(tempMatris[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void startgame()
    {
        System.out.println("Mayınların Konumu");
        matris=new String[rowNumber][colNumber];
        tempMatris=new String[rowNumber][colNumber];
        for (int i=0;i<mineNumber;)
        {
            int a=r.nextInt(0,rowNumber);
            int b=r.nextInt(0,colNumber);

            if (matris[a][b]==null) {
                matris[a][b] = "*";
                i++;
            }
        }
        for (int i=0;i<matris.length;i++)
        {
            for (int j=0;j<matris[i].length;j++)
            {
                tempMatris[i][j]="-";
                if (matris[i][j]==null) matris[i][j]="-";
            }
        }
        for (int i=0;i<matris.length;i++)
        {
            for (int j=0;j<matris[i].length;j++)
            {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        printMap();
    }
    void modifieMap(int bomb,int row,int column)
    {
        String s=String.valueOf(bomb);
        tempMatris[row][column]=s;
    }
}
