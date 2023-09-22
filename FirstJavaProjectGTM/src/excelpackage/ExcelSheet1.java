package excelpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\ExcelFolder\\Rucha Excel Sheet.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("Login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String Username = c1.getStringCellValue();
		System.out.println(Username);
		
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String Password = c2.getStringCellValue();
		System.out.println(Password);
	}
}
