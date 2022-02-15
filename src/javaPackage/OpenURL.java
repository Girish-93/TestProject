package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");

		// Launching chrome browser instance
		WebDriver driver = new ChromeDriver();

		// manage() method
		driver.manage().window().maximize();

		// Open url of application using get() and navigate() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");

		// Refresh the Page
		Thread.sleep(3000);
		driver.navigate().refresh();

		// Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();

		// Navigate to forward
		Thread.sleep(3000);
		driver.navigate().forward();

		// Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();

		// Getting Current URL
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// Get Title of the web page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		// Close the current browser instance
		Thread.sleep(3000);
		driver.close();

		// Closing all browser instance
		Thread.sleep(3000);
		driver.quit();

	}

}
