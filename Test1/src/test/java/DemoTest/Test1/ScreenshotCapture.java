package DemoTest.Test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		//capture Scrrenshot of full Page 
//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
//		File scr = screenshot.getScreenshotAs(OutputType.FILE);
//		File des = new File("C:\\Users\\Lenovo\\Desktop\\Selenium_Course_Project\\Test1\\Screenshot\\Screenshot.jpeg");
//		FileUtils.copyFile(scr,des);
		
		// capture section of web page
//		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		WebElement section = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
		File scr = section.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Lenovo\\Desktop\\Selenium_Course_Project\\Test1\\Screenshot\\section.jpeg");
		FileUtils.copyFile(scr,des);
		

		
		
	
		driver.close();

	}

}
