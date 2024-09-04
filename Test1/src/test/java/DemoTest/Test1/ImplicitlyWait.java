package DemoTest.Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.ebay.in/");
		
		//wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Stopwatch watch= null;
		
		try {
		watch=Stopwatch.createStarted();
		driver.findElement(By.linkText("START SELLING")).click();
		}
		catch(Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "Seconds");
		}
	}

}
