package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com");
		//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\rames\\OneDrive\\Pictures\\Screenshots");
		// TODO Auto-generated method stub
		
	    //  driver.get("http://my.monsterindia.com/create_account.html");
	      // scroll to reach upload button
	   //   JavascriptExecutor j = (JavascriptExecutor)driver;
	    //  j.executeScript("scroll(0,500)");
	      // file path passed as parameter to StringSelection
	      StringSelection s = new StringSelection("C:\\Users\\rames\\OneDrive\\pictures\\Screenshots");
	      // Clipboard copy
	     // Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      //identify element and click
	      driver.findElement(By.xpath("//*[@id=\"uploadfile\"]")).click();
	      // Robot object creation
	      Robot r = new Robot();
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	   }
	}
}
