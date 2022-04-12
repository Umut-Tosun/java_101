package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {


        int numberOne, numberTwo,secim;
        Scanner input = new Scanner(System.in);

        System.out.print("\nİşlemi Seçiniz : \n1--Toplama \n2--Çıkarma \n3--Bölme \n4--Çarpma\nSecim : ");
        secim=input.nextInt();

        System.out.print("İlk Sayıyı Giriniz : ");
        numberOne=input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        numberTwo=input.nextInt();

        if (secim==1) System.out.println("Toplam : "+numberOne+numberTwo);
        else if(secim==2) System.out.println("Çıkarma : "+(numberOne-numberTwo));
        else if (secim==3)
            if (numberTwo!=0) System.out.println("Bölme: "+(numberOne/numberTwo));
            else System.out.println("Bir sayı 0`a bölünemez");
        else if(secim==4) System.out.println("Çarpma: "+(numberOne*numberTwo));
        else System.out.println("Seçim Hatalıdır ...");

        System.out.print("\nİşlemi Seçiniz : \n1--Toplama \n2--Çıkarma \n3--Bölme \n4--Çarpma\nSecim : ");
        secim=input.nextInt();

        switch (secim)
        {
            case 1:
                System.out.println("Toplam : "+numberOne+numberTwo); break;
            case 2:
                System.out.println("Çıkarma : "+(numberOne-numberTwo)); break;
            case 3:
                switch (numberTwo)
                {
                    case 0:System.out.println("Bir sayı 0`a bölünemez"); break;
                    default:System.out.println("Bölme: "+(numberOne/numberTwo)); break;
                }
            case 4:
                System.out.println("Çarpma: "+(numberOne*numberTwo)); break;
            default:
                System.out.println("Seçim Hatalıdır ..."); break;
        }

    }
}
