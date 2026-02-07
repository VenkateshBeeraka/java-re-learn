package dsa.search;

import java.util.ArrayList;

// Linear search is a simple sequential searching algorithm 
// that checks each element in a data structure one by one until a match for the target value is found 
// or the entire list has been traversed
public class linerSearch {

    public static int linerSearchMethod(int array1[], int x) {
        System.out.println("Array Size : " + array1.length);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Linear Search Starts...");
        int[] array1 = { 5, 9, 2, 7, 1 };

        //For more understanding between array and arrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        System.out.println("ArrayList : "+ arrList.size());

        int result = linerSearchMethod(array1, 7);
        System.out.println("Result : " + result + " and the element of that in array: " + array1[result]);
    }
}
