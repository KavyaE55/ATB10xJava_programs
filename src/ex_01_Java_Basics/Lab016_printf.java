package ex_01_Java_Basics;

public class Lab016_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Your variable name is %d", a);
        /** %d -> int,byte,long,short
         * %s-> string
         * %f -> float
         * %b -> boolean
         */
        byte b=90;
        System.out.println();
        System.out.printf("%d",b);
    }
}
