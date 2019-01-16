public class Tribonacci {
    public static void main(String[] args) {
      String r = "T(n-1) + T(n-2) + T(n-3)";

      for (int n= 0;n<14;n++) {
        System.out.println(method(n));
      }
    }
      public static String method(int n){
        String temp = "";
        if (n== 0){
          temp = "T(0)==0";
        }
        else if (n == 1){
          temp = "T(1)==1";
        }
        else if (n == 2){
          temp = "T(2)==1";
        }
        else{
          int num = (n-1) + (n-2) + (n-3);
          temp= "T("+n+")=="+num;

        }
        return temp;
      }


}
