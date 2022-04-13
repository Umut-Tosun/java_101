package Donguler;

import java.util.Scanner;

public class While_Dongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int i=10;
        while (i>=1)
        {
            System.out.println("İ : "+i);
            i--;
        }

        int left = 100, right = 200;
        while (++left < --right)
        System.out.println("100 ile 200'ün ortası: " + left);

        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = input.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }

    }
}
