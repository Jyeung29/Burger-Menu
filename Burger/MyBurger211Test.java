package Burger;
/* Jasper Yeung
 * 950735279
 * 10/21/21
 * A class to test Burger211, USA, Korea, and MenuGUI.
 * Creates instances of Burger211 in different franchises and countries.
 */
public class MyBurger211Test {

	public static void main(String[] args) {
		Burger211 Bellevue = new USA(); //Instance of USA of class Burger211
		Bellevue.Promotion(0.1, "10% Off - BTS Bellevue College Concert Special");//Defines promotion and message
		Bellevue.Menu("Bellevue"); //Creates the menu
		
		Burger211 Seattle = new USA(); //Instance of USA of class Burger211
		Seattle.Promotion(0.5, "50% Off - If you're vaccinated");//Defines promotion and message
		Seattle.Menu("Seattle");//Creates the menu
		
		Burger211 Seoul = new Japan();//Instance of Japan of class Burger211
		Seoul.Promotion(0.3,  "Today's Special: 30% off if you watched Kimetsu no Yaiba");//Defines promotion and message
		Seoul.Menu("Tokyo");//Creates the menu
		
		Burger211 Gangnam = new Japan();//Instance of Japan of class Burger211
		Gangnam.Promotion(0.25,  "Today's Special: 25% off if you listen to LiSA");//Defines promotion and message
		Gangnam.Menu("Kyoto");//Creates the menu
	}

}
