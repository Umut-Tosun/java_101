package Siniflar;

public class Teacher {
    String name;
    String mpNo;
    String branch;


    public Teacher(String name, String mpNo, String branch) {
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }
    void print()
    {
        System.out.println("Teacher Name : "+name);
        System.out.println("Teacher Mobile Phone : "+mpNo);
        System.out.println("Teacher Branch : "+branch);
    }
}
