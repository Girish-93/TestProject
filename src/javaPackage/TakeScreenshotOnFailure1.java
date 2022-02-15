package javaPackage;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {

	WebDriver driver;

	public void captureScreenshot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			// Create Reference of TakeScreenshot interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver; // Type Casting of 2 interfaces

			// Use getScreenshotAs() method to capture the screenshot in File format
			// getScreenshotAs() method return type is FILE
			File source = ts.getScreenshotAs(OutputType.FILE);

			// Copy File to specific location
			//FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
			System.out.println(result.getName() + " method() Screenshot Captured");
		}
}}
