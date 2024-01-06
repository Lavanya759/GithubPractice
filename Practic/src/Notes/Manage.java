package Notes;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		driver.manage().window().getPosition();
		driver.manage().window().setSize(new Dimension(10,20));
		driver.manage().window().setPosition(new Point(100,200));
	}

}
