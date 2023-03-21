package Web;

import org.testng.annotations.Test;

public class Webpage {
	
	@Test(groups="Smoke")
	public void WebpageLogin(){
		System.out.println("Webpage Successfully Login");
	}
	
	@Test
	public void WebpageLogout() {
		System.out.println("Webpage Successfully Logout");
	}
	
}
