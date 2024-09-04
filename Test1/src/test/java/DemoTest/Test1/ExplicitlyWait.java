package DemoTest.Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.ebay.in/");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		Stopwatch watch =null;
		
		try {
			watch=Stopwatch.createStarted();
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			element.click();
		}catch(Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "Seconds");
			
			
		}
		
	}

}
