package schedule1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement AlertButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[9]/a/img"));
		AlertButton.click();
		System.out.println("Clicked the Alert Button");
		Thread.sleep(2000);
		
		//Accept Alert
		WebElement alertBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		alertBox.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Reject an Alert
		
		WebElement rejectAlert=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		rejectAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		//Prompt alert
		//Prompt an alert before accept
				WebElement promtBox =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
				promtBox.click();
				Alert promtAlert= driver.switchTo().alert();
				Thread.sleep(2000);
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				Thread.sleep(2000);
				promtAlert.accept();
				
	}

}
