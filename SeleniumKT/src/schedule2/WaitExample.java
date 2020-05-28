package schedule2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[22]//a[1]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		String hiddenButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn']"))).getText();
		System.out.println(hiddenButton);
		
		WebElement btnVoila=driver.findElement(By.xpath("//button[@id='btn']"));
		btnVoila.click();
		//String hiddenButton=btnVoila.getText();
		//System.out.println(hiddenButton);
		
		}

}
