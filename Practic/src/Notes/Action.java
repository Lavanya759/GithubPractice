package Notes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		ac.doubleClick().perform();
		ac.contextClick().perform();
		ac.clickAndHold().perform();
	}

}
