package schedule1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a/img"));
		dropDownButton.click();
		System.out.println("Clicked the DropDown Button");
		
		WebElement dropDown1= driver.findElement(By.id("dropdown1"));
		Select drpdwn= new Select(dropDown1);
		drpdwn.selectByVisibleText("Appium");
	
		WebElement multipleDropDwn=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select mulitpleBox=new Select(multipleDropDwn);
		mulitpleBox.selectByIndex(2);
		mulitpleBox.selectByValue("4");
		
		List<WebElement> noOfOptiuons=	drpdwn.getOptions();
		int size=noOfOptiuons.size();
		System.out.println("No of Options:" +size);
		
		driver.navigate().back();
	}
	
	
	

}
