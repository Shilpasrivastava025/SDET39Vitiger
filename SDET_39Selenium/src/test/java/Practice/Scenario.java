package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String total = driver.findElement(By.xpath("//span[text()='1-16 of over 7,000 results for']")).getText();
		System.out.println(total);
	}
	

}
