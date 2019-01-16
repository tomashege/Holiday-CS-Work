public class Equal {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if (a == b && a == c && c == b) {
        	System.out.println("Equals");
        }
        else {
        	System.out.println("Not Equals");
        	
        }
    }
}