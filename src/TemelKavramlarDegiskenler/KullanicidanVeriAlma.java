package TemelKavramlarDegiskenler;
import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınız : ");
        int age=input.nextInt();

        System.out.println("Mesaj : "+(age>18?"Asker Olma Yaşın Geldi Evlat":"Büyü ve Askerde Güçlü Ol Çocuk"));

    }

}
