package DemoTest.Test1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximise browser
				driver.manage().window().maximize();

				//open url
				driver.get("http://www.ebay.in/");

				//fluent wait of 10 seconds

			//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
						.withTimeout(10, TimeUnit.SECONDS)
						.pollingEvery(2, TimeUnit.SECONDS)
						.withMessage("This is custom message.")
						.ignoring(NoSuchElementException.class);
				
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
				element.click();

//				Stopwatch watch = null;
		//
//				try {
//					watch = Stopwatch.createStarted();
//					//find webelement "START SELLING"
//					WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("xyz")));
//					element.click();
//					//driver.findElement(By.linkText("START SELLING")).click();
//				}
//				catch(Exception e)
//				{
//					watch.stop();
//					System.out.println(e);
//					System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
//				}
				
		

	}

}
