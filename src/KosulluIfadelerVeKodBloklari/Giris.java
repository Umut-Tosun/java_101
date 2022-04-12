package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName,password,newPassword;

        System.out.print("Kullanıcı Adınız : ");
        userName=input.next();

        System.out.print("Şifreniz : ");
        password=input.next();

        if (userName.equals("patika")&&password.equals("java101"))
            System.out.println("Giriş Başarılı");
        else
        {
            if (!password.equals("java101"))
            {
                System.out.print("Şifreniz hatalı , sıfırlamak ister misiniz ? Yeni Şifeyi giriniz : ");
                newPassword=input.next();

                if (newPassword.equals("java101")||newPassword.equals(password)) System.out.println("Şifreniz degiştirilemedi");
                else
                {
                    System.out.println("Şifre degiştirilmiştir");
                    password=newPassword;
                }

            }
            else System.out.println("Hatalı Giriş - Kullanıcı adı hatalı");
        }
    }
}
