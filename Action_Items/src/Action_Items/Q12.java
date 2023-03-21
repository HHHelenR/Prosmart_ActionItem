package Action_Items;

public class Q12 {

	public static void main(String[] args) {
		// Create a function to print numbers from 65 to 80 where 74 to 76 will be skipped.

		functions(65,80);		
	}
	public static void functions(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i > 76 || i < 74) {
				System.out.println(i);
			}
		}
	}
}
