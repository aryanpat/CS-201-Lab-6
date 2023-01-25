package lab6;

import java.util.Scanner;

public class Snorlax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many pounds of food does Snorlax have?");
		int food = input.nextInt();
		
		System.out.println("Snorlax can finish " + food + " pounds of food in " + eating(food) + " ways!");
		
		
		input.close();
		
	}
	
	public static int eating(int food) {
		
		if(food == 0) {
			return 1;
		}
		
		if(food < 0) {
			return 0;
		}
		
		return eating(food-1) + eating(food-2) + eating(food-3);
		
	}

}
