package xl_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Write_data {
	public static String path = "C:\\Users\\ravit\\git\\Selenium\\Selenium\\input_data\\Input.xlsx";
	public static void writedata() throws Throwable {
		FileInputStream fi = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Sheet2");
		Row r = ws.getRow(1);
		Cell c = r.createCell(2);
		c.setCellValue( "erqwerr");
		
		FileOutputStream fo = new FileOutputStream(path);
		wb.write(fo);
		fo.close();
		
		
		
	}

	public static void main(String[] args) throws Throwable {
		writedata();

	}

}
