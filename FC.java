public class FC {
    public static void main(String[] args) {
    	double fahrenheit = Double.parseDouble(args[0]);
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.print(fahrenheit + " Fahrenheight == ");
        System.out.println(celcius + " Celcius");
    }
}