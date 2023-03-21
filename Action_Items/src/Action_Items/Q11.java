package Action_Items;

public class Q11 {

	public static void main(String[] args) {
		/*Create an Array index out of bound exception in your code and surround 
		 * that with a try catch block to handle that exception.
		 */

		int [] count = {1, 2, 3, 4};
		try{System.err.println(count[10]);}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.getMessage tells you where you got sth wrong
		}
	}

}
