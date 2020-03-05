package selenium;

import org.testng.annotations.Test;
import selenium.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	@Test
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/chromedriver_win32/chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		wb.get("http://www.google.com");
		System.out.println("Browser Opened");
	
		
	}

}
