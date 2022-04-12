package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SicaklikVeEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Hava Sıcaklıgı ? : ");
        heat=input.nextInt();

        if (heat<5) System.out.println("Kayak Yapabilirsiniz");
        else if (heat<=15) System.out.println("Sinamaya Gidebilirsiniz");
        else if (heat<=25) System.out.println("Sinemaya Gidebilir veya piknik keyfi yapabilirsiniz .");
        else System.out.println("Yüzebilirsiniz ama barajlarda degil");

    }
}
