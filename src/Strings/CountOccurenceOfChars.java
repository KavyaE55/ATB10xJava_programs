package Strings;

public class CountOccurenceOfChars {
    public static void main(String[] args) {

        String str = "Programming";
        char target = 'g';
        int count = 0;

       long Count = str.chars().filter(ch->ch == target).count();
        //System.out.println("CountOccurrencesOfChars:" +);



    }
}
