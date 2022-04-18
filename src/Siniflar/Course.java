package Siniflar;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    public Course() {
    }

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }
    void addTeacher(Teacher teacher)
    {
            if (teacher.branch.equals(this.prefix)) this.teacher=teacher;
            else System.out.println("Ögretmen Branşı İle Kurs Branşı uyuşmuyor .");
    }
    void printTeacher()
    {
        if (this.teacher!=null)this.teacher.print();
        else System.out.println("Kayıtlı Ögretmen Bulunmuyor .");
    }
}
