public class Steltel {
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
           int duration = timecontrol(houra, hourb, mina, minb);

           double rand = 0.0;
           if (duration < 0){
             System.out.println(" working on this feature still");
             // what needs to come here is that when it comes to getting. There needs to be able to handel teh fact that
             // when somthing starts at 0230 its later when something starts at 0220.
           }
          rand = (duration*0.40);
             if (houra > 18){
               rand = rand/2;
             }
             if (houra < 8){
               rand = rand/2;
             }
            if (duration > 60){
              rand = rand - rand*0.15;
             }
             rand = rand + rand*0.04;
             System.out.println("Duration: " + duration);
             System.out.println("Cost: R"+rand);
        }
        public static int timecontrol (int houra, int hourb, int mina, int minb) {
          int ans = (hourb - houra) * 60;
          ans += minb - mina;
          return ans;
        }
}
//Any call started after 6pm (1800 hours) gets a 50% discount.
//Any call started after 8am (0800 hours) is charged at full price.
//All calls are subject to a 4% VAT (value added tax).
//The regular rate for a call is R0.40 per minute.
//Any call longer than 60 minutes receives a 15%
//discount on its cost (after any other discount is taken but before tax is added).
