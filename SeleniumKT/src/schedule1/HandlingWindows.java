package schedule1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement windowsBtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img"));
		windowsBtn.click();
		System.out.println("Clicked the Windows Button");
		Thread.sleep(2000);

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window title: " + driver.getTitle());
		// Clicking on dont close button
		WebElement dontCloseMe = driver.findElement(By.xpath("//*[@id=\"color\"]"));
		dontCloseMe.click();

		// Get window handles for all the windows opened
		Set<String> child = driver.getWindowHandles();

		// Put all the windows into array list
		ArrayList<String> listOfWindows = new ArrayList<>(child);

		// Switching to child 1
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println("child window1 title: " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		// Switching to child 2
		driver.switchTo().window(listOfWindows.get(2));
		System.out.println("child window2 title: " + driver.getTitle());
		Thread.sleep(2000);
		driver.close();

		// Switching to parent window
		driver.switchTo().window(parentWindow);

		int totalWindows = driver.getWindowHandles().size();
		System.out.println("No of windows: " + totalWindows);

	}

}
