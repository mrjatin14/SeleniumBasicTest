package UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendsKeysMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		//sendskeys() when type=file is given only when we can use this ()
		driver.findElement(By.xpath("//input[@id='input-4']")).sendKeys("C:\\Users\\Jatin\\OneDrive\\Desktop\\BDD.txt");
		
		
		

	}

}
