public class Elapse {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String houra = "";
        String hourb = "";
        String mina = "";
        String minb = "";
        if ((a+"").length() >= 4) {
          houra = (a+"").substring(0,2);
          hourb = (b+"").substring(0,2);
          mina  = (a+"").substring(2);
          minb = (b+"").substring(2);
          output(Integer.parseInt(houra), Integer.parseInt(hourb), Integer.parseInt(mina), Integer.parseInt(minb));
        }
        else
        {
           houra = (a+"").substring(0,1);
           mina  = (a+"").substring(1);
          if ((b+"").length() >= 4) {
             hourb = (b+"").substring(0,2);
             minb = (b+"").substring(2);
          }
          else{
           hourb = (b+"").substring(0,1);
           minb = (b+"").substring(1);
        }
        output(Integer.parseInt(houra), Integer.parseInt(hourb), Integer.parseInt(mina), Integer.parseInt(minb));
        }
      }
        public static void output (int houra, int hourb, int mina, int minb) {
          int ans = (hourb - houra) * 60;
          ans += minb - mina;
          System.out.println("Minutes: "+ans);
        }
}
