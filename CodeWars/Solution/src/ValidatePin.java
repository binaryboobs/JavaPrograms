// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class ValidatePin {

   public static boolean validatePin(String pin) {
      return pin.matches("[\\d]{4}|[\\d]{6}");
   }
   
    public static void main(String[] args) {
      System.out.println(validatePin("20201"));
   }
}
