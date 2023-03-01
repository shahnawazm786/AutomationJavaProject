import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipseworkspace\\SeleniumProject\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String tile=driver.getTitle();
		System.out.println(tile);
		Thread.sleep(2000);
		driver.close();
		
	}

}
