package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


public class one {

	
	private WebDriver webDriver;
	
	
	@Before 
	public void before() 
	{
		
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
			
			webDriver = new ChromeDriver(options);
	}

@Test
public void test ()
{
	webDriver.navigate().to( "http://www.qa.com");

	//ChromeDriver.manage().window().maximize();
	
	webDriver.findElement(By.cssSelector("#menu > div.navigation-links-hugescreen.visible-f > ul > li:nth-child(2) > div > a > span")).click(); 
	webDriver.findElement(By.cssSelector("#course-lists > div.layout > article:nth-child(1) > div > ul > li:nth-child(1) > a")).click();
	//webDriver.findElement(By.cssSelector("#at-a-glance > div:nth-child(1) > header > h1")).getAttribute(null);

}

//@After
//public void after ()
//{
//	webDriver.quit();
//}




}
