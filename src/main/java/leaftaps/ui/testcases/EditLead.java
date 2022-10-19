package leaftaps.ui.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week8.day1.leaftaps.ui.pages.LoginPage;

public class EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc003";
	}

	@Test(dataProvider="sendData")
	public void runEditLead(String username,String password,String phone) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLogin_positive().clickCRMSFA().clickLeads().clickFindLeads().clickPhone().enterPhoneNumber(phone).clickFindLeadsButton().clickEdit().enterCompanyName().clickUpdate();
System.out.println("gitup changing for my learn");
}
}
