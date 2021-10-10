package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
		static Xls_Reader reader;
		
		public static ArrayList<Object[]> getDataFromExcel(){
			
			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			
			try {
				reader = new Xls_Reader("C:\\Users\\jayra\\eclipse-workspace\\Maven1\\src\\test\\java\\com\\testdata\\TestData.xls.xlsx");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			for (int rowNum = 2; rowNum <= reader.getRowCount("RegTestData"); rowNum++ ) {
				String firstName = reader.getCellData("RegTestData", "firstName", rowNum);
				String lastName = reader.getCellData("RegTestData", "lastName", rowNum);
				String email = reader.getCellData("RegTestData", "email", rowNum);
				String password = reader.getCellData("RegTestData", "password", rowNum);
				
				Object ob[] = {firstName, lastName, email, password};
				myData.add(ob);

			}	
			return myData;
		}
}
