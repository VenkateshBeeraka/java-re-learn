package dsa.search;

import java.util.Arrays;

// Binary search is an efficient algorithm for finding an element in a sorted array or collection. 
// It works by repeatedly dividing the search interval in half
public class BinarySearch {

    public static int binarySearchMethod(int[] arr1, int x) {
        int low = 0;
        int high = arr1.length - 1;
        while (arr1.length >= 0) {
            int mid = (low + high) / 2;
            System.out.println("loop : " + mid);

            if (arr1[mid] == x) {
                System.out.println("mid matches to x");
                return mid;
            } else if (arr1[mid] > x) {
                System.out.println("If element is smaller than mid");
                high = mid - 1;
            } else {
                System.out.println("Else the element can only be present");
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary search Starts....");
        int[] arr1 = { 9, 2, 5, 1, 8, 4, 11 };
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("length of that array : " + arr1.length);
        System.out.println(binarySearchMethod(arr1, 9));
    }
}
