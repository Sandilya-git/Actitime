package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
public class BaseClass {
	public WebDriver driver;
	public FileLib f=new FileLib();
	@Parameters("browser")
	@BeforeTest
public void openBrowser(String browser) throws IOException {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}else {
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String url = f.getPropertyData("url");
	driver.get(url);
}
	@BeforeMethod
public void login() throws IOException {
	LoginPage l=new LoginPage(driver);
	String un = f.getPropertyData("un");
	String pwd =  f.getPropertyData("pwd");
	l.login(un,pwd);
}
	@AfterMethod
public void logout() {
	HomePage h=new HomePage(driver);
	h.setLogout();
}
	@AfterTest
public void closeBrowser() {
	driver.quit();
}
}
