package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.Jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.step",dryRun=false,monochrome=true,strict=true,tags="@sanity", plugin={"pretty",
		"html:C:\\Users\\Sabarish\\eclipse-workspace\\MyProjectAsl\\Reports\\HTMLReport",
		"json:C:\\Users\\Sabarish\\eclipse-workspace\\MyProjectAsl\\Reports\\JSONReport\\jsonreport.json",
		"junit:C:\\Users\\Sabarish\\eclipse-workspace\\MyProjectAsl\\Reports\\JUNITReport\\junitreport.xml",
		"return:C:\\Users\\Sabarish\\eclipse-workspace\\MyProjectAsl\\Failurescenarios\\failures.txt"
})

public class TestRunner 
{
@AfterClass
public static void jvm() 
{
	Jvmreport.jvmReportGenerator("C:\\Users\\Sabarish\\eclipse-workspace\\MyProjectAsl\\Reports\\JSONReport\\jsonreport.json");
}
}
