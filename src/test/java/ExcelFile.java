import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void main(String[] args) throws IOException {
 String Excelname="C:\\Users\\Lenovo\\Downloads\\gisfy.xlsx";
 FileInputStream file=new FileInputStream(Excelname);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("gisfy");//XSSFSheet sheet=workbook.getSheetAt(0);
		///using loop
		
	           int row= sheet.getLastRowNum();
	           System.out.println("row:"+row);
	           int cols=sheet.getRow(0).getLastCellNum();
	           System.out.println("columns:"+cols);
	           
	           System.out.println();
	for(int r=0;r<row;r++) {
		XSSFRow rows=sheet.getRow(r);
		
	for(int c=0;c<cols;c++) {
		XSSFCell cell=rows.getCell(c);
		switch(cell.getCellType()) {
		case STRING:System.out.println(cell.getStringCellValue());break;
		case NUMERIC:System.out.println(cell.getNumericCellValue());break;
		case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
		}
		//System.out.println(" | ");
	}
	System.out.println();
	}
	
	}
	
	
	

}
