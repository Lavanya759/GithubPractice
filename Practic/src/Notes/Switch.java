package Notes;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;//for scrolling we need java script executor
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element=driver.findElement(By.xpath("//span[text()='Skinny Men Blue Jeans']"));
		js.executeScript("arguments[0].scrollIntoView(false)", element); //
		element.click();
		WebElement compare=driver.findElement(By.xpath("//button[@id='compare']"));
		js.executeScript("arguments[0].scrollIntoView(false)", compare);
		compare.click();
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("ebay"))
			{
			driver.manage().window().maximize();
			}
		}
	}
}
