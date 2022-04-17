package Metotlar;

public class Recursive_Metot {
    public static void main(String[] args) {
        int sonuc = toplam(10);
        System.out.println(sonuc );
    }
    public static int toplam(int k) {
        if (k > 0) {
            return k + toplam(k - 1);
        } else {
            return 0;
        }
    }
}
