package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript {
@Test
public void login() {
	Reporter.log("launch the browser",true);
	Reporter.log("navigate to url",true);
	Reporter.log("click on loginlink",true);
	Reporter.log("enter valid credentials",true);
	Reporter.log("click on login",true);
	Assert.assertEquals(true,false);
	
}
}
