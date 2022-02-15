package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

		// Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames available on webpage :- " + allFrames.size());
		driver.switchTo().frame(0);

		// Will find draggable Web Element
		WebElement draggableElement = driver.findElement(By.id("draggable"));

		// Using Actions class, Drag the Element from one point to another
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggableElement, 30, 20).build().perform();

		// Drag the Web Element and Click and hold using coordinates
		Thread.sleep(3000);
		act.clickAndHold(draggableElement).dragAndDropBy(draggableElement, 30, 30).build().perform();

	}

}
