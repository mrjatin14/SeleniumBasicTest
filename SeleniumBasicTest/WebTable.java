package HandleWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Jatin\\OneDrive\\Desktop\\WebTables.html");
		
		//find second cell in table adn print second cell data
		String text = driver.findElement(By.xpath("//table/tbody/tr/[2]/td[2]")).getText();
		System.out.println(text);

		//find total no rows in web table
		List <WebElement> rowList  = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("rows:"  + rowList.size());
		
		//find total no columns in web table
		List <WebElement> columnList  = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
		System.out.println("Columns:"  + columnList.size());
		
		
		//>>>>complicated this looop
//		for(int r=2; r<=rowList.size(); r++)
//		{
//			for(int c =1; c<=columnList.size(); c++)
//			{
//				String text = driver.findElement(By.xpath("//table/tbody/tr/[2]/td[2]")).getText();
//			}
//		}
		driver.quit();


	}

}
