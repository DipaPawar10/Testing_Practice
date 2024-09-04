package DemoTest.Test1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockenLinksText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.deadlinkcity.com/");
        int resCode = 200; // 200 response code is valid code
        int brockenLinkCnt = 0;
        
        
        List<WebElement> element=driver.findElements(By.tagName("a"));
        System.out.println("Total Link On Page"+element.size());
        
        for(WebElement el:element) {
        	String Url=el.getAttribute("href");
        	try {
        		URL urlLink = new URL(Url);
        		HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
        		huc.setRequestMethod("HEAD");
        		huc.connect(); 
        		
        		resCode= huc.getResponseCode();
        		
        		if(resCode>=400) {
        			System.out.println(Url+"Brocken Link.");
        			brockenLinkCnt ++;
        		}
        		
        	}
        	
        	catch(MalformedURLException e) {
        		
        		}
        	catch(Exception e)
        	{
        		
        	}
        }
        System.out.println("Total Brocken Links:"+brockenLinkCnt);
        
        driver.close();
        
	}

}
