package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGSecondClass {

@Test (invocationCount=3)
public void login()
{
	Reporter.log("the Second Class TestNg",true);
}


@Test
public void homepage() {
	Reporter.log("home page",true);
}
}
