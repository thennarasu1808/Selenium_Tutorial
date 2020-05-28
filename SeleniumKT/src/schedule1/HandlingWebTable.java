package schedule1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.leafground.com/");
		// driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement tableLink = driver.findElement(By.xpath("//img[@src='images/table.png']"));
		tableLink.click();

		// Finding no of columns
		List<WebElement> tableColumn = driver.findElements(By.tagName("th"));
		int noOfColumns = tableColumn.size();
		System.out.println("No of columns :" + noOfColumns);

		// Finding no of Rows
		List<WebElement> tableRows = driver.findElements(By.tagName("tr"));
		int noOfRows = tableRows.size();
		System.out.println("No of Rows :" + noOfRows);

		// Find progress for Percentage of Learn to interact elements
		WebElement progress = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following::td[1]"));
		String percentageOfLTI = progress.getText();
		System.out.println("Percentage of Learn to interact elements: " + percentageOfLTI);

		/*
		 * WebDriverWait wait=new WebDriverWait(driver,20);
		 * 
		 * WebElement checkBox =wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//td[normalize-space()= \"30%\" ] //following::td[1]")));
		 * checkBox.click();
		 */

		// click the check box which has the least progress

		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> eachValue = new ArrayList<Integer>();
		for (WebElement webElement : allprogress) {

			String invidualValue = webElement.getText().replace("%", "");
			eachValue.add(Integer.parseInt(invidualValue));
		}
		System.out.println("Final list: " + eachValue);
		int smallValue = Collections.min(eachValue);
		System.out.println("SmallValue: " + smallValue);

		String smallvalueString = Integer.toString(smallValue) + "%";
		String finalXpath = "//td[normalize-space()= " + "\"" + smallvalueString + "\"" + " ]" + " //following::td[1]";
		System.out.println(finalXpath);

		WebElement checkBox = driver.findElement(By.xpath(finalXpath));
		Thread.sleep(4000);
		checkBox.click();
		
		

	}

}
