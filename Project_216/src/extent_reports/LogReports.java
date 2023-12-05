package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LogReports {

	public static void main(String[] args) 
	{
		String filepath="TestData//report4.html";
		ExtentReports reporter=new ExtentReports(filepath, true);
				
				//Creating new test under extent reports
				ExtentTest test1=reporter.startTest("Login Valid");
				
					//Reporting systnax at statemet level
					test1.log(LogStatus.INFO, "Browser is up and ready to use");
					test1.log(LogStatus.FAIL, "Login Failed");
		
				reporter.endTest(test1);
				
				
				//Creating new test under extent reports
				ExtentTest test2=reporter.startTest("Login Invalid");
					//Reporting systnax at statemet level
					test2.log(LogStatus.INFO, "Browser is up and ready to use");
					test2.log(LogStatus.PASS, "Error message displayed");
				reporter.endTest(test2);
		
		reporter.flush();

	}

}
