package logicalProblemsJava;
import java.util.Scanner;

public class ToBinary {
	
	static void binaryCalc(int n) {
		int count = 0, a;
        String x = "";
      
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

	    public static void main(String[] args) 
	    {
	    	Scanner s = new Scanner(System.in);
	        System.out.print("Enter any decimal number:");
	        int n = s.nextInt();
	       binaryCalc(n); 
	       s.close();
	    }  
	}

