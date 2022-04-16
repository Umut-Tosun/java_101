package Donguler;

public class AsalSayilar {
    public static void main(String[] args) {
        int status=0;

        System.out.println("Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran program\n");

        System.out.print("|");
        for (int i=2;i<=100;i++)
        {
            status=0;
            for (int j=1;j<i;j++)
            {
                if (i%j==0&&j!=1)
                    status=1;
            }
            if (status==0)System.out.print(i+"|");
        }
    }
}
