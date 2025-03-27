package ex_03_Arrays;

public class Minimum_array {
    public static void main(String[] args) {
        int[] numbers = {100, 50, 29, 49, 61, 89, 74, 111, 92, 82};
        int min = findMinimum(numbers);
        System.out.println("The minimum array is:" + min);
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
