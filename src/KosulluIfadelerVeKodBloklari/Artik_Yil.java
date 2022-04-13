package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.print("Yıl Giriniz : ");
        yil=input.nextInt();

        if (yil%4==0) System.out.println(yil+" Artık Bir Yıldır.");
        else System.out.println(yil+" Artık Bir Yıl Degildir.");


    }
}
