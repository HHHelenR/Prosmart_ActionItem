package Mobile;

import org.testng.annotations.Test;

public class MobileApp {

	@Test(groups="Smoke")
	public void MobileLogin(){
		System.out.println("Mobile Successfully Login");
	}
	
	@Test
	public void MobileLogout() {
		System.out.println("Mobile Successfully Logout");
	}
}
