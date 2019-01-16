public class SimpleCalc {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        if (a == 1) {
        	//addition
        	System.out.println(b+c);
        }
        else
        if   (a == 2) {
        	//subtraction
        	System.out.println(b-c);
        }
        else 
        if (a ==3) {
        	//multiplication
        	System.out.println(b*c);
        	
        }
        else 
            if (a ==4) {
            	//division
            	try {
            		System.out.println(b/c);
            	}
            	catch (ArithmeticException e)
            	{
            		System.out.println("division by zero");
            	}
            	
            }
            else {
            	System.out.println("bad");
            }
        //1 = addition, 2 = subtraction, 3 = multiplication, 4 = division
} 
}