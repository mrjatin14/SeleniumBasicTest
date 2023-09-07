package UploadFiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassMethod {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		//RobotClassMethod for upload file
		WebElement button =driver.findElement(By.xpath("//input[@id='input-4']"));
		
		Actions act = new Actions(driver);
				act.moveToElement(button).click().perform();
				
				Robot rb = new Robot();
				rb.delay(3000);
				
				//it will copy our file to clipborad
				StringSelection  ss = new StringSelection("C:\\Users\\Jatin\\OneDrive\\Desktop\\BDD.txt");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				
				//paste the file
				//perform control + V action to paste  file
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				

	}

}
