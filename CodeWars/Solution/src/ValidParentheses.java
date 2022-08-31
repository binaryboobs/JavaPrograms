import java.util.ArrayList;

//    https://www.codewars.com/kata/52774a314c2333f0a7000688/java

public class ValidParentheses {
   
   public static boolean validParentheses(String parens)
   {
      System.out.println(parens);
      int counter = 0;
      for(char ch : parens.toCharArray())
      {
         if(counter < 0)
            return false;
         counter += (ch == '(') ? 1 : (ch == ')') ? -1 : 0;
      }
      return counter == 0 ? true : false;
   }
   public static void main(String[] args) {

   }
}
