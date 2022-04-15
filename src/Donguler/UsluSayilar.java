package Donguler;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int n,k,total=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınıcak Sayı : ");
        n= input.nextInt();

        System.out.print("Üs : ");
        k= input.nextInt();

        total=n;

        for (int i=1;i<k;i++)
        {
            total=n*total;
        }

        System.out.println("Total : "+total);
    }
}
