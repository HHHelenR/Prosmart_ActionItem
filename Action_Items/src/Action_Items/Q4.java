package Action_Items;

public class Q4 {

	public static void main(String[] args) {
		//Q4.Write a program that sums all the odd numbers from 0 to 20 using for and do while loop.
		forLoop(0,20);
		whileLoop(0, 20);
		doWhileLoop(0, 20);
	}
	public static void forLoop(int a, int b) {
		int sum = 0;
		for (int i=a; i<=b;i++) {	
			sum= sum + findOdd(i);
		}System.out.println(sum);	
		System.out.println("**********");
	}	
	public static void whileLoop(int a, int b) {
		int sum = 0;
		while(a<=b) {
			sum= sum + findOdd(a);
			a++;
		}System.out.println(sum);
		System.out.println("**********");	
	}
	public static void doWhileLoop(int a, int b) {
		int sum = 0;
		do{sum= sum + findOdd(a);
		a++;}while(a <=b);
		
		System.out.println(sum);
	}
	public static int findOdd(int odd) {
		if (odd%2!=0) {
		return odd;	}
		return 0;
}
}