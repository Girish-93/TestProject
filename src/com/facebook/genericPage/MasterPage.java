package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {

	public static WebDriver driver;
	public Properties config;
	public Properties loc;

	// Constructor
	public MasterPage() throws Exception {

		// Configure Properties File
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");
		config = new Properties();
		config.load(ip);

		// Locators Properties File
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");
		loc = new Properties();
		loc.load(fs);

		if (config.getProperty("browser1").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\com\\facebook\\drivers\\chromdriver.exe");
			driver = new ChromeDriver();
		}

		else if (config.getProperty("browser2").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\com\\facebook\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	// Click On Web Element
	public void ClickOnWebElement(String Xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(Xpathkey))).click();
	}

	// Enter Data
	public void enterData(String Xpathkey, String data) {
		driver.findElement(By.xpath(loc.getProperty(Xpathkey))).sendKeys(data);
	}
}
