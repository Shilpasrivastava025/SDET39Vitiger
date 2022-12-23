package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	search.sendKeys("songs");
	
	driver.findElement(By.id("search-icon-legacy")).click();
	driver.findElement(By.id("video-title")).click();
	driver.quit();
}
}
