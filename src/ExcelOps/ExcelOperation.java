package ExcelOps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	
	public String currentdir = System.getProperty("user.dir");
	public String ExcelPath = currentdir + File.separator + "ExcelData" + File.separator+ "ExcelInput.xlsx";
	
	
	public String ExcelRead(String Sheetname, int row, int col) 
	{
		String result = null;
		try{
		Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
		result = wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
		/*
		Sheet sh = wb.getSheet(Sheetname);
	    Row rw = sh.getRow(row);
	    Cell ce = rw.getCell(col);*/
	    //result = ce.getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	    return result;
	}
	
	
	public int ExcelReadInt(String Sheetname, int row, int col) 
	{
		int result = 0;
		try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
		Sheet sh = wb.getSheet(Sheetname);
	    Row rw = sh.getRow(row);
	    Cell ce = rw.getCell(col);
	    result = (int) ce.getNumericCellValue();
		}
		catch(Exception e)
		{
			
		}	
	    return result;
	}
	
	public void ExcelWrite(String Sheetname, int row, int col, String Data)
	{
		try{
		Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
		Sheet sh = wb.getSheet(Sheetname);
	    Row rw = sh.createRow(row);
	    Cell ce = rw.createCell(col);
	    ce.setCellValue(Data);
	    FileOutputStream Filewrite = new FileOutputStream(ExcelPath);
	    wb.write(Filewrite);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void ExcelWrite(String Sheetname, int row, int col, int Data)
	{
		try{
		Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
		Sheet sh = wb.getSheet(Sheetname);
	    Row rw = sh.createRow(row);
	    Cell ce = rw.createCell(col);
	    ce.setCellValue(Data);
	    FileOutputStream Filewrite = new FileOutputStream(ExcelPath);
	    wb.write(Filewrite);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
}
