package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,result=0;

        while (true) {
            result=0;
            System.out.print("Sayı : ");
            number = input.nextInt();

            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    result += i;
            }
            if (result == number) System.out.println(number + " Mükemmel Sayıdır");
            else System.out.println(number + " Mükemmel Sayı Degildir");
        }
    }
}
