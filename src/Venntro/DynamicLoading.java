package Venntro;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DynamicLoading extends BrowserLaunch {
	
@Test(enabled=true,priority=0)
public void messageHelloWorld()
{
	driver.findElement(By.linkText("Dynamic Loading")).click();
	driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
	driver.findElement(By.xpath("//*[@id='start']/button")).click();
	try{
	
	Assert.assertTrue(driver.findElement(By.id("loading")).getAttribute("style").isEmpty(),"true");

	}
	catch (Exception e)
	{
	    
		System.out.println("Assert Failed "+e.getMessage());
	}
	
}

@Test(enabled=false,priority=1)
public void displayEmail()
{
	driver.findElement(By.linkText("Sortable Data Tables")).click();
	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[3]/td[3]")).getText(),"jdoe@hotmail.com");
}

}
