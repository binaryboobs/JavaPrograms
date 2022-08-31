import java.util.ArrayList;

// https://www.codewars.com/kata/520b9d2ad5c005041100000f/java

public class SimplePigLatin {
   public static String pigIt(String str) {
      String result = "";
      for (String word : str.split(" ")) {
         if (word.length() > 1 && word.matches("(?i)[]"))
            word = word.substring(1, word.length()) + word.charAt(0) + "ay";
         else if (word.matches("(?i)[a-z]"))
            word += "ay";

         result += word + " ";
      }
      return result.substring(0, result.length() - 1);
   }

   public static void main(String[] args) {
      pigIt("This is my string");
   }
}

//BEST SOLUTION: `return str.replaceAll("(\\w)(\\w*)", "$2$1ay");`
