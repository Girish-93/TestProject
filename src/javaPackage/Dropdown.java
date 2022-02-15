package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching chrome browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);

		// 1st way - Not recommended but mostly used in industry
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown Values are :- " + birthMonth.size());
		birthMonth.get(8).click(); // August
		System.out.println(birthMonth.get(1).isEnabled()); // True

		// 2nd way - Recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		// Will use Select class constructor
		Select month = new Select(bm); // Parameterized Constructor
		// Select by Visible Text
		month.selectByVisibleText("Apr"); // Apr
		// Select by Value
		month.selectByValue("12"); // Dec
		// Select by index
		month.selectByIndex(10); // Oct
		// Get current selected value from dropdown
		System.out.println(month.getFirstSelectedOption().getText());

		// 3rd Way - Will store all dropdown values in a list
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values are :- " + dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			String dropdownValues = dropdown.get(i).getText();
			if (dropdownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
			}
		}

		// 4th way - Checking the dropdown is supporting multiple selection or not
		System.out.println(month.isMultiple()); // false
		month.selectByIndex(2);
		month.selectByIndex(5);
		month.selectByVisibleText("Dec");

		// Deselecting the selected value
		month.deselectByIndex(2);
		month.deselectByIndex(5);
		month.deselectByVisibleText("Dec");
		month.deselectAll();

		// 5th way
		bm.sendKeys("Feb");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

	}

}
