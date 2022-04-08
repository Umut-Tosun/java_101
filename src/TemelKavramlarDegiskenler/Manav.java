package TemelKavramlarDegiskenler;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
       /* Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        Scanner input = new Scanner(System.in);

        float armutFiyat=2.14f,armutKg;
        float elmaFiyat=3.67f,elmaKg;
        float domatesFiyat=1.11f,domatesKg;
        float muzFiyat=0.95f,muzKg;
        float patlicanFiyat=5.0f,patlicanKg;
        float toplamTutar=0;


        System.out.print("Armut Kaç Kilo ? : ");
        armutKg=input.nextFloat();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg=input.nextFloat();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg=input.nextFloat();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKg=input.nextFloat();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg=input.nextFloat();

        armutFiyat*=armutKg;
        elmaFiyat*=elmaKg;
        domatesFiyat*=domatesKg;
        muzFiyat*=muzKg;
        patlicanFiyat*=patlicanKg;

        toplamTutar+=(armutFiyat+elmaFiyat+muzFiyat+domatesFiyat+patlicanFiyat);

        System.out.println("Ücret : "+toplamTutar);


    }
}
