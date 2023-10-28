package selenum_4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_dependance {
	
	@Test(priority = 3, dependsOnMethods ="userRegister" , alwaysRun = true)
	public static void userLogin() {
		System.out.println("Verifying user login");
	}
	
	@Test(priority = 1)
	public static void userRegister() {
		System.out.println("Verifying user register");
		Assert.fail("Registration fail");
	}
	
	@Test(priority = 2)
	public static void userRegisterFooter() {
		System.out.println("Verifying user register page footer");
	}
	
	@Test
	public static void userLoginFooter() {
		System.out.println("Verifying user Login page footer");
	}

	@Test (dependsOnMethods ="userLogin",  alwaysRun = true )
	public static void HomepageFooter() {
		System.out.println("Verifying user Login page footer");
	}
}
