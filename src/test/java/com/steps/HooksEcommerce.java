package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksEcommerce extends LibraryClass {
 
	@Before
	public void LaunchBrowser() {
		browserLaunch();
	}
	
	@After
	public void CloseBrowser(Scenario sc) {
		Status st = sc.getStatus();
		System.out.println(st);
		
		if(sc.isFailed()) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		byte[] bt = tk.getScreenshotAs(OutputType.BYTES);
		sc.embed(bt, "ScenarioScrnShot/png");
	}
	}

	

	
}
