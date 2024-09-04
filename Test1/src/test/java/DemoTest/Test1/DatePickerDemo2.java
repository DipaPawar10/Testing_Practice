package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedDay="8";
		String expectedMonthYear="Aug 2024";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		
		while(true) {
			String calenderMonthYear = driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
			if(calenderMonthYear.equals(expectedMonthYear)) {
				driver.findElement(By.xpath("//td[text()='" + expectedDay + "']")).click();
				break;
			}else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
