package xl_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_data {
	public static String path = "C:\\Users\\ravit\\git\\Selenium\\Selenium\\input_data\\Input.xlsx";
	public static void readSigleCellValue() throws IOException {
		
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet wh = wb.getSheetAt(0);
		Row row = wh.getRow(0);
		Cell cel = row.getCell(0);
		String data = cel.getStringCellValue();
		System.out.println(data );
		
		
		/*XSSFSheet w = wb.getSheetAt(1);
		Row r = w.getRow(1);
		Cell c = r.getCell(1);
		c.setCellValue("RAvi teja");
		FileOutputStream fo = new FileOutputStream(path);
		wb.write(fo);*/
		
		
	}
	public static void readAllValuesOfFirstRow() throws IOException {
		System.out.println("-----------------------------------------------------");
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		Row r = ws.getRow(0);
		int numOfcol = r.getLastCellNum(); // to get  cell count
		for(int i = 0; i<= numOfcol-1; i++) {
			Row r1 = ws.getRow(0);
			Cell c1 = r1.getCell(i);
			String str1 = c1.getStringCellValue();
			System.out.print(str1+"|  ");
		}
		
		
}
	
	public static void readAllvaluesOFFirstcoloum() throws IOException {
		System.out.println("-----------------------------------------------------------");
		FileInputStream fi  = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		Row r2 = ws.getRow(0);
		int noofRows = ws.getLastRowNum()+1;
		System.out.println("row count"+ noofRows);
		int noOfcoloums = r2.getLastCellNum();
		System.out.println("cell count "+noOfcoloums );
		for(int i = 1;i<=noofRows-1; i++) {
			Row r3 = ws.getRow(i);
			Cell c2 = r3.getCell(0);
			String data = c2.getStringCellValue();
			System.out.println(data);
			
		}
	}
	
	public static void readvalusforSpecifirow() throws IOException {
		System.out.println("---------------------__________________---------------------");
		FileInputStream fi  = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheetAt(0);
		int rowcount = ws.getLastRowNum();
		int colCount = ws.getRow(0).getLastCellNum();
		
		
		for(int i = 0; i<=rowcount; i++) {
			for(int j = 0;j<= colCount-1; j++) {
				Row r1 = ws.getRow(i);
				Cell c1 = r1.getCell(j);
				String str = c1.getStringCellValue();
				System.out.print(str+"|  ");
			}
			System.out.println(" ");
		}
		
		
		
			
	}
	
	public static String getDatafrom_xl() throws IOException {
		
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet wh = wb.getSheetAt(1);
		Row row = wh.getRow(0);
		Cell cel = row.getCell(0);
		String data = cel.getStringCellValue();
		System.out.println(data );
		
		return data;
		
		
	}
	
	public static void demo_app() throws IOException, InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		String data = getDatafrom_xl();
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@value='Search store']")).clear();
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//readSigleCellValue();
		//readAllValuesOfFirstRow();
		readAllvaluesOFFirstcoloum();
		//readvalusforSpecifirow();
		//demo_app();
			
		}
		
		
		
	
	}

	

