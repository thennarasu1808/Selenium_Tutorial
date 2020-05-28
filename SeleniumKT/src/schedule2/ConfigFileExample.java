package schedule2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigFileExample {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop =new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\tkarunakaran\\eclipse-workspace\\SeleniumKT\\config\\configuration.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Gecko_Firefox\\geckodriver.exe");
			  driver = new FirefoxDriver();
	}
		driver.get(prop.getProperty("url"));
driver.findElement(By.xpath("//li[22]//a[1]")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 20);
		String hiddenButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn']"))).getText();
		System.out.println(hiddenButton);
		
	}
}
