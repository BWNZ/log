package log;

import java.io.IOException;
import java.text.ParseException;

public interface ILogFileProcess  {
	public void Process(int startLine, int amountOfLines, String readFile, String writeFile) throws IOException, ParseException;

}
