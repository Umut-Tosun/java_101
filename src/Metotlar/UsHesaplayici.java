package Metotlar;

import java.util.Scanner;

public class UsHesaplayici {
    static int exponent(int num, int pow) {
        if (pow <= 0) {
            return 1;
        } else {
            return num * exponent(num, pow - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tabanı giriniz: ");
        int numP = input.nextInt();

        System.out.print("Kuvveti giriniz: ");
        int powP = input.nextInt();

        System.out.println(numP + "^" + powP + " = " + exponent(numP, powP));
    }
}
