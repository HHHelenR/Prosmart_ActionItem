package Action_Items;

public class Q3 {

	public static void main(String[] args) {
		// Write a program that returns the factorial (!) of a given number using while loop.
		//For example: 3! equals 3*2*1 = 6 again 5! equals 5*4*3*2*1 = 120.		
		forLoop(5);
		whileLoop(5);
		doWhileLoop(5);	
	}	
	public static void forLoop(int a) {
		int sum=1;
		for (int i = 1; i<= a; i++) {
			sum = sum *i;
			System.out.println("fractorial of " + i + " is " + sum);
		}
		System.out.println("**********");
	}
	public static void whileLoop(int a) {
		int i = 1;
		int sum = 1;
		while (i<=a) {
			sum = sum*i;
			System.out.println("fractorial of " + i + " is " + sum);
			i++;		
		}
		System.out.println("**********");
	}	
	public static void doWhileLoop(int a) {
		int i = 1;
		int sum = 1;
		do{sum = sum*i;
		System.out.println("fractorial of " + i + " is " + sum);
		i++;} while (i<=a);	
	}
}
