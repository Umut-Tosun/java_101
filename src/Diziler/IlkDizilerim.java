package Diziler;

public class IlkDizilerim {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 3 };   // tercih edilen yol

        //double myList[];   // veya başka türlü tanımlama biçimi

        reverse(myList);


    }
    public static int[] reverse(int[] list)
    {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
        {
            result[j] = list[i];
        }

        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i] + " ");
        }

        return result;
    }
}
