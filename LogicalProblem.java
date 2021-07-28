package logicalProblemsJava;

public class LogicalProblem {
	

	public static int fibonacci(int n) {
		 int first = 0, second = 1;
		 System.out.println("Fibonacci series is as follows:");
		 System.out.println(first);
		 System.out.println(second);
	        for (int i = 2; i <= n; i++)
	        {
	        	int next = first + second;
	            System.out.println(next);
	            first = second;
	            second = next;
	        }
	        return 0;
	    }
	
	
	public static int checkPerfectNumber(int n) {
		int check=0;
		
		System.out.println("Welcome to Perfect number check");
		for(int div=1;div<n;div++) {
			if(n%div==0) {
				check+=div;
				
			}
		}
		if(check==n) {
			System.out.println("This number is a Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
		return 0;

	}
	
	
	
	public static void checkPrime(int n) {
		int flag=0;
		for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                flag=1;
                break;
            }
        }
		if(flag==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
	}
	
	
	
	
	
	public static void reverseNumber(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		System.out.println();
	}
	
	
	
	   
		public static void toBinary(int decimal){    
		     int binary[] = new int[40];    
		     int index = 0;    
		     while(decimal > 0){    
		       binary[index++] = decimal%2;    
		       decimal = decimal/2;    
		     }    
		     for(int i = index-1;i >= 0;i--){    
		       System.out.print(binary[i]);    
		     }    
		System.out.println(); 
		}    
	
	
	
	
	
	
	public static void couponGenerator() {
	char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
	int max=100000000;
	int random=(int) (Math.random()*max);	
	StringBuffer sb=new StringBuffer();
	
	while (random>0)
	{
		sb.append(chars[random % chars.length]);
		random /= chars.length;
	}

	String couponCode=sb.toString();
	System.out.println("Coupon Code: "+couponCode);	
	}
	
	
	    
	 

	public static void main(String[] args) {
		
		
		
		 //Square root using newton's method
		
		
		 double a = Double.parseDouble(args[0]);

		 double epsilon = 1e-15;
		 double t = a;

		 while (Math.abs(t - a/t) > epsilon * t) {
		          t = (a/t + t) / 2.0;
		   }
		 
		  System.out.println(t);
		  
		  
		
		  	
		
		fibonacci(10);
		checkPerfectNumber(28);
		checkPrime(4);
		reverseNumber(125);
		couponGenerator();
		toBinary(15);
		
	}

}
	
	
	

