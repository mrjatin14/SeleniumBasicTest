package HandlesFrame_and_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTotalIframes {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		//switch to main page
		
		driver.switchTo().defaultContent();
		
		
		//>>> if we have to print the iframe then must we need to present in the main frame
		//find & print total iframes on web page
		int noOgIframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total no of iframes : " + noOgIframes);
		
		
		
		
		

	}

}
