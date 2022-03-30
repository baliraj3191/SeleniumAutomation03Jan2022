package com.facebook.stepDefination;

import com.facebook.pageObject.SignUpPage;

import cucumber.api.java.en.When;

public class SignUpStepDefination extends SignUpPage {

	SignUpPage signUp=new SignUpPage();
	
	@When("^User Enter firstname (.*)$")
	public void user_Enter_firstname_Bali(String firstName) throws Throwable {
	   signUp.firstName(firstName);
	}

	@When("^User enter lastname (.*)$")
	public void user_enter_lastname_Raj(String lastName) throws Throwable {
	   signUp.lastName(lastName);
	}
}
