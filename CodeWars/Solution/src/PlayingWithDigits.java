public class PlayingWithDigits {
   public static long digPow(int n, int p) {
      Long currentNum;
      Double sum = 0.0;

      for (char c : Integer.toString(n).toCharArray()) 
      {
         currentNum = Long.parseLong(Character.toString(c));
         sum += Math.pow(currentNum, p);
         p++;
      }
      
      if(sum/n%1==0)
         return (long)(sum / n);


      return -1;
  }
}
