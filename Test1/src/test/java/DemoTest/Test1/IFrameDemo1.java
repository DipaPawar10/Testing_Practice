package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximise browser
				driver.manage().window().maximize();
				//open url
				driver.get("https://www.rediff.com/");
				
				//switch to iframe moneyiframe
				driver.switchTo().frame("moneyiframe");
				
				//find web element & print value
				String nseindex = driver.findElement(By.id("nseindex")).getText();

				System.out.println(nseindex);

	}

}
