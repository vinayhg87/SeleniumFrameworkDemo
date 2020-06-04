package ExcelOps;

import mainCaller.Commons;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelOperation implements Commons {

    public String ExcelRead(String Sheetname, int row, int col) {
        String result = null;
        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
            result = wb.getSheet(Sheetname).getRow(row).getCell(col).getStringCellValue();
		/*
		Sheet sh = wb.getSheet(Sheetname);
	    Row rw = sh.getRow(row);
	    Cell ce = rw.getCell(col);*/
            //result = ce.getStringCellValue();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }


    public int ExcelReadInt(String Sheetname, int row, int col) {
        int result = 0;
        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
            Sheet sh = wb.getSheet(Sheetname);
            Row rw = sh.getRow(row);
            Cell ce = rw.getCell(col);
            result = (int) ce.getNumericCellValue();
        } catch (Exception e) {

        }
        return result;
    }

    public void ExcelWrite(String Sheetname, int row, int col, String Data) {
        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
            Sheet sh = wb.getSheet(Sheetname);
            Row rw = sh.createRow(row);
            Cell ce = rw.createCell(col);
            ce.setCellValue(Data);
            FileOutputStream FileWrite = new FileOutputStream(ExcelPath);
            wb.write(FileWrite);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ExcelWrite(String Sheetname, int row, int col, int Data) {
        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));
            Sheet sh = wb.getSheet(Sheetname);
            Row rw = sh.createRow(row);
            Cell ce = rw.createCell(col);
            ce.setCellValue(Data);
            FileOutputStream FileWrite = new FileOutputStream(ExcelPath);
            wb.write(FileWrite);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int RowNum(String Sheetname) throws IOException, InvalidFormatException {
        Workbook wb = WorkbookFactory.create(new FileInputStream(ExcelPath));

        return wb.getSheet(Sheetname).getLastRowNum();
    }
}
