package selenum_4;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_validation {
	static SoftAssert soft_Assert = new SoftAssert();
	
	@Test
	public static void validation() {
		String actual = "google";
		String expected = "Yahoo";
		
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			Assert.fail("Actual is not equal to exptecd");
		}
		
		//Assert.assertEquals(actual, expected);
	}
	
	@Test
	public static void validation2() {
		String actual = "google";
		String expected = "google";
		
		
		soft_Assert.assertEquals(actual, expected);
	}
	
	@Test
	public static void validation3() {
		String actual = "google";
		String expected1 = "Yahoo";
		String expected = "google";
		String expected2 = "gogle";
		
		
		
		soft_Assert.assertEquals(actual, expected, "First assertion");
		soft_Assert.assertEquals(actual, expected1, "second assertion");
		soft_Assert.assertEquals(actual, expected2, "3rd assertion");
		
		soft_Assert.assertAll();
		
		
	
		
	}
	

	
	

	
	
}
