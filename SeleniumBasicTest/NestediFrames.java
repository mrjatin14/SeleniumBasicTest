package HandlesFrame_and_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestediFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");

		//switch to frame1
		driver.switchTo().frame("frame1");  //parent frame/outer frame

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Jatin");

		driver.switchTo().frame("frame3");  //child/inner frame
		//find web element
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		
		//find web element input box
		driver.findElement(By.tagName("input")).clear();
		
		//switch to frame 2/main frame/ default
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dD =driver.findElement(By.id("animals"));
		Select dropDown= new Select(dD);
		dropDown.selectByVisibleText("Baby Cat");
		
		
	
		
	}

}
