package comcast.vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ITestListnersImplementation implements ITestListener {
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		// Step 3: Create a test method during the test execution start
		test= report.createTest(result.getMethod().getMethodName());
	
	}
	
	public void onTestSuccess(ITestResult result) {
		// Step 4: Log the pass method
		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		// Step 5 : Take Screenshot
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		String filePath= null;
		try
		{
			filePath= new WebDriver_Utility().takeScreenShot(driver, result.getMethod().getMethodName());
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath);
		
	}
	public void onTestSkipped(ITestResult result) {
		// step 6 : log the skip
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());
	
	}
	public void onStart(ITestContext context) {
		// Step 1 : Extend report
		Date d= new Date();
		System.out.println(d);
		String date= d.toString().replace(" ", " ").replace(":", "-");
		ExtentSparkReporter htmlReport= new ExtentSparkReporter(new File("extentreport.html"));
		htmlReport.config().setDocumentTitle("Extend Report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Functional Testing");
		
		/* 
		 * Step 2
		 * Attach the physical report and do system confirguation
		 */
		report = new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("OS", "Window11");
		report.setSystemInfo("Enviroment", "Testing Enviroment");
		report.setSystemInfo("URL", "http://localhost:8888");
		report.setSystemInfo("Reporter Name", "Shilpa");
	}
	public void onFinish(ITestContext context) {
		// Step 7 on finish
		report.flush();// any previous data will get cleared 
		
	}

}
