package lab6;

import java.util.Scanner;

public class Disks {
	
	static int steps = 1;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many disks would you like the problem to have? ");
		int a = input.nextInt();
		
		nextPole(a, "First Pole", "Second Pole", "Thrid Pole");
		
		System.out.println();
		steps--;
		System.out.println("The number of steps needed to get through " + a + " disks was " + steps + ".");
		
		input.close();
		
	}
	
	public static void nextPole(int a, String start, String helper, String end){
		
		if(a==1) {
			
			System.out.println(steps + "." + " The disk was moved from the " + start + " to the " + end + ".");
			steps++;
			
		}
		
		else {
			
			nextPole(a-1, start, end, helper);
			System.out.println(steps + "." + " The disk was moved from the " + start + " to the " + end + ".");
			steps++;
			nextPole(a-1, helper, start, end);
			
		}
		
	}

}
