package TemelKavramlarDegiskenler;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float urunFiyat;
        float kdvFiyat;
        float kdv;

        System.out.print("Ürün Fiyatı : ");
        urunFiyat = input.nextInt();

        kdv=urunFiyat<1000?(urunFiyat*18/100):(urunFiyat*8/100);
        kdvFiyat=kdv+urunFiyat;


        System.out.println("Ürün Fiyatı : "+urunFiyat);
        System.out.println("Kdv Tutarı : "+kdv);
        System.out.println("KDV'li Fiyat "+kdvFiyat);


    }
}
