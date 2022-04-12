package KosulluIfadelerVeKodBloklari;

import java.util.EventListener;
import java.util.Scanner;

public class SayiSiralayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;

        System.out.print("Sayı 1 : ");
        n1=input.nextInt();

        System.out.print("Sayı 2 : ");
        n2=input.nextInt();

        System.out.print("Sayı 3 : ");
        n3=input.nextInt();

        //Büyükten Küçüge

        if (n1>n2 && n1>n3)
        {
            if (n2>n3) System.out.println("Sayı 1 Büyüktür Sayı 2`den , Sayı2 Büyüktür Sayı Üçten");
            else if(n3>n2) System.out.println("Sayı 1 Büyüktür Sayı3 ten , Sayı 3 Büyüktür Sayı ikiden");
            else System.out.println("Sayı 1 büyüktür sayı 2den , sayı2 ve sayı3 eşit");
        }
        else if (n2>n1 && n2 >n3)
        {
            if (n1>n3) System.out.println("Sayı 2 Büyüktür Sayı 1 Den , Sayı 1 Büyüktür Sayı Üçten");
            else if(n3>n1) System.out.println("Sayı 2 Büyüktür Sayı1 den , Sayı3 Büyüktür Sayı birden");
            else System.out.println("Sayı 2 büyüktür sayı1`den , sayı1 ve sayı3 eşit");
        }
        else if (n3>n2 && n3>n1)
        {
            if (n1>n2) System.out.println("Sayı 3 Büyüktür Sayı 1 Den , Sayı 1 Büyüktür Sayı ikiden");
            else if(n2>n1) System.out.println("Sayı 3 Büyüktür Sayı 2`den , Sayı 2 Büyüktür Sayı birden");
            else System.out.println("Sayı 3 büyüktür sayı 1`den , sayı1 ve sayı2 eşit");
        }
        else System.out.println("Tüm sayılar eşit");


        //Küçükten Büyüge
        if (n1<n2&&n1<n3) {
            if (n2<n3) System.out.println("A<B<C");
            else if (n3<n2) System.out.println("A<C<B");
            else System.out.println("A<B=C");
        }
        else if (n2<n1 && n2< n3) {
            if (n1 < n3) System.out.println("B<A<C");
            else if (n3 < n1) System.out.println("B<C<A");
            else System.out.println("B<A=C");
        }
        else if (n3<n1&&n3<n2) {
            if (n2 < n1) System.out.println("C<B<A");
            else if (n1 < n2) System.out.println("C<A<B");
            else System.out.println("C<B=A");
        }
        else System.out.println("A=B=C");
    }
}
