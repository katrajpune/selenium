package testngdisscussion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataTest {

	@BeforeMethod
	public void setup() 
	{
		
		System.out.println("launch the browser");
	}
	
@AfterMethod
public void setup1() 
{
	
	System.out.println("navigate to url");
}
@Test
public void setup3()
{
	System.out.println("launch on homepage");
}
	
}
