package schedule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement editButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
		editButton.click();
		System.out.println("Clicked the Edit button");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		Thread.sleep(3000);
		emailTextBox.sendKeys("thennarasu");
		System.out.println("entered email address");
		Thread.sleep(2000);
		WebElement appendText = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendText.sendKeys("My Text");
		System.out.println("Appended the new text");
		Thread.sleep(2000);

		WebElement getAttribTest = driver.findElement(By.name("username"));
		String value1 = getAttribTest.getAttribute("value");
		System.out.println("Attribute value is "+value1);
		Thread.sleep(2000);
		
		WebElement clearTestBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearTestBox.clear();
		System.out.println("Text field is cleared");
		WebElement disabledTextBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean disabled=disabledTextBox.isEnabled();
		System.out.println(disabled);
		driver.close();

	}

}
