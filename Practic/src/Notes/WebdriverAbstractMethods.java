package Notes;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;


public class WebdriverAbstractMethods {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		driver.close();
	}
}
