package Siniflar;

public class BoksMain {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Mehmet Kiraz",10,100,80,60);
        Fighter f2=new Fighter("Caner Toprak",20,70,90,30);

        Match m1 = new Match(f1,f2,70,100);
        m1.run();
    }
}
