package Notes;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.close();
	}
}
