package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;

public class UserModule extends BaseClass {
	@Test
public void addUser() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.setUser();
		Thread.sleep(2000);
}
}
