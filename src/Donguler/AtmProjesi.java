package Donguler;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password, birlesim;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        boolean durum=true;

        while (durum) {

            switch (right) {
                case 0:
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                    durum=false;
                    break;
                default:
                    System.out.print("Kullanıcı Adınız :");
                    userName = input.nextLine();
                    System.out.print("Parolanız : ");
                    password = input.nextLine();

                    birlesim = userName + password;

                        switch (birlesim) {

                            case "patikadev123":
                                while (durum) {
                                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                                    System.out.println("1-Para yatırma\n" +
                                            "2-Para Çekme\n" +
                                            "3-Bakiye Sorgula\n" +
                                            "4-Çıkış Yap");
                                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                                    select = input.nextInt();
                                    switch (select) {
                                        case 1:
                                            System.out.print("Para miktarı : ");
                                            int price = input.nextInt();
                                            balance += price;
                                            break;
                                        case 2:
                                            System.out.print("Para miktarı : ");
                                            int pricex = input.nextInt();

                                            boolean kontrol = pricex > balance;
                                            int kontrol2 = kontrol == true ? 1 : 0;

                                            switch (kontrol2) {
                                                case 1:
                                                    System.out.println("Bakiye yetersiz.");
                                                    break;
                                                default:
                                                    balance -= pricex;
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Bakiyeniz : " + balance);
                                            break;
                                        case 4:
                                            System.out.println("Tekrar görüşmek üzere.");
                                            durum = false;
                                            break;
                                    }
                                }
                            default:
                                right--;
                                System.out.println("Kalan Hakkınız : " + right);
                        }
                    }
            }
        }
    }
