package Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	List<WebElement> Links = driver.findElements(By.xpath("//a"));
	System.out.println(Links);
	
	for(WebElement wb: Links)
	{
		String url = wb.getAttribute("href");
		verifylinks(url);
	}
driver.quit();	
}

private static void verifylinks(String url) {
try {
	URL urlLinks = new URL(url);
	HttpURLConnection http= (HttpURLConnection)urlLinks.openConnection();
	http.connect();
	if(http.getResponseCode()<300)
	{
		System.out.println(url+"*************"+"links is OK");
	}
}
	catch(Exception e)
	{
		System.out.println(url+"*******************"+"Links are broken");
	}
}
	
}

