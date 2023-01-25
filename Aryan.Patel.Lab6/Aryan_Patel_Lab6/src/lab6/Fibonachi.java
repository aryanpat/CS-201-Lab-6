package lab6;

import java.util.Scanner;

public class Fibonachi {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter your Fibonacci N value!");
		int N = input.nextInt();
		
		System.out.println("Your Fibonacci number is: " + fibnum(N));
		
		
	}
	
	public static long fibnum(int N) {
		
		if(N < 0) {
			
			System.out.println("Invalid input for N. Please enter a value greater than 0!");
			N = input.nextInt();
			
		}
	
		if(N <= 1) {
			
			return N;
			
		}
		else{
			
			return (fibnum(N - 1) + fibnum(N - 2));
			
		}
	}

}
