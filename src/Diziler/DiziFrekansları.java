package Diziler;

import java.util.Arrays;

public class DiziFrekansları {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 15, 10, 10, 20, 5, 20};
        int n = arr.length, count = 1;

        Arrays.sort(arr); // 5 10 10 10 20 20 20 20

        int curItem, prevItem;

        for (int i=1; i<n; i++) {
            curItem = arr[i];
            prevItem = arr[i - 1];

            if (curItem == prevItem) {
                count +=1;
            }
            if (curItem != prevItem || i == 7) {
                System.out.println("The integer " + prevItem + " has been repeated " + count + " time(s).");
                count = 1;
            }

        }

    }
}
