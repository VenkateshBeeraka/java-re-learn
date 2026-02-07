package arrays;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int copy2[] = numbers;
        int copy[] = Arrays.copyOf(numbers, numbers.length);

         System.out.println(Arrays.equals(numbers, copy));

        int copy3[] = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 1, 4, 9);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.toString(copy2));

        System.out.println(Arrays.toString(copy3));

        System.out.println(numbers == copy);


    }
}