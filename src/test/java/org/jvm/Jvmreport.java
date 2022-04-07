package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
	
	public static void jvmReportGenerator(String json) {
		File f=new File("C:\\Users\\Sabarish\\eclipse-workspace\\MyProjectAsl\\Reports\\JVMReport");
		Configuration c= new Configuration(f,"Travel Appllication");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("browser","Chrome");
		c.addClassifications("Tool","Selenium with java");
		List<String>l=new LinkedList<String>();
		l.add(json);
		ReportBuilder r=new ReportBuilder(l,c);
		r.generateReports();
		
	}

}
