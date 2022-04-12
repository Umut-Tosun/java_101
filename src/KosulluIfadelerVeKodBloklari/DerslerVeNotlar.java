package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class DerslerVeNotlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik,total=0,counter=0;

        System.out.print("Matematik Notu : ");
        mat=input.nextInt();

        if (mat>=0&&mat<=100)
        {
            total+=mat;
            counter++;
        }

        System.out.print("Fizik Notu : ");
        fizik=input.nextInt();

        if (fizik>=0&&fizik<=100)
        {
            total+=fizik;
            counter++;
        }

        System.out.print("Türkçe Notu : ");
        turkce=input.nextInt();

        if (turkce>=0&&turkce<=100)
        {
            total+=turkce;
            counter++;
        }

        System.out.print("Kimya Notu : ");
        kimya=input.nextInt();

        if (kimya>=0&&kimya<=100)
        {
            total+=kimya;
            counter++;
        }

        System.out.print("Müzik Notu : ");
        muzik=input.nextInt();

        if (muzik>=0&&muzik<=100)
        {
            total+=muzik;
            counter++;
        }


        if ((total/counter)>55) System.out.println("Geçtiniz Ortalama : "+(total/counter));
        else System.out.println("Kaldınız Ortalama : "+(total/counter));
    }
}
