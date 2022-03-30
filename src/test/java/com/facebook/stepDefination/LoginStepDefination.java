package com.facebook.stepDefination;

import org.openqa.selenium.By;

import com.facebook.pageObject.LoginPage;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination extends LoginPage {

	LoginPage loginPage = new LoginPage();

	@Given("^I am a user of facebook applications$")
	public void i_am_a_user_of_facebook_application() throws Throwable {
		loginPage.openUrl();
	}

	@When("^User enter valid Username (.*)$")
	public void user_enter_valid_Username(String userName) throws Exception {
	loginPage.userName(userName);
	}

	@When("^User enter valid Password (.*)$")
	public void user_enter_valid_Password(String passWord) throws Exception {

		loginPage.password(passWord);

	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		loginPage.loginButton();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		loginPage.verifyLogin();
	}

	@When("^User click on create new account button$")
	public void user_click_on_create_new_account_button() throws Throwable {
		loginPage.createNewAccount();
		
	}

	@Then("^User should be able to signup successfully$")
	public void user_should_be_able_to_signup_successfully() throws Throwable {
		loginPage.verifySignup();
	}
}
