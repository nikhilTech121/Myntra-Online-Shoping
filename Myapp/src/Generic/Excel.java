package Generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Constant {
	public static String ExcelSheet(String path,String sh, int r, int c) 
	{
		String s = " ";
		try {
			FileInputStream f = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(f);
			s = wb.getSheet(sh).getRow(r).getCell(c).getStringCellValue();
		} catch (Exception e) {
			Reporter.log("Fail");

		}
		return s;
		
	}
}

