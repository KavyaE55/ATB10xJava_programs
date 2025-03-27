package ex_03_Arrays;

public class Reverseorder {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //Increment order
       // for(int i=0;i<numbers.length;i++){

           //Reverse
        for(int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
    }
}
