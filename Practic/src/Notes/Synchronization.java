package Notes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		// Dead wait
		//Thread.sleep(20000);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
	    //Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']")));
		
	}
}
