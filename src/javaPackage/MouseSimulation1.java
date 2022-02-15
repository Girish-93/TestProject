package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

		// Creating Web Element Reference
		WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));

		// Mouse Simulation using Actions class
		Actions act = new Actions(driver);

		// Mouse Hover to ELectronics Web Element
		Thread.sleep(3000);
		act.moveToElement(Electronics).build().perform();

		// Right click on Web Element
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();

		// Release control from Electronics
		Thread.sleep(3000);
		act.release(Electronics).build().perform();

		// Perform Key Events
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Entered");

		// Press Enter key to Home Web ELement
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.xpath("//div[text()='Home']"));
		Thread.sleep(3000);
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("Home Menu Clicked");

	}

}
