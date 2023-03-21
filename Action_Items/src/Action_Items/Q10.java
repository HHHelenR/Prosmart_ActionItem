package Action_Items;

public class Q10 {

	public static void main(String[] args) {
		/*Create a method named identifyVowelConsonant that accepts a char argument 
		 * and returns the value “Vowel” if a given character is a vowel, 
		 * returns “Consonant” if the given character is a consonant otherwise displays 
		 * “This alphabet is not known to me!”.
		 */
		System.out.println(identifyVowelConsonant('a'));
		System.out.println(identifyVowelConsonant('b'));
		System.out.println(identifyVowelConsonant('?'));
	}
	public static String identifyVowelConsonant(char a) {
		
		if(a == 'a' || a=='e'|| a=='i'|| a=='o' ||a=='u')
			{return "vowel";}
		else if (a >='b'&& a <='z') {
			return "constant";
		}else {
		return "This alphabet is not known to me!";}		
	}
}
