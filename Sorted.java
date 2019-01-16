public class Sorted {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        if (a > b && a > c && b > c) {
        	//this is decending
        	System.out.println("Sorted");
        }
        else {
        	
        	if (a < b && a < c && b < c) {
        		System.out.println("Sorted");
        	}
        	
        	else
        	{	
        	System.out.println("Unsorted");
        	}
       }
    }
}