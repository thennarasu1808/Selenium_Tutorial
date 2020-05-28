package schedule1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement framesButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[10]/a/img"));
		framesButton.click();
		System.out.println("Clicked the Frames Button");
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		WebElement clickMeButton=driver.findElement(By.id("Click"));
		clickMeButton.click();
		String expectedText="Hurray! You Clicked Me.";
		String actualText=clickMeButton.getText();
		if(expectedText.equalsIgnoreCase(actualText)) {
			System.out.println("TExt matched : Test case passed");
		}else {
			System.out.println("TExt not matched : Test case failed");
		}
	driver.switchTo().defaultContent();
	
	List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
	int allFrames=totalFrames.size();
	System.out.println("No of frames: "+allFrames);
	
	}

}
