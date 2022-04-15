package Donguler;

public class YildizPratikleri {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }
            for (int m=1;m<=(2*i)-1;m++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=5;i>=1;i--)
        {
            for (int j=(5-i);j>=1;j--)
            {
                System.out.print(" ");
            }
            for (int m=(2*i)-1;m>=1;m--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
