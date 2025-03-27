public class StringPalindrome {
    public static void main(String[] args) {

        // A palindrome is a string that reads the same forwards and backwards
        // (e.g., "madam"

        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is Palindrome!");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

}

