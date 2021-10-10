package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		// get test data from excel:
		Xls_Reader reader = new Xls_Reader("C:\\Users\\jayra\\eclipse-workspace\\Maven1\\src\\test\\java\\com\\testdata\\TestData.xls.xlsx");
		
		if(!reader.isSheetExist("Homepage")) {
			reader.addSheet("Homepage");
		}

	}

}
 