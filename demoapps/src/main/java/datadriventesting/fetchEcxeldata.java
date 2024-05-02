package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchEcxeldata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	 FileInputStream fis=new FileInputStream("D:\\javap\\selenium_automation\\demoapps\\src\\test\\resources\\Book1.xlsx");
	 Workbook workbook = WorkbookFactory.create(fis);
	 Sheet sheet = workbook.getSheet("Sheet1");
	 Row row = sheet.getRow(1);
	 Cell cell = row.getCell(1);
	 String email = cell.getStringCellValue();
	 System.out.println(email);
	 
	}

}
