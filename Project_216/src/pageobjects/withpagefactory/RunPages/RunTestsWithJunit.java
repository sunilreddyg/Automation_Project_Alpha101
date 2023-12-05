package pageobjects.withpagefactory.RunPages;

import org.junit.jupiter.api.Test;
import pageobjects.withpagefactory.Keywords.TestBase;
import pageobjects.withpagefactory.Testcases.PIM_Tests;

class RunTestsWithJunit extends TestBase
{
	
	public RunTestsWithJunit() 
	{
		Setupchrome();
	}

	@Test
	void test() 
	{
		PIM_Tests test=new PIM_Tests(driver);
		test.addinginvalidemployeename();
	}

}
