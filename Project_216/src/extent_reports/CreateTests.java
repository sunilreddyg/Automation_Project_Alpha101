package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class CreateTests {

	public static void main(String[] args) {
		
		
		String filepath="TestData//report2.html";
		ExtentReports reporter=new ExtentReports(filepath, true);
				
				//Creating new test under extent reports
				ExtentTest test1=reporter.startTest("Login Valid");
		
				reporter.endTest(test1);
				
				
				//Creating new test under extent reports
				ExtentTest test2=reporter.startTest("Login Invalid");
		
				reporter.endTest(test2);
		
		reporter.flush();
	}

}
