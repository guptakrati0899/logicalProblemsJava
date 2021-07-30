package logicalProblemsJava;
import java.util.Scanner;
import java.lang.Math;

public class Binary {
	
	public static String swapNibbles(String x){
		String swapBinary="";
		for(int i=4;i<=7;i++) {
			swapBinary+=x.charAt(i);
		}
		for(int i=0;i<=3;i++) {
			swapBinary+=x.charAt(i);
		}
		
		return swapBinary;
	}
	
	public static int binaryToDecimal(String binary) {
		
		int decimal=Integer.parseInt(binary,2);  
		return decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int dec=sc.nextInt();
		ToBinary binary=new ToBinary();
		String binary2=binary.binaryCalc(dec);
		System.out.println("Binary number :"+binary2);
		String swapBinary=swapNibbles(binary2);
		System.out.println("Swapped Binary :"+swapBinary);
		int decimal=binaryToDecimal(swapBinary);
		System.out.println("Decimal after swapping nibbles : "+decimal);
		
	}

}

