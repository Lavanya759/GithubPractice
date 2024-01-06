package Notes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("Lipstick");
		System.out.println(element.getSize().getHeight());
		System.out.println(element.getRect());
		System.out.println(element.getLocation());
		
	}
}
