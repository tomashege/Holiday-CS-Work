public class distance {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double ans = x-y;
        
        System.out.println(Math.sqrt(Math.pow((x-0), 2)+Math.pow((y-0), 2)));
        
        //(Math.pow((x-0), 2)+Math.pow((y-0), 2)); 
        //Math.sqrt(Math.pow((x-0), 2)+Math.pow((y-0), 2)))
  
    }
}