package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		// Introducing JavascriptExecutor Interface and casting the interfaces
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate Web Element using JavaScript and send data into input box
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='12345678'");
		
		//Click on Login button using Java Script
		//jse.executeScript("document.getElemetById('u_0_d_KA').click()");

		// Scroll down using JavaScript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, 400)");

		// Scroll Up using JavaScript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -400)");

	}

}
