package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");

		// Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames available on webpage :- " + allFrames.size());

		for (int i = 0; i < allFrames.size(); i++) {
			driver.switchTo().frame(i);
			if (driver.findElement(By.id("draggable")).isDisplayed()
					&& driver.findElement(By.id("droppable")).isDisplayed()) {

				Thread.sleep(3000);
				Actions act = new Actions(driver);
				act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build()
						.perform();
				System.out.println("Element Found in " + (i + 1) + " frame");
			}
		}

	}
}
