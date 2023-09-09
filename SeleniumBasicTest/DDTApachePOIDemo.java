package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDTApachePOIDemo {

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
		
		for( int currentRow=0; currentRow<ttlRows; currentRow++ )
		{
			for(int currentCell = 0; currentCell<ttlCells; currentCell++)
			{
				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
			
			System.out.print("\n");
		}
		
		try {
			ExcelWBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
