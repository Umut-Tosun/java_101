package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiEnler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz : ");
        int sayi = scanner.nextInt();

        int[] list = {15, 17, 788, 1, -1, -778, 2, 0,12}; // -778 -1 0 1 2 12 15 788
        Arrays.sort(list);
        int min = 0;
        int max = 0;


        for (int i = 0; i < list.length; i++) {
            if (list[i] < sayi) {
                min = list[i];
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] > sayi) {
                max = list[i];
                break;
            }
        }

        System.out.println("En Yakın Küçük Sayı: " + min);
        System.out.println("En Yakın Büyük Sayı: " + max);

    }
}
