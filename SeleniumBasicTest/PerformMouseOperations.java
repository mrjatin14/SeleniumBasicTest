package SeleniumBasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformMouseOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoqa.com/buttons");
//		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		Actions act = new Actions(driver);
//		act.contextClick(button).perform(); //right click
//		
		
//		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		Actions act = new Actions(driver);
//		act.doubleClick(button).perform(); //double click
		
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//		//find source & target web element
//		WebElement source = driver .findElement(By.id("box6")); //rome
//		WebElement target = driver .findElement(By.id("box106")); //itly
//		
//		Actions act = new Actions(driver);
//		//dragAndDrop(sourceElement, targetElement)
//		
//		act.dragAndDrop(source, target).perform();
		
		//>>>mouse over actions
		
		driver.get("https://www.ebay.com/");
		WebElement element = driver .findElement(By.linkText("Fashion")); 
		Actions act = new Actions(driver);
		act.moveToElement(element).perform(); //moveTOElement for mouse over action
		
		
		
		
		
	}

}
