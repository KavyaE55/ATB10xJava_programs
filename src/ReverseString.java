public class ReverseString {
    public static void main(String[] args) {

// By using String Builder

        String str = "Java";   //Step 1: Create a String
        //Convert String to StringBuilder  => new StringBuilder(str)
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}
// Reverse the String
//Step 4: Convert back to String
//Because StringBuilder is mutable, meaning we can modify it without creating new objects.
//Now StringBuilder contains "Java".
