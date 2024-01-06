package Notes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications"); //for disabling the browser pop ups
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
	}
}
