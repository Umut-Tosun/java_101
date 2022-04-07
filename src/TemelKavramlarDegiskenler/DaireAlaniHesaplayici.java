package TemelKavramlarDegiskenler;

import java.util.Scanner;

public class DaireAlaniHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi=3.14,alan,cevre,merkezAci;

        System.out.print("Yarı Çap : ");
        r=input.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin Alanı : "+alan);
        System.out.println("Dairenin Çevresi : "+cevre);

        //Odev

        System.out.print("Merkez Açısının Ölçüsü : ");
        merkezAci=input.nextInt();

        alan=(pi*(r*r)*merkezAci)/360;

        System.out.print("daire diliminin alanı  : "+alan);
    }
}
