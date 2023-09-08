package HandlesFrame_and_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//switch to iframe using 3 ways : 1) By id or name  2) By webelement   3)By index
		//switch to iframe moneyiframe
		driver.switchTo().frame("moneyiframe");
		
		//find web element & print value
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nseindex);
		
	}

}
