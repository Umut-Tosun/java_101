package Donguler;

import java.util.Scanner;

public class Armstrong_Sayilar {
    public static void main(String[] args) {
       /* int number=2451,numberCounter=0,basamakSayisi;

        while (number!=0)
        {
            number=number/10;
            numberCounter++;
        }

        System.out.println(numberCounter);

        int b =2451;
        int c=b%10;
        int sub=2,sup=5;
        int result=1;
        for (int i=1;i<=sup;i++)
        {
            result*=sub;
        }
        System.out.println(result);*/

         int basSayi,sayi,geciciSayi,basNumber=0,basValue,basPow,result=0,baslangic=100,bitis=1000;

         Scanner input = new Scanner(System.in);

         System.out.print("Sayı : ");
         sayi=input.nextInt();

         geciciSayi=sayi;

        while (geciciSayi!=0)
        {
            geciciSayi/=10;
            basNumber++;
        }

        geciciSayi=sayi;

        while (geciciSayi!=0)
        {
            basValue=geciciSayi%10;
            basPow=1;
           for (int i=1;i<=basNumber;i++)
           {
               basPow*=basValue;
           }
           result+=basPow;
           geciciSayi/=10;
        }

        System.out.println(result==sayi?sayi+" Sayısı Armstrong Sayıdır .":sayi+" Sayısı Armstrong Sayı Degildir .");

        //Ödev Kısmı

        geciciSayi=sayi;

        int toplam=0;

        while (geciciSayi!=0)
        {
            basValue=geciciSayi%10;
            geciciSayi/=10;
            toplam+=basValue;
        }
        System.out.println("Basamakları Toplamı : "+toplam);

        //Videoda verilen ödev

        for (int i=baslangic;i<=bitis;i++)
        {
             basNumber=0;
             result=0;
             geciciSayi=i;
            while (geciciSayi!=0)
            {
                geciciSayi/=10;
                basNumber++;
            }

            geciciSayi=i;

            while (geciciSayi!=0)
            {
                basValue=geciciSayi%10;
                basPow=1;
                for (int j=1;j<=basNumber;j++)
                {
                    basPow*=basValue;
                }
                result+=basPow;
                geciciSayi/=10;
            }

            if (result==i) System.out.println(i+" Sayısı Armstrong Bir Sayıdır .");

        }

    }
}
