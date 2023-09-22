package excelpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelSheet_ShortFormMethod 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\SHARVARISH\\ECLIPSE - Automation Testing - MKT\\FirstJavaProjectGTM\\ExcelFolder\\Rucha Excel Sheet.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("Login");
		/*Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String UN = c1.getStringCellValue();
		System.out.println(UN);*/
		String username = s1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		/*Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		String Pass = c2.getStringCellValue();
		System.out.println(Pass);*/
		String password = s1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);
		
		//to fetch numeric value from excel sheet we need to add class NumberToTextConverter
		String mobileno =NumberToTextConverter.toText(s1.getRow(3).getCell(1).getNumericCellValue());
		System.out.println(mobileno);
		
		//when we try to fetch value from the cell which does not contain value then it will throw an NullPointerException
		/*String value = s1.getRow(10).getCell(1).getStringCellValue();
		System.out.println(value);*/
		
		//if we need to fetch value from different sheet of same workbook
		Sheet payment = wb.getSheet("Payment");
		String a = payment.getRow(0).getCell(0).getStringCellValue();
		System.out.println(a);
		
	
	}
}
