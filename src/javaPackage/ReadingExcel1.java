package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception {

		// Specify the location of Excel file
		File src = new File("C:\\Users\\Admin\\Desktop\\ShortNotes.xlsx");

		// Load File
		FileInputStream fis = new FileInputStream(src);

		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load Worksheet
		XSSFSheet sh = wb.getSheet("Interview");

		// Print the name of loaded sheet
		System.out.println(sh.getSheetName());

		// Print Username from Excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		// Print p2 from Excel sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());

		// Print total number of rows - 1st way
		System.out.println("Total Rows :- " + sh.getPhysicalNumberOfRows());

		// Print total number of rows - 2nd way
		System.out.println(sh.getLastRowNum()); // Here index will work and Output = 5
		System.out.println(sh.getFirstRowNum()); // Here index will work and Output = 0
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum()) + 1;
		System.out.println("Total Rows : " + rows); // 6

		// Print total number of rows - 3rd way
		System.out.println("Total Rows :- " + (sh.getLastRowNum() + 1));

		// Print total number of columns - 1st way
		System.out.println("Total Columns :- " + (sh.getRow(0).getPhysicalNumberOfCells()));

		// Print total number of columns - 2nd way
		System.out.println(sh.getRow(0).getLastCellNum());

		// Print total number of columns - 3rd way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total columns :- " + (columns));

		// Print all cells of excel sheet
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}

		// Setting the property of chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_V98\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Launching chrome browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");// Open URL

		// Enter Username through excel sheet
		String a = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(a);
	}

}
