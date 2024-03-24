package Burger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/* Jasper Yeung
 * 950735279
 * 10/21/21
 * A class that uses JSON files to read real time USD to Yen exchange rate and returns that rate.
 */

public class ExchangeRate {
	private static String yenURL = "http://www.floatrates.com/daily/jpy.json"; //URL for JSON file for conversions
	public double Rate() {
		StringBuilder builder = new StringBuilder();
		double rate = 1; //New rate is created to store a double and be returned
		try {
			URL url = new URL(yenURL); //yenURL is going to be stored in URL object url
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String str = "";
			while(null != (str = br.readLine())) {
				builder.append(str + "\n");
			}
			JSONParser jsonParser = new JSONParser();
			Object obj = jsonParser.parse(builder.toString());
			JSONObject jsonObject = (JSONObject)obj;
			JSONObject usd = (JSONObject)jsonObject.get("usd"); //Create JSON object, read "usd". save it into usd object

			 double number = (double) usd.get("inverseRate"); //Finds the rate from USD to Yen
			 rate = number; //Stores number in rate
			} 
			catch (Exception ex) {
			ex.printStackTrace();
		}
		return rate; //Returns the rate
	}
}