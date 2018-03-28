package com.example.demo.testcase;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.example.demo.page.LoginPage;

public class LoginTest extends BaseTest {
	@Autowired
	private LoginPage loginPage;
	
	@Test
	public void testLogin() {
//		loginPage.selectFrame();
//		loginPage.inputUsername("weijie_1016");
//		loginPage.inputPassword("aA111120");
		
		loginPage.inputUsername("weijie_1016")
				 .inputPassword("aA111120")
				 .clickLoginBtn()
				 .clickExitLink();
	}
}
