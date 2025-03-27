package ex_03_Arrays;

import java.util.Arrays;

public class SecondSamallestNo {
    public static void main(String[] args) {
        int[] numbers= {12, 34, 10, 2, 89, 99};
       // Arrays.sort(numbers);
        //System.out.println(numbers[1]);

        Arrays.sort(numbers);  // Sort the array in ascending order
        System.out.println(numbers[1]);
    }
}
