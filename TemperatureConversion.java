package logicalProblemsJava;

import java.util.Scanner;


public class TemperatureConversion {
	
		public static void main(String[] args) {
			double farhn,cel;
	        Scanner S = new Scanner(System.in);
		    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
	        int temp = S.nextInt();
		    switch(temp) {
				case 1: {
				    System.out.println("Enter  Fahrenheit temperature : ");
			        farhn=S.nextDouble();
		            cel=(farhn-32)*5/9;
		            System.out.println("Enter Celsius temperature :  "+cel);
			        break;
			    }
		        case 2: {
				    System.out.println("Enter  Celsius temperature");
	                cel=S.nextDouble();
		            farhn=((9*cel)/5)+32;
		            System.out.println("Fahrenheit temperature is = "+farhn);
			        break;
			    }
		        default: {
				    System.out.println("please choose valid choice");
		        }
			}
		}
	}


