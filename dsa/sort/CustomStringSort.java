package dsa.sort;

import java.util.Arrays;

public class CustomStringSort {
    public static void main(String[] args) {
        System.out.println("Custom String sort Starts....");
        String[] arr1 = {"venkatesh", "anil", "pavan"};
        sortString(arr1);
    }

    public static String[] sortString(String[] arr1){
        for(int i = 0; i < arr1.length; i++){
            for (int j = i+1; j < arr1.length; j++) {
                String temp = "";
                if (arr1[i].compareTo(arr1[j]) > 0) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("Custom String sorted array : "+Arrays.toString(arr1));
        return arr1;
    }
}
