package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {

		//JavascriptExecutor is an interface that helps to execute JavaScript through Selenium WebDriver
		//JavascriptExecutor js = (JavaScriptExecutor)driver;
		//		js.executeScript(Script,Arguments);

		//		script -This is the JavaScript that needs to execute.
		//		Arguments - It is the arguments to the script. its optional;
		//		Returns - could be anything from Boolean, Long, String, List, WebElement, or null.
		//uses of JavaScriptExecutor- > Click on a Btn, type txt in text box, generate alert pop window, refresh  browser window using JavaScriptExecutor etc
		//		js.executeScript("document.getElementById('Enter id').value='text to be entered' ;"); for the text box 
		//		js.executeScript("arguments[0].click();",element);--> for the click a btn


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		//enter text in search box
		js.executeScript("document.getElementById('username').value='student' ;");
		js.executeScript("document.getElementById('password').value='Password123' ;");
		//click on login btn
		WebElement element =   driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click();",element);

		//To refresh the browser window/page
		//		js.executeScript("history.go(0)");
		//
		//		//get domain name 
		//		String domain= js.executeScript("return document.domain;").toString();
		//		System.out.println("Domain :"  + domain);
		//
		//		//get title name 
		//		String title= js.executeScript("return document.domain;").toString();
		//		System.out.println("Title :"  + title);
		//
		//		//get url name 
		//		String url= js.executeScript("return document.domain;").toString();
		//		System.out.println("URL :"  + url);
		//		
		//draw border around the web element
		//		js.executeScript("arguments[0].style.border = '3px solid yellow';",element);


		//to zoom page
		//		js.executeScript("document.body.style.zoom=50%' ");

		//to generate Alert pop window in selenium WebDriver
		//		js.executeScript("alert('JavascriptExecutorAlert');");


	}

}
