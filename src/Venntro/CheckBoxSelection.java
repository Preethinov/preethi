package Venntro;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxSelection extends BrowserLaunch {
	
@Test(enabled=false, priority=1)	
	public void removeCheckBox()
	{
	  driver.findElement(By.linkText("Dynamic Controls")).click();
	   driver.findElement(By.xpath("//*[@id='btn']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//*[@id='message']")).getText(),"It's gone!");
	}

@Test(enabled=true, priority=0)
public void loadingBar() throws Throwable
{
	
	   driver.findElement(By.linkText("Dynamic Controls")).click();
	   driver.findElement(By.xpath("//*[@id='btn']")).click(); 
	  Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id='btn']")).click();
      
     System.out.println(driver.findElement(By.xpath("//*[@id='message']")).getText());
	  Assert.assertEquals(driver.findElement(By.xpath("//*[@id='message']")).getText(),"It's back!");
	
}


}
