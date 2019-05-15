package tests;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import setupClasses.DriverManager;

import java.io.*;
import java.util.concurrent.*;

public abstract class BaseTest {
	public static WebDriver driver;
	public static String userEmailAddress;

	@BeforeClass
	public void setUp() throws IOException, InterruptedException {
		driver = getDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterMethod() {
		driver.quit();
	}

	private WebDriver getDriver() {
		return new DriverManager().openDriver();
	}

	protected WebDriver getBaseDriver(){
		return driver;
	}
}
