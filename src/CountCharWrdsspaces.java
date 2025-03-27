public class CountCharWrdsspaces {

    public static void main(String[] args) {
         String str = "Java is awesome!";
         int charCount = str.length();
        System.out.println("Total Character:" + charCount );
        int wordCount = str.split("\\s+").length;
        System.out.println("Total Words:" + wordCount );
        int spacesCount = str.length() - str.replace(" ","").length();
        System.out.println("Total spaces:" + spacesCount);
    }
}
