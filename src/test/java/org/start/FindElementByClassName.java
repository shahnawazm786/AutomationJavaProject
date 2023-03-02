package org.start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipseworkspace\\SeleniumProject\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.cssSelector("input.gLFyf"));
		search.sendKeys("KAZ - IT Training Hub");
		search.sendKeys(Keys.ENTER);
		
	}

}
