package my.parse.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParseCSV {

	List<String> data = new ArrayList<>();
	String[] header = null;
	Map<String, Integer> headerMap = new HashMap<>();
	
	public ParseCSV(){
		loadData();
		extractHeader();
	}
	
	public static void main(String[] args){
		ParseCSV parser = new ParseCSV();
		
		//Test
		System.out.println("@@main: " + Arrays.toString(parser.header));
		System.out.println("@@main: Header0: " + parser.header[0]);
		System.out.println("@@main: HeaderMap freq for Thing: " + parser.headerMap.get("Thing"));
		
		System.out.println("@@main: gettValue for Thing: " + parser.getValue("Thing", 0));
		System.out.println("@@main: gettValue for Thing: " + parser.getValue("Thing", 1));
		
	}

	private void loadData(){
//		data.add("Name,Place,Animal,Thing");
//		data.add("John,Denmark,Dog,Ball");
//		data.add("Harry,Holland,Horse,Hat");
		
		Scanner s = null;
		try {
			s = new Scanner(new File("/tmp/data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (s.hasNext()){
		    data.add(s.next().replaceAll("'", "")); //removing the single quote, before adding to collection
		}
		s.close();
		
	}
	
	private void extractHeader(){
		String headerRaw = data.get(0);
		data.remove(0);
		header = headerRaw.split(",");
		for (Integer i =0; i < header.length; i++ ){
			headerMap.put(header[i], i);
		}
	}
	
	private String getValue(String columnName, int rowIndex){
		
		
		String rowData = data.get(rowIndex);
		Integer columnNum = headerMap.get(columnName);
		
		if (columnNum == null){
			throw new RuntimeException("Column not found for columnName: " +columnName);
		}
		
		String[] rowArr = rowData.split(",");
		
		if (rowIndex > rowArr.length){
			throw new RuntimeException("Row Index cannot be large for rowIndex" + rowIndex);
		}
		
		int i=0;
		for (i=0; i<rowArr.length; i++){
			if (i == columnNum) {
				break;
			}
		}
		return rowArr[i];
	}


