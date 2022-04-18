package Siniflar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Match {
    Random random = new Random();
    DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
    Date tarih = new Date();

    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;
    Date matchDate;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.matchDate=tarih;
    }
    void run(){
        if (isCheck()){
            System.out.println("");
            System.out.println("SAYIN SEYİRCİLER MAÇ BAŞLIYOR ! ! ! ");
            System.out.println("Maç Başlama Saati : "+sdf.format(matchDate));
            if (isWhoStart()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("");
                    System.out.println("========== YENİ ROUND ==========");
                    if (isWhoStart())
                    {
                        System.out.println("Rounda "+f1.name+" Başlıyor.");
                        f2.health = f1.hit(f2);
                        if (isWin()) break;
                        f1.health = f2.hit(f1);
                        if (isWin()) break;
                    }
                    else
                    {
                        System.out.println("Rounda "+f2.name+" Başlıyor.");
                        f1.health = f2.hit(f1);
                        if (isWin()) break;
                        f2.health = f1.hit(f2);
                        if (isWin()) break;
                    }
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                    System.out.println("==========      ==========");
                    System.out.println("");

                }
            }
        }
        else System.out.println("Sporcuların sikletleri uyuşmuyor .");
    }
    boolean isCheck(){
        return(this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }
    boolean isWin() {
        if (this.f1.health==0){
            System.out.println(f2.name+" Kazandı .");
            return true;
        }
       else if (this.f2.health==0){
            System.out.println(f1.name+" Kazandı .");
            return true;
        }
        return false;
    }
    boolean isWhoStart()
    {
        int randomNumber=random.nextInt(1,101);
        if (randomNumber>=50) return true;
        return false;
    }
}
