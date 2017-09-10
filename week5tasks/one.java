//package AT;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import static org.junit.Assert.assertTrue;
//
//public class one {
//
//	private WebDriver webDriver;
//
//	@Before
//	public void before() {
//		// maximises the browser before the webpage opens.
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start-maximized");
//
//		webDriver = new ChromeDriver(options);
//	}
//
//	@Test
//	public void test() {
//		webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
//		// find by item name- username
//		webDriver.findElement(By.name("username"));
//		// creating a usernameElement for inputting data
//		WebElement usernameElement = webDriver.findElement(By.name("username"));
//		// telling it to send the userelement to to the webdriuver feild found
//		// earlier with this information
//		usernameElement.sendKeys("Mice");
//		// find the password elment
//		webDriver.findElement(By.name("password"));
//		// creating variable for password
//		WebElement passwordElement = webDriver.findElement(By.name("password"));
//		// enter this data
//		passwordElement.sendKeys("Pepsi1");
//		// click on save
//
//		webDriver.findElement(By.name("FormsButton2")).click();
//		// navigate to login page
//		webDriver.navigate().to("http://thedemosite.co.uk/login.php");
//		// find by item name- username
//		webDriver.findElement(By.name("username"));
//		// creating a usernameElement for inputting data
//		WebElement usernameElement1 = webDriver.findElement(By.name("username"));
//		// telling it to send the userelement to to the webdriuver feild found
//		// earlier with this information
//		usernameElement1.sendKeys("Mice");
//		// find the password elment
//		webDriver.findElement(By.name("password"));
//		// creating variable for password
//		WebElement passwordElement1 = webDriver.findElement(By.name("password"));
//		// enter this data
//		passwordElement1.sendKeys("Pepsi1");
//		// click on save
//		webDriver.findElement(By.name("FormsButton2")).click();
//
//		// checking if the string successful login apears once the page logs in,
//		// if this is succesful it has worked
//		assertEquals("**Successful Login**",
//				(webDriver
//						.findElement(By.cssSelector(
//								"body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"))
//						.getText()));
//
//	}
//
//	// @After
//	// un-commet when want to exit after checked
//	// public void after() {
//	// webDriver.quit();
//	// }
//
//}
