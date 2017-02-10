package Venntro;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BrowserLaunch {
	
WebDriver driver;


@BeforeMethod
public void setUp()
{

	driver = new FirefoxDriver();
	driver.get("http://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

@AfterMethod
public void tearDown()
{
	driver.close();
}
}

	
	

