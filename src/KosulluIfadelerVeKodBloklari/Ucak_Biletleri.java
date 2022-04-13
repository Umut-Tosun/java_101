package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class Ucak_Biletleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculukTipi;
        float ucret = 0.10f;
        float normalTutar,yasIndirim=0f,yolculukTipiIndirimi;

        System.out.print("Mesafe(KM) : ");
        mesafe=input.nextInt();

        System.out.print("Yaşınız : ");
        yas=input.nextInt();

        System.out.print("Yolculuk Tipi [1 => Tek Yön , 2 => Gidiş Dönüş ] Tuşlayınız : ");
        yolculukTipi=input.nextInt();

        if (yolculukTipi==1||yolculukTipi==2) {

            normalTutar = mesafe * ucret;

            if (yas < 12) normalTutar /= 2;
            else if (yas > 12 && yas <= 24) yasIndirim = normalTutar * 0.10f;
            else if (yas > 65) yasIndirim = normalTutar * 0.30f;

            normalTutar -= yasIndirim;

            if (yolculukTipi == 2) {
                yolculukTipiIndirimi = normalTutar * 0.20f;
                System.out.println((normalTutar - yolculukTipiIndirimi) * 2);
            } else {
                yolculukTipiIndirimi = normalTutar * 0;
                System.out.println((normalTutar - yolculukTipiIndirimi));
            }
        }
        else System.out.println("Hatalı Seçim");
    }
}
