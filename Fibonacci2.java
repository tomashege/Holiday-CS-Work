public class Fibonacci2 {

   public static int F(int n) {
      if (n < 2) {
         return n;
      } else {
         return F(n - 1) + F(n - 2);
      }
   }
   public static void main(String[] args) {
      for (int k = 0; k < 46; k++) {
        
         long time0 = System.currentTimeMillis();
         int value = F(k);
         time0 = System.currentTimeMillis() - time0;
         System.out.print("F(" + k + ")==" + value);
         System.out.println(" (time: " + time0 + " msec)");
      }
   }

}
