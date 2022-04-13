package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYili,kalan;

        System.out.print("Doğum Yılınız [Gün Ay olmadan (2004 Gibi)] : ");
        dogumYili=input.nextInt();

        kalan=dogumYili/12;
        kalan=dogumYili-kalan*12;

        switch (kalan)
        {
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : Maymun"); break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : Horoz"); break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek"); break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz"); break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Fare"); break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Öküz"); break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan"); break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Tavşan"); break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Ejderha"); break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Yılan"); break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : At"); break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : Koyun"); break;
        }


    }
}

