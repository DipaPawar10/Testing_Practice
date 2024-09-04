package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedDay="13";
		String expectedMonthYear = "Aug 2024";
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).click();
		
		while(true){
			String calenderMonthYear = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
			 
			if(calenderMonthYear.equals(expectedMonthYear)) {
				List <WebElement> dayList = driver.findElements(By.xpath("//p[@class='fsw__date']"));
				for(WebElement e:dayList ) {
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay)) {
						e.click();
						break;
					}
				}
				break;
				
			}
			else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
			}
			
		}
	}

}
