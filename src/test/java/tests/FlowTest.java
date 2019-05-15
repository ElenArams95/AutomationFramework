package tests;

import org.testng.annotations.Test;
import com.pages.*;
import tests.BaseTest;

import java.io.IOException;

public class FlowTest extends BaseTest {
	@Test
	public void flow() throws IOException {
		RegistrationPage loginPage = new RegistrationPage(getBaseDriver());

		//Set Email Credentials
		loginPage.setEmailAddress("kukuku@test.test");
		loginPage.setPassword("Password123");

		//Register
		loginPage.clickOnRegisterButton();
	}
}
