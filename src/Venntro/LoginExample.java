package Venntro;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginExample extends BrowserLaunch{

@Test( priority=0,enabled=false)
public void authorisedUser()
{
		
		driver.findElement(By.linkText("Basic Auth")).click();
		try {
			Runtime.getRuntime().exec("E:\\preethi\\Example\\Authentication.exe");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='content']/div/p")).getText(), "Congratulations! You must have the proper credentials.");
		
	}

@Test( priority=1,enabled=true)

public void unAuthorisedUser()
{
	driver.findElement(By.linkText("Basic Auth")).click();
	try {
		Runtime.getRuntime().exec("E:\\preethi\\Example\\UnauthorisedUser.exe");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Assert.assertEquals(driver.findElement(By.xpath("html/body")).getText(),"Not authorized");
	System.out.println("Unauthorised User");
}
}

