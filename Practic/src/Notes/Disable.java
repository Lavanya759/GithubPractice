package Notes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aeo.abfrl.in/c/men");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

}
