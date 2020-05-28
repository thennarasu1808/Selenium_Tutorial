package schedule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement calendarLink=driver.findElement(By.xpath("//img[@src='images/calendar-icon.png']"));
		calendarLink.click();
		WebElement calendar=driver.findElement(By.xpath("//input[@id='datepicker']"));
		calendar.click();
		WebElement date=driver.findElement(By.xpath(" //a[contains(text(),'1')]"));
		date.click();
		calendar.click();
		Thread.sleep(3000);
	
		int i=0;
		for(i=0;i<4;i++) {
			WebElement datePrev=driver.findElement(By.xpath(" //a[@title='Prev']"));
				datePrev.click();
				Thread.sleep(2000);
					}
		WebElement dateSep=driver.findElement(By.xpath(" //a[contains(text(),'12')]"));
		dateSep.click();

}
}
