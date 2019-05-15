package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage<T extends LoadableComponent<T>> extends LoadableComponent<T>{
	public WebDriver driver;
	private WebDriverWait wait;
	private String pagePath;
	private Configs configs = new Configs();
	private String serverUrl = configs.get("serverUrl");

	//Constructor
	BasePage(WebDriver driver, String path){
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
		this.pagePath = path;
		PageFactory.initElements(driver, this);
		driver.get(pagePath);
	}

	private void init(WebDriver currentDriver) {
		driver = currentDriver;
		wait = new WebDriverWait(driver, 30);
	}

	//Write Text
	void writeText (WebElement elementLocation, String text) {
		elementLocation.sendKeys(text);
	}

	//Read Text
	public String readText (By elementLocation) {
		return driver.findElement(elementLocation).getText();
	}

	@Override
	protected void load() {

	}

	@Override
	protected void isLoaded() throws Error {
		assert !isOnPage() || (driver.getCurrentUrl() != null) : "The page is not loaded";
	}

	private boolean isOnPage() {
		String url = driver.getCurrentUrl();
		return url.endsWith(pagePath);
	}
}