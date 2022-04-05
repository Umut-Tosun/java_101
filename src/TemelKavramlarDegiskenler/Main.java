package TemelKavramlarDegiskenler;

public class Main {
    public static void main(String[] args) {
        int createYear=2004;
        String folderName = "Degiskenler";

        System.out.println("Dosya İsmi : "+folderName+" | Oluşturulma Tarihi : "+createYear);

        folderName = "İlkel Veri Tipleri";
        createYear = 2022;

        System.out.println("Dosya İsmi : "+folderName+" | Oluşturulma Tarihi : "+createYear);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
