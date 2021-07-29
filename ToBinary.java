package logicalProblemsJava;
import java.util.Scanner;

public class ToBinary {

	    public static void main(String[] args) 
	    {
	        int n, count = 0, a;
	        String x = "";
	        Scanner S = new Scanner(System.in);
	        System.out.print("Enter any decimal number:");
	        n = S.nextInt();
	        while(n > 0)
	        {
	            a = n % 2;
	            if(a == 1)
	            {
	                count++;
	            }
	            x = a + "" + x;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	        System.out.println("No. of 1s:"+count);
	    }  
	}

