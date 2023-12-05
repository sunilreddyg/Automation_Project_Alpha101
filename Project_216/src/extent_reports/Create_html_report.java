package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_html_report {

	public static void main(String[] args) 
	{
		String filepath="TestData//report.html";
		ExtentReports reporter=new ExtentReports(filepath, true);
					//Write your Tests here
		reporter.flush();
	}

}
