package Strings;

public class RemoveSpaces {
    public static void main(String[] args) {
         String str = "Java is Fun!";
        String noSpaces = str.replace(" ","");
        System.out.println("Original String: " + str);
        System.out.println("Without Spaces: " + noSpaces);
    }
}
