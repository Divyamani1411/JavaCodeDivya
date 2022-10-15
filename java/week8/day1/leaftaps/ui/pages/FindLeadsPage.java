package week8.day1.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import leaftaps.ui.testcases.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	public FindLeadsPage(RemoteWebDriver receivedDriver) {
		this.driver=receivedDriver;
}
public FindLeadsPage clickPhone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
}
public FindLeadsPage enterPhoneNumber(String phone) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	return this;
}
public ViewLeadPage clickFindLeadsButton() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadPage(driver);
}
/*public void enterLeadId(String leadID) {
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.className("x-paging-info")).getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}*/
}

