package Practice;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Myntra {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	    WebElement textbox = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		textbox.sendKeys("top");
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		WebElement element = driver.findElement(By.xpath("//h1[@class='title-title']"));
		Assert.assertEquals( true ,element.isDisplayed());
		System.out.println("Element is displayed");
		
		String Expectedtext = "Top";
		Assert.assertEquals(Expectedtext, element.getText());
		System.out.println("Assert passed");
			 
		
		/* 
		 List<WebElement> allElement = driver.findElements(By.xpath("//a[@class='desktop-main']"));
		Actions action= new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		
		for(WebElement element1: allElement)
		{
			element1.click();
		}
		action.keyUp(Keys.CONTROL).perform();
		
		*/
		
		driver.quit();
		}	
}
