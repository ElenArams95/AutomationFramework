package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class RegistrationPage extends BasePage<RegistrationPage> {
	@FindBy(css = "input[class=\"form-control required email\"]")
	private WebElement loginField;

	@FindBy(css = "input[class=\"form-control required\"]")
	private WebElement passwordField;

	@FindBy(css ="div[class=\"sign-in j-newto-shein\"] input[name=\"cfPassword\"]")
	private WebElement repeatPasswordField;

	@FindBy(css = "div.accept-btn > button")
	private WebElement acceptButton;

	@FindBy(css = "button[id=\"btn-register\"]")
	WebElement registrationButton;

	public RegistrationPage(WebDriver driver){
		super(driver, "https://login20.monster.com/Become-Member/Create-Account?landedFrom=Header&ch=MONS&intcid=skr_navigation_www_create-account");
	}

	public void closePopUp(){
		acceptButton.click();
	}

//	private String getEMailAddress() throws IOException {
//		return MailReader.getCridential("address");
//	}

	public void setEmailAddress(String emailAddress) throws IOException {
		loginField.click();
		writeText(loginField, emailAddress);
	}

	public void setPassword(String passwordValue){
		passwordField.click();
		writeText(passwordField, passwordValue);
	}

	public void repeatPassword(String passwordValue){
		writeText(repeatPasswordField, passwordValue);
	}

//	public void selectCheckboxes(WebDriver driver, int...checkboxes) {
//		String generalCheckboxPath = ".prefer-item:nth-child(%d) > .she-checkbox";
//
//		for (int checkbox: checkboxes){
//			String checkboxPath = String.format(generalCheckboxPath,checkbox);
//			WebElement checkboxElement = driver.findElement(By.cssSelector(checkboxPath));
//			if (waitHelper.isElementIsClickable(driver, checkboxElement)) {
//				checkboxElement.click();
//			}
//		}
//	}

	public void clickOnRegisterButton(){
		registrationButton.click();
	}
}
