package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.global.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\home\\eclipse-workspace\\CucumberWebsite\\src\\test\\resources\\ecommerce.feature"}, glue= {"com.steps"}, plugin = {"pretty", "json:src\\test\\resources\\CucumberReport\\reportcu.json"}, monochrome = true, dryRun= false)
public class TestRunner{

	@AfterClass
	public static void afterTestRunner() {
	JVMReport.generateJVMReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\CucumberReport\\reportcu.json");
	
	}
	
}
