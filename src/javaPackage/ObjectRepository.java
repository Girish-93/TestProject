package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {

		ObjectRepository objectRepo = new ObjectRepository();

		// Specify the properties file location
		File src = new File("D:\\JavaWorkspace\\Online_Java_Training_5_Apr_2021\\Repository\\Object_Repo.properties");

		// Create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);

		// Create properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);

		// Setting the browser property and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objectRepo.hitURL(driver, pro.getProperty("URL1"));
		objectRepo.hitURL(driver, pro.getProperty("URL"));
		Thread.sleep(3000);

		// getProperty() method accept key and it returns value for the same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(3000);
		driver.quit();

	}

	// Hit URL
	public void hitURL(WebDriver driver, String urlAddress) {
		driver.get(urlAddress);
	}

}
