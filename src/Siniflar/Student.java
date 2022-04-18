package Siniflar;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avg;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avg = 0.0;
        this.isPass=false;
    }
    void addBulExampNote(int note1,int note2,int note3,int note4,int note5,int note6)
    {
        if (note1>=0&&note1<=100)this.c1.note=note1;
        else System.out.println(c1.name+" Dersi için Girilen Not Deger Aralıgı Dışında");

        if (note2>=0&&note2<=100)this.c2.note=note2;
        else System.out.println(c2.name+" Dersi için Girilen Not Deger Aralıgı Dışında");

        if (note3>=0&&note3<=100)this.c3.note=note3;
        else System.out.println(c3.name+" Dersi için Girilen Not Deger Aralıgı Dışında");

        if (note4>=0&&note4<=100)this.c1.verbalNote=note4;
        else System.out.println(c3.name+" Dersi için Girilen Not Deger Aralıgı Dışında");

        if (note5>=0&&note5<=100)this.c2.verbalNote=note5;
        else System.out.println(c3.name+" Dersi için Girilen Not Deger Aralıgı Dışında");

        if (note6>=0&&note6<=100)this.c3.verbalNote=note6;
        else System.out.println(c3.name+" Dersi için Girilen Not Deger Aralıgı Dışında");
    }

    void printNote() {
        System.out.println(c1.name+" Notu\t:"+c1.note);
        System.out.println(c2.name+" Notu\t:"+c2.note);
        System.out.println(c3.name+" Notu\t:"+c3.note);
        if (this.avg!=0.0)
            System.out.println("Ortalama : "+this.avg);
    }
    void isPass() {
        this.avg=((this.c1.note*0.20+this.c1.verbalNote*0.80)+(this.c2.note*0.20+this.c2.verbalNote*0.80)+(this.c3.note*0.20+this.c3.verbalNote*0.80))/3.0;
        String result=this.avg>=50?"Sınıfı Geçtiniz Ortalama : "+this.avg:"Sınıfta Kaldınız Ortalama : "+this.avg;
        System.out.println(result);
    }
}
