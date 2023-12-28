package com.Stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.IPT_QA1_Goibibo.base.BaseClass;

public class StepDefinition extends BaseClass {
	
	public StepDefinition () {
		PageFactory.initElements(driver, this);
	}

}
