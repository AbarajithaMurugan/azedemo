package org.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before
public static void beforeone() { 
	System.out.println("Before----");
}
@After
public static void afterone(Scenario sc) {
	TakesScreenshot ts=( TakesScreenshot)driver;
	byte[] as = ts.getScreenshotAs(OutputType.BYTES);
	
		sc.embed(as, "ook.png");
		
	
}
}
