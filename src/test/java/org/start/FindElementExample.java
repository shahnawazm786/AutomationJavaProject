package org.start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findElement()
		//findElements()
		// by id  - fastest
		//  by name - 2 fastest name
		// class name  - 3 fastest
		// xpath - 
		// Link
		// Partial Text Link
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userNameElement;
		try {
			userNameElement= driver.findElement(By.name("username1"));
		}catch(NoSuchElementException nse) {
			System.out.println("Element found !!!");
			userNameElement = driver.findElement(By.name("username"));
		}
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		WebElement btnLoginElement = driver.findElement(By.cssSelector(".orangehrm-login-button"));
		
		userNameElement.clear();
		passwordElement.clear();
		userNameElement.sendKeys("Admin");
		passwordElement.sendKeys("admin123");
		btnLoginElement.click();
		WebElement dashborad = driver.findElement(By.cssSelector(".oxd-topbar-header-breadcrumb-module"));
		String dashString=dashborad.getText();
		if(dashString.equals("Dashboard")) {
			System.out.println("Test Passs");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.manage().deleteAllCookies();
		//driver.close(); close all the browser which is opened in current session
		driver.quit(); // the current one browser where your control is 
	}

}
