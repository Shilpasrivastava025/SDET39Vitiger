package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless {

	public static void main(String[] args) {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}
}
