package Notes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.navigate().back();
		driver.get("https://www.amazon.com/");
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to(new String("https://www.amazon.com/"));
		}
}
