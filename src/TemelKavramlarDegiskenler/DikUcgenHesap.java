package TemelKavramlarDegiskenler;

import java.util.Scanner;

public class DikUcgenHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenarBir,kenarIki;
        double sonuc,alan;

        System.out.print("1. Kenarı Giriniz : ");
        kenarBir=input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        kenarIki=input.nextInt();

        sonuc=Math.sqrt((kenarBir*kenarBir)+(kenarIki*kenarIki));

        System.out.println("Sonuç : "+sonuc);

        int vKenar,vKenar2,vKenar3,cevre;

        System.out.print("1. Kenarı Giriniz : ");
        vKenar=input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        vKenar2=input.nextInt();

        System.out.print("3. Kenarı Giriniz : ");
        vKenar3=input.nextInt();

        cevre=(vKenar+vKenar2+vKenar3)/2;
        alan=Math.sqrt(cevre*(cevre - vKenar)*(cevre-vKenar2)*(cevre-vKenar3));

        System.out.print("Alan : "+alan);

    }
}
