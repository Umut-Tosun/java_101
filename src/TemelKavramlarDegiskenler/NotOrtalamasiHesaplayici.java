package TemelKavramlarDegiskenler;
import java.util.Scanner;

public class NotOrtalamasiHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik,ortalama;

        System.out.print("Matematik Notunuz : ");
        mat= input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik= input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya= input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce= input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih= input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik= input.nextInt();

        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6;

        // Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        System.out.println("\n"+(ortalama>60?"Sınıfı Geçtiniz ":"Sınıfta Kaldınız"));



    }
}
