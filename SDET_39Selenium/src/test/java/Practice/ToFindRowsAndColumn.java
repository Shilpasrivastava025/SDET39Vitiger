package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindRowsAndColumn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "F:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		WebElement getRows = driver.findElement(By.xpath("//table[@id='countries']/tbody"));
		List<WebElement> totalRows = getRows.findElements(By.tagName("tr"));
		System.out.println("Total Rows= "+ totalRows.size());
		
		WebElement getColumn = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr"));
		List<WebElement> totalColumn = getColumn.findElements(By.tagName("td"));
		System.out.println("Total Column= "+totalColumn.size());
		driver.quit();
	}
	

}
