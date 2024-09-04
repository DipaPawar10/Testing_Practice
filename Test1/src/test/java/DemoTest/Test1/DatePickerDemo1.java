package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedDay="8";
		String expectedMonth="August";
		String expectedYear="2024";
		
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//		WebDriverManager.edgedriver().setup();
		//		WebDriver driver= new EdgeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		while(true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String claenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(calenderMonth.equals(expectedMonth) && claenderYear.equals(expectedYear)) {
				
				List<WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e:dayList) {
					String calenderDay = e.getText();
					if(calenderDay.equals(expectedDay)) 
					{
						e.click();
						break;
					}
				}
				break;
			}else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}

		}





	}

}
