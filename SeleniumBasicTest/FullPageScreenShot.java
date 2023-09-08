package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//capture full page screenshot
		//step1:  convert webdriver obj to TakesScreenshot interface
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create img file
		
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Jatin\\eclipse-workspace\\SeptCucumber\\Screenshots\\fullpage.png");
		
		//step3:  copy img file to destination --> for tht we use Apache common IO library
		FileUtils.copyFile(src, dest);

	}

}
