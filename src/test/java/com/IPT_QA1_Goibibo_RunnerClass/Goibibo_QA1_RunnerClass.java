package com.IPT_QA1_Goibibo_RunnerClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.IPT_QA1_Goibibo.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
						features = {"D:\\AutomationTraining\\QA1\\src\\test\\java\\com\\feature\\Goibibo_QA1.feature"},
						glue = {"com.step_definition_goibibo"}, 
						dryRun = false,
						tags = "@Login_Ibibo and @HotelSelect" ,							
						plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)
	
public class Goibibo_QA1_RunnerClass extends BaseClass {
	

public static void launchBrowser() throws InterruptedException {
		
		getDriver("chrome");
		System.out.println("Changes made by Lavanya");
		
}	


	
		
	

}
