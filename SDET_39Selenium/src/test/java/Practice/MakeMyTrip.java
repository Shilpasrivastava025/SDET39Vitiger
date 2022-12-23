package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]")).sendKeys("BLR");
		
	}

}
