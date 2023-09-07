package HandleAlertsPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/alerts");
		//>>>find alert button & perform click action
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		//find to alert window and accept the alert
//		driver.switchTo().alert().accept();// ok btn
		
		//>>> for the confirm btn
		
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		driver.switchTo().alert().dismiss(); // cancel btn clicked
		
		//>>> prompt alert

		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		driver.switchTo().alert().sendKeys("Hi Jatinnn..."); // cancel btn clicked
		driver.switchTo().alert().accept();
		
		
	}

}
