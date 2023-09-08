package NewWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTaborWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("first page:- " +driver.getTitle());
		
		//open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second page:- " +driver.getTitle());
		
		//get window handles of open windows
		Set <String>windowsHandles=driver.getWindowHandles();
		
		List <String> handles = new ArrayList<String>();
		handles.addAll(windowsHandles);
		
		driver.close();
		
		driver.switchTo().window(handles.get(0));  //switch to gooogle.com
		
		System.out.println("first page:- " +driver.getTitle());
		

	}

}
