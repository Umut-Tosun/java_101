package Donguler;

import java.util.Scanner;

public class SayiSiralayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minSayi,maxSayi,sayi;

        System.out.print("Kaç tane Sayı Giriceksiniz ? : ");
        int adet=input.nextInt();

        System.out.print("Sayı :");
        sayi=input.nextInt();

        maxSayi=sayi;
        minSayi=sayi;

        for (int i=1;i<adet;i++)
        {
            System.out.print("Sayı :");
            sayi=input.nextInt();

            if (sayi>maxSayi) maxSayi=sayi;
            else if(sayi<minSayi) minSayi=sayi;
        }

        System.out.println("En Büyük Sayı : "+maxSayi);
        System.out.println("En Küçük Sayı : "+minSayi);

    }
}
