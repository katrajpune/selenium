package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGThreeClass {

	@Test
	public void login1()
	{
		Reporter.log("login test three class",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="login1")
	public void home()
	{
		Reporter.log("home 3 page",true);
	}
	
	
	
	
	
}
