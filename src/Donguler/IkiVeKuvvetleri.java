package Donguler;

import java.util.Scanner;

public class IkiVeKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,i;
        System.out.println("Sınır Sayısı : ");
        n=input.nextInt();

        System.out.println("Girdiginiz Sayıya Kadar 2 nin Katları : ");

        for (i=1;i<=n;i*=2)
        {
            System.out.println(i);
        }
        System.out.println("Girdiginiz Sayıya Kadar 4 ün Katları : ");
        for (i=1;i<=n;i*=4)
        {
            System.out.println(i);
        }
        System.out.println("Girdiginiz Sayıya Kadar 5 in Katları : ");
        for ( i=1;i<=n;i*=5)
        {
            System.out.println(i);
        }
    }
}
