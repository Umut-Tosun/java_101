package Donguler;

import java.util.Scanner;

public class TekMiCiftMi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet,sayi=1,toplam=0,sayac=0;

        System.out.print("Kaç tane sayı giriceksin ? : ");
        adet=input.nextInt();

        for (int i=0;i<adet;i++)
        {
            System.out.print("Sayi : ");
            sayi=input.nextInt();
            if (sayi%2==0) System.out.println("Sayı Çift");
            else System.out.println("Sayı Tek");
        }

        while (sayi!=0)
        {
            System.out.print("Sayi : ");
            sayi=input.nextInt();
            if (sayi%3==0&&sayi%4==0)
            {
                toplam+=sayi;
                sayac++;
            }

        }
        System.out.println("Ortalama "+toplam/sayac);
    }

}
