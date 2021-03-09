package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReporting {
	
	public static void generateReport(String json) {
		File file = new File("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\AzarJiDemo\\src\\test\\resources\\Report");
		Configuration configuration=new Configuration(file, "AzarJiDemo");
		configuration.addClassifications("Sprint no", "1");
		configuration.addClassifications("OS","Windows");
		List<String> li=new ArrayList<String>();
		li.add(json);
		ReportBuilder rb=new ReportBuilder(li, configuration);
		rb.generateReports();

	}

}

