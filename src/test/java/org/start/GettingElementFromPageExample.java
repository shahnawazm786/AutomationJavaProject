package org.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingElementFromPageExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		WebElement userName = driver.findElement(By.id("userName"));//get one by element
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		WebElement submitButton=driver.findElement(By.id("submit"));
		if(userName.isDisplayed())
		{
			userName.clear();
			userName.sendKeys("codingmaktab");
		}
		email.clear();
		email.sendKeys("codingmaktab@gmail.com");
		currentAddress.clear();
		currentAddress.sendKeys("New Delhi");
		permanentAddress.clear();
		permanentAddress.sendKeys("Jharkhand");
		//submitButton.clear();// org.openqa.selenium.InvalidElementStateException: invalid element state
		Thread.sleep(2000);
		//submitButton.click(); // org.openqa.selenium.ElementClickInterceptedException
		submitButton.submit();
		Thread.sleep(2000);
		//driver.close();
	}

}
