package Java.java-func-08-09-2023;

public class annualRevenue {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
double count = 0;
        for (double x: revenue) {
        	count+=x;
        }
        double total = count/revenue.length;
System.out.println(total);
       
    }
}
