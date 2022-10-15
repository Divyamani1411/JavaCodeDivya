package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.ID, using = "username")
	private WebElement elementUsername;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement elementPassword;
	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement elementLogin;

	public LoginPage enterUsername(String username) {
		elementUsername.sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		elementPassword.sendKeys(password);
		return this;
	}

	public WelcomePage clickLogin_positive() {
		elementLogin.click();
		return new WelcomePage(driver);
	}

	public LoginPage clickLogin_Nagative() {
		elementLogin.click();
		return this;
	}
}
