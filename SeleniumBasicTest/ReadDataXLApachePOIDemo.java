package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataXLApachePOIDemo {

	public static void main(String[] args) {
		

		//Excel->Workbook->Sheet->Row->Cell
		//we will read data and print data in console
		
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
//		XSSFRow Row;
//		XSSFCell cell;
		
		//create an obj of file class to open file
		File excelFile = new File("c:\\TestDataFile.xlsx");
		FileInputStream inputSteam = null;
		
		
		//create an obj of FileInputStream to read data from file
		try {
			inputSteam = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create obj of XSSFWorkbook to handle xlsx file
		try {
			ExcelWBook = new XSSFWorkbook (inputSteam);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//to access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//get total row count
		int ttlRows = ExcelWSheet.getLastRowNum() + 1;
		//get total no. of cells count in a row
		int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		//here we will give current row 1 other wise it  will consider xl title haeding also
		for( int currentRow=1; currentRow<ttlRows; currentRow++ )
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/");
			//enter username
			driver.findElement(By.id("user-name")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(0).toString()); //if in xl file we any other data like numeric/boolean data then we have seprate methd(getNumericCellValue)
			//enter password
			driver.findElement(By.id("password")).sendKeys(ExcelWSheet.getRow(currentRow).getCell(1).toString());
			
			//click login btn
			driver.findElement(By.id("login-button")).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			for(int currentCell = 0; currentCell<ttlCells; currentCell++)
//			{
//				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
//				System.out.print("\t");
//			}
			
			
//			System.out.print("\n");
			driver.quit();
		}
		
		
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
