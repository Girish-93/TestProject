package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching chrome browser instance
		driver.manage().window().maximize(); // maximize the window
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();

		// 1st way - It is not a good approach to handle with multiple web elements of
		// same type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); // Click on Female Radio Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); // Click on Male Radio Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); // Click on Custom Radio Button

		// 2nd way - By creating list for all radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons = " + radios.size());

		System.out.println(radios.get(1).isEnabled()); // Male radio button is enabled or not
		System.out.println(radios.get(0).isDisplayed()); // Female radio button is displayed or not
		System.out.println(radios.get(2).isSelected()); // Custom radio button is selected or not
		Thread.sleep(3000);
		radios.get(1).click(); // Male
		Thread.sleep(3000);
		System.out.println(radios.get(2).isSelected()); // Custom radio button is selected or not

		// 3rd Way - Correct Way
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		String ExpectedResult = "Female";

		for (int i = 0; i < radios1.size(); i++) {
			if (radios1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				radios1.get(i).click();
				System.out.println(ExpectedResult + " Clicked");
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();
	}

}
