public class Miles {
    public static void main(String[] args) {
        double miles = Double.parseDouble(args[0]);
        double km = miles * 1.60934;
        System.out.print(miles + " miles == ");
        System.out.println(km + " km");
    }
}