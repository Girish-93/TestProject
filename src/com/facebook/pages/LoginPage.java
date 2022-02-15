package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();

	}

	// Click Email or Phone
	public void clickEmailOrPhone() {
		ClickOnWebElement("Email");
	}

	// Enter UserName
	public void enterUsername() {
		enterData("Email", "abc@gmail.com");
	}

	// Click Password
	public void clickPassword() {
		ClickOnWebElement("Password");
	}

	// Enter Password
	public void enterPassword() {
		enterData("Password", "12345");
	}

	// Click Password
	public void clickLoginButton() {
		ClickOnWebElement("LoginButton");
	}

}
