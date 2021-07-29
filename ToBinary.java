package logicalProblemsJava;

import java.util.Scanner;


public class ToBinary {
	
	public static String binaryCalc(int n) {
		int a;
        String x = "";
        String binary="";
      
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        for(int i=0;i<8-x.length();i++){
        	binary+="0";
        }
        binary+=x;
        System.out.println(x);
        return binary;
       
	}


	 public static void main(String[] args) {
		 
		System.out.println("Enter a number");	
		Scanner input = new Scanner(System.in);
		int s=input.nextInt();
		 
		 binaryCalc(s);
	 }
}
