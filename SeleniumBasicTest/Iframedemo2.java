package HandlesFrame_and_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframedemo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://chercher.tech/practice/frames");
		
		//switch to iframe using 3 ways : 1) By id or name  2) By webelement   3)By index
		//switch to iframe  by index value 
		
		//>>if we want locate through web element then
//		WebElement iframeElement = driver.findElement(By.name("....."));
//		driver.switchTo().frame(...);
		
		
		
		driver.get("https://nxtgenaiacademy.com/iframe/");
		//switch to 1st frame
		driver.switchTo().frame("homepage");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		//switch to 2nd frame
		driver.switchTo().frame("popuppage");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("//li[@id='menu-item-6371']//span[@class='arrow']")).click();
		
		
		
		

	}

}
