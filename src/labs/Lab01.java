package labs;

import java.util.Scanner;

public class Lab01 {

	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	Scanner inKey = new Scanner(System.in);
	
	System.out.print("Enter a positive integer: ");
	int int1 = inKey.nextInt();
	System.out.print("Enter another positive integer: ");
	int int2 = inKey.nextInt();
	
	double res = Math.pow((double)int1, (double)int2);
	System.out.println(int1 + "^" + int2 + " = " + res);
	}
	
	
	
	public static void problem2() {
	Scanner inKey = new Scanner(System.in);
	
	System.out.print("Enter a positive number");
	int posNum = inKey.nextInt();
	
	double res = Math.sqrt(posNum);
	
	System.out.println("The square root of " + posNum + " is " + res + ".");
			
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);

		System.out.print("Length of side A: ");
		int SideA = inKey.nextInt();
		System.out.print("Length of side B: ");
		int SideB = inKey.nextInt();

//		System.out.println("\nSideA = " + SideA);
//		System.out.println("SideB = " + SideB);
		
		SideA = (int) Math.pow(SideA, 2);
		SideB = (int) Math.pow(SideB, 2);

//		System.out.println("\nSideA = " + SideA);
//		System.out.println("SideB = " + SideB);
		
		double Hypo = SideA + SideB;
//		System.out.println("Hypo = " + Hypo);
		double h = Math.sqrt(Hypo);
//		System.out.println("Hypo = " + Hypo);
		
		System.out.println("Hypotenuse = " + h + ".");

	}
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while (2 > 1) {
			System.out.print("Enter an integer: ");
		int	input = inKey.nextInt();
			
		
			max = Math.max(max, input);
			min = Math.min(min, input);
		
		if(input == 0) {
			
			break;
		}
	}
	System.out.println("Max = " + max);
	System.out.print("Min = " + min);
	
	
}}
