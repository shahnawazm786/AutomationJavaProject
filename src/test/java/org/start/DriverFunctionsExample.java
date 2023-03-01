package org.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFunctionsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");// driver.get("web app link")
		//driver.quit();
		// Dead sleep / Dead wait
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.2");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		driver.manage().window().fullscreen();
		//driver.close();//close the browser and assigned null to driver reference 
		// close() to close the current browser
		// quit() // to close all browser 
		Thread.sleep(2000);
		/*try {
		driver.close();
		}catch(Exception ex) {
			driver.close();
		}*/
		driver.close();
	}

}
