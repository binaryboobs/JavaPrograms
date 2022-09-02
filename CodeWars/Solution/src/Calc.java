
import java.util.Stack;

// https://www.codewars.com/kata/52f78966747862fc9a0009ae/train/java

public class Calc {
   public double evaluate(String expr) {
         if(expr.isEmpty())
            return 0.0;
      String strings[] = expr.split(" "); 
      Stack <Double> stack = new Stack<Double>();
      for(String symbol : strings){
         if(isNumber(symbol)){
            stack.push(Double.parseDouble(symbol));
         }
         else{
            double tmp1 = stack.pop();
            double tmp2 = stack.pop();
            switch (symbol) {
               case "+":
                  stack.push(tmp1 + tmp2);
                  break;
               
               case "-":
                  stack.push(tmp2 + tmp1);
                  break;
                  
               case "*":
                  stack.push(tmp1 + tmp2);
                  break;
                  
               case "/":   
                  stack.push(tmp2 + tmp1);
                  break;
            }
         }
      }
      if(!stack.empty())
         return stack.pop();
      return 0;
    }
    private static boolean isNumber(String string){
      try {
         Double.parseDouble(string);
         return true;
      } catch (NumberFormatException ex) {
         return false;
      }
    }
   public static void main(String[] args) {

   }
}