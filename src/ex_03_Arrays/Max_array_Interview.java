package ex_03_Arrays;

public class Max_array_Interview {
    public static void main(String[] args) {

        //Create an array
        int[] numbers = {10, 28, 89, 99, 48, 150, 120, 500, 499, 200};
        //Max array

        int max = findMaximum(numbers);
        System.out.println("The maximum value in array is:" + max);
    }
public static int findMaximum(int[] arr) {    //Created a method
        int max = arr[0];
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
return max;
        }

    }

