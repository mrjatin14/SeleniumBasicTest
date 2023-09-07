package SeleniumBasicTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRadioBtn {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		
		//find radio button web element on web page
		List <WebElement> radioBtnList=driver.findElements(By.xpath("//input[@type='radio']"));
		
		//print total no. of radio btn in radioBtnList
		System.out.println("Total no. of radio btn on web page: " +radioBtnList.size());
		driver.close();

	}

}
