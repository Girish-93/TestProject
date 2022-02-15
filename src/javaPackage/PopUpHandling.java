package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		// Print how many Windows are opened
		Thread.sleep(3000);
		Set<String> PopUpID = driver.getWindowHandles();
		System.out.println(PopUpID);
		System.out.println(PopUpID.size());

		Iterator<String> abc = PopUpID.iterator();
		String Window1 = abc.next();
		String Window2 = abc.next();
		String Window3 = abc.next();
		String Window4 = abc.next();

		// Print the title of PopUp Window 2
		driver.switchTo().window(Window2);
		System.out.println(Window2); // Alphanumeric ID of PopUp Window 2
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// Print the title of PopUp Window 3
		driver.switchTo().window(Window3);
		System.out.println(Window3); // Alphanumeric ID of PopUp Window 3
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// Print the title of PopUp Window 4
		driver.switchTo().window(Window4);
		System.out.println(Window4); // Alphanumeric ID of PopUp Window 4
		System.out.println(driver.getTitle());
		Thread.sleep(3000);

		// Print the title of PopUp Window 1
		driver.switchTo().window(Window1);
		System.out.println(Window1); // Alphanumeric ID of PopUp Window 1
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
