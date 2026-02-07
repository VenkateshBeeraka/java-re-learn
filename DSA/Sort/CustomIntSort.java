package DSA.Sort;

import java.util.Arrays;

public class CustomIntSort {

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Custom sorted array : "+Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Custom sort Starts....");
        int[] arr1 = { 9, 2, 5, 1, 8, 4 , 11};
        sortArray(arr1);
    }
}
