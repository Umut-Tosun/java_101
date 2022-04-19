package Diziler;

import java.util.Arrays;

public class DizilerdeTekrarBulma {
    public static void main(String[] args) {
        int[] list = {3, 2, 3, 3, 2, 1, 0};
        int[] duplicate = new int[list.length];
        int starIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])&&(list[i]%2==0))
                    {
                        duplicate[starIndex++] = list[j];

                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) return true;

        }
        return false;
    }

}
