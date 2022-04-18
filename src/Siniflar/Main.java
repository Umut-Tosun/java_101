package Siniflar;

public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Umut Tosun","905539898071","TRH");
        Teacher t2=new Teacher("Emirhan Kep","905545677876","FZK");
        Teacher t3=new Teacher("Ferhan Gümüs","905765787854","KMY");

        Course Tarih = new Course("Tarih","204","TRH");
        Course Fizik = new Course("Fizik","234","FZK");
        Course Kimya = new Course("Kimya","444","KMY");


        Tarih.addTeacher(t1);
        Fizik.addTeacher(t2);
        Kimya.addTeacher(t3);

        Student s1=new Student(Tarih,Fizik,Kimya,"Ahmet Akkaya","173","4");
        s1.addBulExampNote(100,56,50,70,80,90);
        s1.isPass();
        s1.printNote();

        Student s2=new Student(Tarih,Fizik,Kimya,"Oguzhan Fetacı","181","4");
        s2.addBulExampNote(56,78,98,87,42,22);
        s2.isPass();
        s2.printNote();

    }
}
