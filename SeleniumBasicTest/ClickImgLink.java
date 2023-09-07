package SeleniumBasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickImgLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//find web element img link on demo web shop
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']")).click();
		
		//verify title of the current page with expected home page title
		if (driver.getTitle().equals("Demo Web Shop. Computers"))
		{
			
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close();
		
		
	

	}

}
