package leaftaps.ui.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week8.day1.leaftaps.ui.pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc001";
	}

	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String CompanyName, String FirstName, String lastname) {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLogin_positive().clickCRMSFA()
				.clickLeads().clickCreateLead().enterCompanyName(CompanyName).enterFirstName(FirstName)
				.enterLastName(lastname).clickCreateLead().getLeadID();

	}

}
