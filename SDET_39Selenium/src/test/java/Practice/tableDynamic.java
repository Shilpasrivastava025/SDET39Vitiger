package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableDynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91707/Desktop/dynamic.html");
		List<WebElement> columns = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th"));
		List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[1]"));
		System.out.println(columns.size());
		System.out.println(rows.size());
		driver.quit();
		
		
	}
}
