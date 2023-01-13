package performance_task;

import java.util.Scanner;

public class Performance_Task {
	
	public static int t = 1;

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter launch velocity (m/s) >>> ");
		int launchVel = inKey.nextInt();
		System.out.print("Enter launch angle (degrees) >>> ");
		int launchAng = inKey.nextInt();
		
		
		System.out.print("\n\nProjectile Path:");
		
		System.out.print("Time: 0s\nx-pos = 0.0m\ny-pos = 0.0m");
				
		
		double cosLA = Math.cos(Math.toRadians(launchAng));
		double sinLA = Math.sin(Math.toRadians(launchAng));
		
		while(t>-1) {
		double xPos = cosLA * t * launchVel;
		double yPos = sinLA * t * launchVel - 0.5 * 9.8*Math.pow(t, 2);
		
		System.out.println("\n\nTime: " + t + "s");
		System.out.println("x-pos = " + xPos + "m");
		
		if(yPos < 0) {
			
			yPos = 0;
		}
		System.out.println("y-pos = " + yPos + "m");
		
		t = t+1;
		
		if(yPos == 0) {
			
			break;
		}
		}
		
	}
	
}
