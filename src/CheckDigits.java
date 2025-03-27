public class CheckDigits {
    public static void main(String[] args) {
        String str1 = "123456";
        String str2 = "123b456";

        boolean isStr1Numeric = str1.matches("\\d+");
       boolean isStr2Numeric = str2.matches("\\d+");
        System.out.println( "digitsString1 :" +isStr1Numeric);
        System.out.println( "digitsString2:" +isStr2Numeric);

    }
}
