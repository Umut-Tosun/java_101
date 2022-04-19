package Metotlar;

import java.util.Scanner;

public class DesenMetot {
    static void PatternCreator (int number)
    {
        if (number<=0) {
            System.out.print(" "+number);
            return;
        }
        System.out.print(" "+number);
        PatternCreator(number-5);
        System.out.print(" "+number);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("N sayısı : ");
            a=inp.nextInt();
            System.out.print("Çıktısı : ");
            PatternCreator(a);
            System.out.println("\n");
        }
    }
}

