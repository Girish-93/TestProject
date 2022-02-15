package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(3000);

		// Find out total number of frames present on web page
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);

		// Go inside each frame and check which frame has our elements
		for (int i = 0; i < totalFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video')]")).click();
		}

	}

}
