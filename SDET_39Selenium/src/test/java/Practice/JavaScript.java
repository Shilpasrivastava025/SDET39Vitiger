package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("BEAUTY"))).click().perform();
		action.click(driver.findElement(By.xpath("//span[@class=\"product-discountedPrice\"]"))).perform();
driver.quit();
	}
}
