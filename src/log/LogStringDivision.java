package log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
 
public class LogStringDivision implements ILogStringDivision {
	public Lines stringDivision(String str) throws ParseException {
				Lines strLine = new Lines();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.ENGLISH);
				String[] parts = new String[4];
				parts = str.split(" ");
				if (Pattern.matches("(^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$)", parts[0])) strLine.setHostIp(parts[0]);
				else strLine.setHostName(parts[0]);
				strLine.setDate(dateFormat.parse(parts[3].replace("[", "") + " " + parts[4].replace("]", "")));
				strLine.setReq(parts[5]+" "+parts[6]+" "+parts[7]);
				strLine.setHttp(Integer.parseInt(parts[8]));
				strLine.setReply(Integer.parseInt(parts[9]));
				return strLine;
			}
	

}
