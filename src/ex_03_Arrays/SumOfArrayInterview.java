package ex_03_Arrays;

public class SumOfArrayInterview {
    public static void main(String[] args) {
        int[] numbers = {22, 10, 20};
        int sum = 0;
        for (int n : numbers) {
            sum = sum + n;
        }           //n=22,10,20  //sum:0+22=22;22+10=32;32+20=52
            System.out.println(sum);
        }
    }

