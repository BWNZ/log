package log;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class LogFileAnalyzer {

	public static void main(String[] args) throws IOException, ParseException {
		try {	
			int startLine=Integer.parseInt(args[2]);
			int amountOfLines=Integer.parseInt(args[3]);
			String readFile = args[0];
			String writeFile = args[1];
			ILogStringDivision strDivision = new LogStringDivision();
			ILogStringLine strLine = new LogStringLine();
			LogFileProcess pro= new LogFileProcess(strDivision, strLine);
			pro.Process(startLine, amountOfLines, readFile, writeFile);	
			} 				
		catch (FileNotFoundException e) {
			System.out.print("File not found!");			
		}
	}
}
