package Action_Item_9;

import java.util.ArrayList;
import java.util.List;

public class Action_Item_Q6 {

	public static void main(String[] args) {
		/*Create a method to calculate total number of words in a String. 
		 * For example one of the strings could be: “It does not matter where you come from.
		 *  All that matters is where you are going.”
		 */
		String sentence = "It does not matter where you come from. All that matters is where you are going.";

		//to count the words in the sentence
		String [] count = sentence.split(" ");	
		System.out.println(count.length);
		
		//to count the characters in the sentence
		System.out.println(sentence.length());
		
		
	}

}
