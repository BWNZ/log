package log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

public class LogFileProcess implements ILogFileProcess {
	private ILogStringDivision strDivision;
	private ILogStringLine strLine;
	
	public LogFileProcess(ILogStringDivision strDivision, ILogStringLine strLine ){
		this.strDivision=strDivision;
		this.strLine=strLine;
	}

	public void Process (int startFile, int amountOfLines, String readFile, String writeFile) throws IOException, ParseException{
		File newReadFile = new File(readFile);
		File newWriteFile = new File(writeFile);
		String line;	
		int count=0;
		BufferedReader reader = new BufferedReader(new FileReader(newReadFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(newWriteFile));
		while ((line = reader.readLine()) != null) {
					count++;
					if (count>=startFile){
					writer.write(line);						
					writer.newLine();
					strLine.lineToString(strDivision.stringDivision(line));
					} 
					if (count>amountOfLines) break;
					}
					reader.close();	writer.close();			
	} 				
	}
	
	


