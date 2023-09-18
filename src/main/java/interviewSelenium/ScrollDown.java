package interviewSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
public static void main(String[] args) throws InterruptedException 
{
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.toolsqa.com");
Thread.sleep(3000);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,400)");
}
}
