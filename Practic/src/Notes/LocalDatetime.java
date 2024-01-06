package Notes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LocalDatetime {
	public static void main(String [] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		LocalDateTime dt=LocalDateTime.now();
		String dateTime = dt.toString().replace(":", "-");
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		TakesScreenshot  ts=(TakesScreenshot)driver;
		File temp = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/ScreenShotWithLocal"+dateTime+".png");
		FileHandler.copy(temp, dest);	
		driver.close();
	}
}
