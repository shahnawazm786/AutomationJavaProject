package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/documentation/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/documentation/overview/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
	}

}
