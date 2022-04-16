package Donguler;

public class TersUcgen {
    public static void main(String[] args) {
        for (int i=10;i>=1;i--)
        {
            for (int j=(10-i);j>=1;j--)
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
