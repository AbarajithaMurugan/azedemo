package org.test;

import org.base.JvmReporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.step", monochrome = true, tags = "@reg and @sanity", plugin = {
		"pretty",
		"html:C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\AzarJiDemo\\src\\test\\resources\\Report\\Html",
		"json:C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\AzarJiDemo\\src\\test\\resources\\Report\\JSON\\az.json",
		"junit:C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\AzarJiDemo\\src\\test\\resources\\Report\\XML rep\\jun.xml",
		"json:src\\test\\resources\\Report\\JVMReport\\jvmrep.json" })
public class TestRunner {
	@AfterClass
	public static void report() {
		JvmReporting.generateReport(
				"C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\AzarJiDemo\\src\\test\\resources\\Report\\JVMReport\\jvmrep.json");
	}
}