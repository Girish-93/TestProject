package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching chrome browser instance
		driver.manage().window().maximize(); // maximize the window

		// Introducing Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Thread.sleep(20000);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works");

		// How to handle auto suggestion
		WebElement AllSuggestion = driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> AllSearch = AllSuggestion.findElements(By.tagName("li"));
		System.out.println("Total Auto Suggestion Displayed : " + AllSearch.size());

		for (int i = 0; i < AllSearch.size(); i++) {

			String AllSuggestionList = AllSearch.get(i).getText();
			String FinalResult = "how stuff works quiz";

			if (AllSuggestionList.equalsIgnoreCase(FinalResult)) {
				AllSearch.get(i).click();
				System.out.println("You have clicked on :- " + FinalResult);
				break;
			}

		}

	}
}
