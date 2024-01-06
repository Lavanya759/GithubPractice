package Notes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExceutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		WebElement element=driver.findElement(By.xpath("//h2[text()='Laptops for every need']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(20000);
		js.executeScript("arguments[0].scrollIntoView(false)", element);
		
	}
}
