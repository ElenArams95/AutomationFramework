package setupClasses;

import com.pages.Configs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	private Browsers currentDriver = Browsers.valueOf(new Configs().get("currentDriver"));

	private WebDriver getDriver() {
		return getDrivers(currentDriver);
	}

	public WebDriver openDriver() {
		WebDriver driver = getDriver();
		driver.manage().window().maximize();
		return driver;
	}

	private WebDriver getDrivers(Browsers driver) {
		switch (driver) {
			case CHROME:
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-mac-64bit");
				return new ChromeDriver();
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver", "drivers/geckodriver-mac-64bit");
				return new FirefoxDriver();
			default:
				return null;
		}
	}
}
