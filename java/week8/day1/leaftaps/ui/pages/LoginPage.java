package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
public LoginPage(RemoteWebDriver receivedDriver) {
	this.driver=receivedDriver;
	}
public LoginPage enterUsername(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
	return this;
}
public LoginPage enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
	return this;

}
public WelcomePage clickLogin_positive() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage(driver);
}
public LoginPage clickLogin_Nagative() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return this;
}
}

