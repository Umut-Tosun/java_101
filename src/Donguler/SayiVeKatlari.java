package Donguler;

import java.util.Scanner;

public class SayiVeKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total=0;

        System.out.print("Sayı : ");
        number=input.nextInt();

        if (number%4==0) total += number;

        while (number%2==0)
        {
            System.out.print("Sayı : ");
            number=input.nextInt();

            if (number%4==0) total += number;
        }

        System.out.println("Toplam : "+total);
    }
}
