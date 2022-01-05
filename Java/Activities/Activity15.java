package activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {
	
	private static final String FILE_NAME = "src/TestSheet1.xlsx";


	public static void main(String[] args) throws IOException{
		
		
		//Create Excel file as "Datatypes in Java"
		XSSFWorkbook xss=new XSSFWorkbook();
		XSSFSheet sheet= xss.createSheet("Datattypes in Java");
		
		//2d array values
		Object[][] datatypes=
			{{"Datatype", "Type", "Size(in bytes)"},
		    {"int", "Primitive", 2},
		    {"float", "Primitive", 4},
		    {"double", "Primitive", 8},
		    {"char", "Primitive", 1},
		    {"String", "Non-Primitive", "No fixed size"}
			};
		
		//Write 2d array in excel file
		int rowNum = 0;

		for (Object[] datatype : datatypes) 
		{
		    Row row = sheet.createRow(rowNum++);
		    int colNum = 0;
		    for (Object field : datatype) 
		    {
		        Cell cell = row.createCell(colNum++);
		        if (field instanceof String)
		        {
		            cell.setCellValue((String) field);
		        } else if (field instanceof Integer) 
		        {
		            cell.setCellValue((Integer) field);
		        }
		    }
		}
		
		//File writing completed.
		
		 try {
	            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	           xss.write(outputStream);
	            xss.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
         System.out.println("Done");
	}

	
}
