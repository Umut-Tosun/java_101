package TemelKavramlarDegiskenler;

import java.util.Scanner;

public class TaksimetreHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gidileceKm;
        float ucret=10f;

        System.out.print("KM : ");
        gidileceKm=input.nextInt();

        ucret+=gidileceKm*2.20f;

        System.out.println(ucret<20?"Ücretiniz 20 Tl dir":"Ücretiniz "+ucret+" Tl dir");


    }
}
