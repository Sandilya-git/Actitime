package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath ="//div[text()='+ New Customer']" )
private WebElement newCustBtn;
@FindBy(id="customerLightBox_nameField")
private WebElement custNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement custDescTbx;
@FindBy(xpath = "//button[contains(text(),'Select an active customer')]")
private WebElement custDropdown;
@FindBy(xpath = "//a[text()='Our Company']")
private WebElement ourCompOpt;
@FindBy(id="customerLightBox_commitBtn")
private WebElement createCustBtn;
@FindBy(xpath ="//a[text()='All Customers']/../../div[@class='title ellipsis']" )
private WebElement createdCustHeading;
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustBtn() {
	return newCustBtn;
}
public WebElement getCustNameTbx() {
	return custNameTbx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getCustDropdown() {
	return custDropdown;
}
public WebElement getOurCompOpt() {
	return ourCompOpt;
}
public WebElement getCreateCustBtn() {
	return createCustBtn;
}
public WebElement getCreatedCustHeading() {
	return createdCustHeading;
}

}
