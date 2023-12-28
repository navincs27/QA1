package com.Stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.IPT_QA1_Goibibo.base.BaseClass;

import io.cucumber.java.en.Given;

public class StepDefinition extends BaseClass {
	
	public StepDefinition () {
		PageFactory.initElements(driver, this);
	}
	@Given("user launch the url {string}")
	public void user_launch_the_url(String string) {
	    
	}

	@Given("user click login")
	public void user_click_login() {
	    
	}
}
