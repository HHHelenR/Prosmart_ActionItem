package Automation_Action_Item;

import org.testng.Assert;

public class Q73 {

	public static void main(String[] args) {
		
		validateName("Homer", "Jay", "Simpson", "Simpson, Homer J.");
	}

	public static void validateName(String firstName, String midName, String lastName, String fullName) {
		String webName = lastName + ", " + firstName + " " + midName.charAt(0) + ".";
		if(fullName.equalsIgnoreCase(webName)) {
			System.out.println("PASSED");
		}else {System.out.println("FAILED");
	}
}
}