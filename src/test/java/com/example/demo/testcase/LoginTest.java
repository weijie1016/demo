package com.example.demo.testcase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

import com.example.demo.page.HomePage;
import com.example.demo.page.LoginPage;

public class LoginTest extends BaseTest {
	@Autowired
	private LoginPage loginPage;
//	@Autowired
//	private HomePage homePage;
	
	@Test
	public void testLogin() {
		loginPage.selectFrame();
		loginPage.inputUsername("weijie_1016");
		loginPage.inputPassword("aA111120");
	}
}
