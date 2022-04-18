package Siniflar;

public class Employee {
    String name;
    int salary;
    int tempSalary;
    int workHours;
    int hireYear;
    int taxValue=0;
    int bonusValue=0;
    int raiseValue=0;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tempSalary=salary;
    }
    void tax()
    {

        if (salary>1000)
        {
            taxValue=(salary*3)/100;
            salary-=taxValue;
        }
    }
    void bonus()
    {

        if (workHours>40)
        {
            bonusValue=workHours-40;
            bonusValue*=30;
            salary+=bonusValue;
        }
    }
    void raiseSalary()
    {
        if (2021-hireYear<10)
        {s
            raiseValue=(tempSalary*5)/100;
            salary+=raiseValue;
        }
        else if (2021-hireYear>10&&2021-hireYear<19)
        {
            raiseValue=(tempSalary*10)/100;
            salary+=raiseValue;
        }
        else
        {
            raiseValue=(tempSalary*15)/100;
            salary+=raiseValue;
        }
    }
    void print()
    {
        System.out.println("~~~~~~~~~~~~Çalışan Bilgileri~~~~~~~~~~~~");
        System.out.println("Adı : "+name);
        System.out.println("Maaşı : "+salary);
        System.out.println("Çalışma Saati [Haftalık] : "+workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+taxValue);
        System.out.println("Bonus : "+bonusValue);
        System.out.println("Maaş Artışı : "+(salary-tempSalary));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+(tempSalary+bonusValue-taxValue));
        System.out.println("Toplam Maaş : "+salary);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
