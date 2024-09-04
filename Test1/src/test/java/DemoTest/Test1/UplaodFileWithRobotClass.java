package DemoTest.Test1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UplaodFileWithRobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		
//		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\file.csv");
		WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();	
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		//copy file Clipboard
		StringSelection ss = new StringSelection("Desktop\\Yatra with BSNL Staff.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform control+v action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
	}
}
