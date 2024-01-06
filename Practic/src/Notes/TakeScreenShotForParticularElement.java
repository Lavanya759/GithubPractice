package Notes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public abstract class TakeScreenShotForParticularElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/ScreenShot2.png");
		FileHandler.copy(temp, dest);
	}

}
