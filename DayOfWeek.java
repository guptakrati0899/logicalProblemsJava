package logicalProblemsJava;
import java.util.Scanner;


public class DayOfWeek {
	
		
		public static void dayOfWeek(int day, int month, int year) {
			int y=year-(14-month)/12;
			int x=year+y/4-y/100+y/400;
			int m=month+12*((14-month)/12)-2;
			int d=(day+x+31*m/12)%7;
			String[] days= {"Sunday","Monday","Tuesday","Wednsday","Thursday","Friday","Saturday"};
			System.out.println(days[d]);
		}
		
		public static void main(String[] args) {
			
			int day=Integer.parseInt(args[0]);
			int month =Integer.parseInt(args[1]);
			int year=Integer.parseInt(args[2]);
			dayOfWeek(day, month, year);
			
		}

	}