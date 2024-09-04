package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		
//		driver.findElement(By.linkText("Alert with OK")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		//Accept the alert
//	    driver.switchTo().alert().accept();
	    //cancel the alert
	    //driver.switchTo().alert().dismiss();
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		driver.switchTo().alert().sendKeys("Dipali");
		driver.switchTo().alert().accept();
		
		driver.close();
	    
	    
	}

}
