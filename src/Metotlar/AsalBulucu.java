package Metotlar;

import java.util.Scanner;

public class AsalBulucu {
    static boolean kontrol(int n, int i ){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return kontrol(n, i + 1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner giris=new Scanner(System.in);
        System.out.printf("Bir sayı giriniz : ");
        sayi=giris.nextInt();
        if (kontrol(sayi, 2))
            System.out.println(sayi + " Asal sayıdır");
        else
            System.out.println(sayi + " Asal sayi değildir");

        giris.close();
    }
}
