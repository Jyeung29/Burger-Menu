package Burger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WonConversion {
	private static String wonURL = "http://www.floatrates.com/daily/krw.json";
	public static void main(String[] args) throws Exception {
		//define JSON object and read the JSON file
		StringBuilder builder = new StringBuilder();
		try {
			URL url = new URL(wonURL);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String str = "";
			while(null != (str = br.readLine())) {
				builder.append(str + "\n");
			}
			JSONParser jsonParser = new JSONParser();
			Object obj = jsonParser.parse(builder.toString());
			JSONObject jsonObject = (JSONObject)obj;
			JSONObject usd = (JSONObject)jsonObject.get("usd"); //Create JSON object, read "bpi". save it into bpi object
			//JSONObject usd = (JSONObject)bpi.get("");  // Create JSON object usd, select “USD” from bpi object. save it into usd

			 NumberFormat format = NumberFormat.getInstance(Locale.getDefault()); // Ready to read number
			 //Number number = format.parse((String) usd.get("inverseRate"));  // read “rate” from usd object,
			 //double price = number.doubleValue(); // type casting
			 double number = (double) usd.get("inverseRate"); //Previous code not converting for this file
			 System.out.println(number); 
			 
			 String descr = (String) usd.get("code"); // read “description” from usd object.
			 System.out.println(descr);
			} 
			catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
