package Diziler;

public class TekBoyutluDiziler {
    public static void main(String[] args) {
        String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        for (int i=0;i< weekDays.length;i++)
            System.out.println(weekDays[i]);


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        cars[2] = "Toyota";

        System.out.println(cars[0]);
    }
}
