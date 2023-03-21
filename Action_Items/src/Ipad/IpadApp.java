package Ipad;

import org.testng.annotations.Test;

public class IpadApp {
	
	
	@Test(groups="Smoke")
	public void IpadAppLogin(){
		System.out.println("IpadApp Successfully Login");
	}
	
	@Test
	public void IpadAppLogout() {
		System.out.println("IpadApp Successfully Logout");
	}
	
}
