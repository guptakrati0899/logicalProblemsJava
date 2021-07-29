package logicalProblemsJava;

public class MonthlyPayment {

	    public static void main(String[] args) {
	        double p = Double.parseDouble(args[0]);
	        double y = Double.parseDouble(args[1]);        
	        double rate = Double.parseDouble(args[2]);        
	        
	        double r = (rate / 100) / 12;
	        double n = 12 * y;

	        double payment = (p * r) / (1 - Math.pow(1+r, -n));
	        double interest = payment * n - p;

	        System.out.println("Monthly Payment = " +payment);
	        System.out.println("Total Interest = " +interest);
	    }
	}

