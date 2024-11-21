package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(enabled=false)
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		String customerName = f.getExcelData("createCustomer", 1, 2);
		String description = f.getExcelData("createCustomer", 1, 3);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t =new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getCustNameTbx().sendKeys(customerName);
		t.getCustDescTbx().sendKeys(description);
		t.getCustDropdown().click();
		t.getOurCompOpt().click();
		t.getCreateCustBtn().click();Thread.sleep(2000);
		WebElement createdCust = t.getCreatedCustHeading();
		System.out.println(createdCust.getText());  Thread.sleep(1000);
}
	@Test
	public void deleteCustomer() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.setTask();
		Thread.sleep(2000);
	}
}