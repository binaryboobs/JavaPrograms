// https://www.codewars.com/kata/52e88b39ffb6ac53a400022e/java

public class App {

   public static String longToIP(long ip) {
      String binarString = Long.toBinaryString(ip);
      if (binarString.length() != 32) {
         int frontZeros = 32 - binarString.length();
         while (frontZeros > 0) {
            frontZeros--;
            binarString = "0".concat(binarString);
         }
      }
      String result = "";
      result += Integer.parseInt(binarString, 0, 8, 2);
      for (int i = 8; i < 32; i += 8) {
         result += ".";
         result += Integer.parseInt(binarString, i, i + 8, 2);
      }
      return result;
   }

   public static void main(String[] args) {
      longToIP(2132806145L);
   }
}
