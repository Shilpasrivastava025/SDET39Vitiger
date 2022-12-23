package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleTabsExample{
	
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");

List<WebElement> allElements = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
Actions action = new Actions(driver);
action.keyDown(Keys.CONTROL).perform();
for(WebElement element:allElements) {
element.click();
}
action.keyUp(Keys.CONTROL).perform();
}
}
