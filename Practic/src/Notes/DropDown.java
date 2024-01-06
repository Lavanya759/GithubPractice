package Notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//select[@class='chosen-select']"));
		Select dropdown=new Select(element);
		dropdown.selectByIndex(1);
		//dropdown.selectByValue(null);
		WebElement element1=driver.findElement(By.xpath("//select[@class='chosen-select']"));
		Select dropdown1=new Select(element1);
		dropdown1.selectByVisibleText("Automation");	
	}
}
