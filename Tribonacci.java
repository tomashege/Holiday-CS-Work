public class Tribonacci {
    public static void main(String[] args) {
      String r = "T(n-1) + T(n-2) + T(n-3)";

      for (int n= 0;n<15;n++) {
        System.out.println("T("+n+")=="+t(n));
      }
    }
      public static int t(int n){
        int temp = 0;
        if (n== 0){
          temp = 0;
        }
        else if (n == 1){
          temp = 1;
        }
        else if (n == 2){
          temp =1;
        }
        else{
          temp = t(n-1) + t(n-2) + t(n-3);

        }
        return temp;
      }


}
