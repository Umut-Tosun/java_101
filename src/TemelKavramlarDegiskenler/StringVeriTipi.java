package TemelKavramlarDegiskenler;

public class StringVeriTipi {
    public static void main(String[] args) {
        String words = "Hello World";

        System.out.println(words.toUpperCase());
        System.out.println(words.toLowerCase());

        String name = "Umut";

        String vStr = words +" "+name;
        System.out.println(vStr);
    }
}
