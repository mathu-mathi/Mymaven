package Hackathon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.ArrayList;


public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException 
		
	 {  	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		        // Open the initial URL
		 driver.get("https://www.salesforce.com");
		        driver.switchTo().newWindow(WindowType.TAB);
		        driver.get("https://www.google.com");
		       driver.findElement(By.name("q")).sendKeys("Selenium");
		       driver.switchTo().newWindow(WindowType.WINDOW);
		       driver.get("https://www.amazon.com");
		       ArrayList<String> Winindex=new ArrayList<String>();
		       driver.switchTo().window(Winindex.get(0));
		       Thread.sleep(3000);
		       driver.switchTo().window(Winindex.get(1));
		       Thread.sleep(4000);
		       driver.switchTo().window(Winindex.get(2));
		       driver.close();
	 }
}
		       

		        