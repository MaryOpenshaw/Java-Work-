package AT;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Robot;

public class RunningTests {

	private WebDriver webDriver;
	private loginPage LoginPage;
	private createUser user;
	private static ExtentReports report;
	private ExtentTest test;
	private static String reportFilePath = "report.html";
	private Robot r;
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	// Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
	// .withTimeout(30, TimeUnit.SECONDS)
	// .pollingEvery(5, TimeUnit.SECONDS)
	// .ignoring(NoSuchElementException.class);
	//
	// WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	// public WebElement apply(WebDriver webDriver) {
	// return webDriver.findElement(By.id("foo"));
	// }
	// });

	@BeforeClass
	public static void beforeClass() {
		report = new ExtentReports();

		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(reportFilePath);
		extentHtmlReporter.config().setReportName("report for multip;le tests");
		extentHtmlReporter.config().setDocumentTitle("Test Report");

		report.attachReporter(extentHtmlReporter);

	}

	@Before
	public void before() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		webDriver = new ChromeDriver(options);
		user = PageFactory.initElements(webDriver, createUser.class);
		// int i = 0;
		// test = report.createTest("Test" ) ;

	}

	@Test
	public void makeUser() {
		test = report.createTest("Make user test " + 1);
		SpreadSheetReader sheetReader = new SpreadSheetReader("TestData.xlsx");
		// change the number 2 to move down rows
		List<String> row = sheetReader.readRow(2, "Test");

		for (String cell : row) {
			System.out.println(cell);
		}

		webDriver.navigate().to("http://thedemosite.co.uk/addauser.php");
		// rows = collums in this sense, telling it to reas collumn 2 as it is
		// username and collum 3 id passwords
		user.enterUserName(row.get(2));
		user.enterPassword(row.get(3));
		user.clickButton();

		webDriver.navigate().to("http://thedemosite.co.uk/login.php");
		LoginPage = PageFactory.initElements(webDriver, loginPage.class);
		LoginPage.enterName(row.get(2));
		LoginPage.enterPass(row.get(3));
		LoginPage.clickButton1();
		// note if the assert fails then it will no longer exicute anything else
		assertEquals("**Successful Login**",
				(webDriver
						.findElement(By.cssSelector(
								"body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"))
						.getText()));

		test.log(Status.INFO, "This test makes a user account and logs into a website");
		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "Succesful login");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "Succesful login"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void moveElement() {

		test = report.createTest("The Move Test " + 2);
		Actions builder = new Actions(webDriver);
		webDriver.navigate().to("http://demoqa.com/droppable/");
		// wait.until(true);
		WebElement e = webDriver.findElement(By.cssSelector("#draggableview > p"));
		WebElement e2 = webDriver.findElement(By.cssSelector("#droppableview"));
		builder.moveToElement(e).clickAndHold(e).moveToElement(e2).release().perform();

		test.log(Status.INFO, "this moves an element ");

		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "Succesful move");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "Succesful move"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void drag() {

		test = report.createTest("The drag Test " + 3);

		Actions builder = new Actions(webDriver);
		webDriver.navigate().to("http://demoqa.com/draggable/");
		WebElement e3 = webDriver.findElement(By.cssSelector("#draggable > p"));
		builder.moveToElement(e3).dragAndDropBy(e3, 150, 150).perform();
		assertEquals("Dropped!", (webDriver.findElement(By.cssSelector("#droppableview > p")).getText()));

		test.log(Status.INFO, "this Dragos and Drops an Element ");

		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "Drag Succesful");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "Drag Succesful"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Test

	public void reSize() {
		test = report.createTest("re-size an element Test " + 4);
		Actions builder = new Actions(webDriver);
		webDriver.navigate().to("http://demoqa.com/resizable/");
		WebElement e4 = webDriver.findElement(By.cssSelector(
				"#resizable >div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		builder.moveToElement(e4).dragAndDropBy(e4, 150, 150).perform();

		test.log(Status.INFO, "this clicks on an element then re-sizes it");

		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "re-size Succesful");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "re-size Succesful"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void click() {
		test = report.createTest("Click an Element Test " + 5);
		Actions builder = new Actions(webDriver);
		webDriver.navigate().to("http://demoqa.com/selectable/");
		WebElement e5 = webDriver.findElement(By.cssSelector("#ui-id-2"));
		builder.moveToElement(e5).click(e5).perform();
		WebElement e6 = webDriver.findElement(By.cssSelector("#selectable_grid > li:nth-child(7)"));
		builder.moveToElement(e6).click(e6).perform();
		test.log(Status.INFO, "this clicks on an element then re-sizes it");

		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "click  Succesful");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "click Succesful"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void dateSelect() {
		test = report.createTest("data Select Test " + 6);
		Actions builder = new Actions(webDriver);
		webDriver.navigate().to("http://demoqa.com/datepicker/");
		WebElement e9 = webDriver.findElement(By.cssSelector("#datepicker1"));
		builder.moveToElement(e9).click(e9).perform();
		WebElement e10 = webDriver.findElement(By.cssSelector("#ui-datepicker-div"));
		WebElement e11 = webDriver.findElement(
				By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(5) > td:nth-child(4) > a"));
		builder.moveToElement(e10).moveToElement(e11).click(e11).perform();

		test.log(Status.INFO, "selects the date from a drop down list ");

		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "date select  Succesful");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "date select Succesful"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Test
	public void slider() {
		test = report.createTest("slider Test " + 7);
		Actions builder = new Actions(webDriver);
		webDriver.navigate().to("http://demoqa.com/slider/");
		WebElement e14 = webDriver.findElement(By.cssSelector("#slider-range-max > span"));
		builder.moveToElement(e14).clickAndHold(e14).moveByOffset(100, 0).release().perform();
		// #slider-range-max > span

		try {
			Screenshot.take(webDriver, "slider  Succesful");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "slider Succesful"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		test.log(Status.INFO, "using the Slider ");

		test.pass("Passed");
	}

	@Test
	public void move() throws AWTException {
		test = report.createTest("Moving Mouse to Menu Test " + 8);
		Actions builder = new Actions(webDriver);
		Robot r = new Robot();
		webDriver.navigate().to("http://demoqa.com/menu/#");
		WebElement e12 = webDriver.findElement(By.cssSelector("#ui-id-2"));
		builder.moveToElement(e12).click(e12).perform();
		r.mouseMove(650, 400);

		// click and hold on position of home then move mouse across
		WebElement e13 = webDriver.findElement(By.cssSelector("#navigate > ul > li:nth-child(1) > a"));
		// builder.moveToElement(e13).clickAndHold().perform();
		r.mouseMove(700, 400);
		r.mouseMove(710, 400);
		r.mouseMove(720, 400);
		r.mouseMove(730, 400);
		r.mouseMove(740, 400);
		test.log(Status.INFO, "This test Moved the mouse to hover over a menu to see a sub menu");

		test.pass("Passed");

		try {
			Screenshot.take(webDriver, "Menu");
			test.addScreenCaptureFromPath(Screenshot.take(webDriver, "Menu"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		test.log(Status.INFO, "moving the mouse ");

		test.pass("Passed");
	}

	@After
	public void clearTests() {

		webDriver.quit();
		report.flush();
	}

	public enum ReportType {
		HTML;
	}

}
