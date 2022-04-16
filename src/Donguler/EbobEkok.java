package Donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2,ebob=1;

        System.out.println("n1 Sayısını Giriniz : ");
        n1=input.nextInt();
        System.out.println("n2 Sayısını Giriniz : ");
        n2=input.nextInt();

        int i=1;

        while (i<=n1)
        {
            if (n1%i==0&&n2%i==0) ebob=i;
            i++;
        }
        System.out.println("Ebob : "+ebob);
        i=1;
        while (i>=1)
        {
            if (i%n1==0&&i%n2==0) break;
            i++;
        }
        System.out.println("Ekok : "+i);

    }
}
