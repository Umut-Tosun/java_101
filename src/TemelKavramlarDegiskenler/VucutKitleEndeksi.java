package TemelKavramlarDegiskenler;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float boy,kilo,endeks;

        System.out.print("Boy : ");
        boy=input.nextFloat();

        System.out.print("Kilo : ");
        kilo=input.nextFloat();

        endeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : "+endeks);

    }
}
