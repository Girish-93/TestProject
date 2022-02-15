package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4J {

	public static void main(String[] args) {

		// We need to create Logger instance so we need to pass class name for which we
		// want to create log file
		Logger logger = Logger.getLogger("Log4J");

		// Configure log4j.properties file
		PropertyConfigurator
				.configure("D:\\JavaWorkspace\\Online_Java_Training_5_Apr_2021\\Repository\\log4j.properties");

		// Open Chrome Browser Instance
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Browser Instance Opened.");

		// Maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximized");

		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit Wait Given");

		// Open URL
		driver.get("https://www.facebook.com");
		logger.info("Application Launched");

	}

}
