package Diziler;

public class OrtalanaBulanProgram {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);

        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Harmonic avarage of array is : " + avarageHarmonic(array1));

    }
    static double avarageHarmonic(int[] array ) {
        double total = 0 ;
        int c = 0;
        for(int i : array) {
            total += ( 1.0 / i ) ;
            c++;
        }
        total = total/c;
        return total ;
    }
}
