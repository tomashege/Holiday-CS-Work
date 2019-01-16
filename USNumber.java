public class USNumber {
    public static void main(String[] args) {
    	
    	int usnum = Integer.parseInt(args[0]);
    	if (usnum > 10000000 && usnum < 99999999) {
    		// (8a + 7b + 6c+ 5d + 4e + 3f + 2g + h) mod 11 = 0
    		
    		int temp = 0;
    		
    		//temp+= (i)*(Integer.parseInt(Character.toString(((Integer.toString(usnum)).charAt(i-1)))));
    		int x = 0;
    		for(int i = 8; i > 0; i--){
                temp+= (i)*(Integer.parseInt(Character.toString(((Integer.toString(usnum)).charAt(x)))));
                x++;
            }
                if (temp%11== 0) {
                	output(true);
                }
                else{
                	output(false);
                }
  
    		
    	}
    	else {
    		output(false);
    	}
 
    } 
    public static void output (boolean temp){
    	if (temp){
    		System.out.println("Valid");
    	}
    	else {
    		System.out.println("invalid");
    	}
    	
    }
    
}
//10000000 and 99999999