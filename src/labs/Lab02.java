package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int intOne = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int intTwo = inKey.nextInt();
		
		
		int maxInt = Math.max(intOne, intTwo);
		int minInt = Math.min(intOne, intTwo);
		
		
		
		
		for(int i = 0; i < 100; i++) {
		int randNum = (int) (Math.random() * (maxInt - minInt + 1) + minInt);
		System.out.print(randNum + " ");
		
		
		randNum = 0;
		
		}
		
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		
		
		System.out.print("\nRaidius: ");
		double raidius = inKey.nextDouble();
		System.out.print("Height: ");
		double height = inKey.nextDouble();
		
		double cyVolume = (Math.PI * Math.pow(raidius, 2))* height;
	
		System.out.print("Volume = " + cyVolume);
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("\nEnter x1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = inKey.nextDouble();
		
		System.out.print("\nEnter x2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		
		double p1 = Math.pow(x2-x1, 2);
		double p2 = Math.pow(y2-y1, 2);
		
		
		double d = Math.sqrt((p1 + p2));
		
		System.out.print("Distance between points = " + d);
	}

	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("\nEnter a-value: ");
		double a = inKey.nextDouble();
		System.out.print("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value: ");
		double c = inKey.nextDouble();
		
		double o =  b * -1;
		double t = Math.sqrt((Math.pow(b, 2)-(4*a*c)));
		double th = 2*a;
		
		double j = (o+t)/th;
		double n = (o-t)/th;
		
		System.out.print("x1 = " + j);	
		System.out.print("x2 = " + n);	

		
	}



}
