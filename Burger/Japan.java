package Burger;
import java.text.DecimalFormat;

/* Jasper Yeung
 * 950735279
 * 10/21/21
 * A subclass of Burger211 with overloaded methods Promotion(), getBurgerToppings(), and Menu().
 * The Japan class reads a real time JSON USD to Yen exchange rate
 * to calculate the prices.
 */

public class Japan extends Burger211{
	private double discountRate;
	private String pro;
	private String[] burgerNamePrice = new String[getHowManyBurgers()];
	
	public String getBurgerToppings(int i) { //Overloaded method with new toppings for the 3rd burger
		if(i == 2) {
			return ("chicken katsu, onion, curry source");
		}else {
			return super.getBurgerToppings(i);
		}
	}
	
	public void Promotion(Double discount, String promote) { //Overloaded method to establish discount rates
		discountRate = discount;
		pro = promote;
	}
	
	public void Menu(String franchise) { //Calculates prices and creates a menu
		ExchangeRate yen = new ExchangeRate();
		DecimalFormat df = new DecimalFormat("#"); //Makes sure numbers are not in decimals
		for(int i = 0; i < getHowManyBurgers(); i++) { //Repeats for all burgers
			burgerNamePrice[i] = getBurgerName(i) + " / " + df.format(getBurgerPrice(i) * yen.Rate() * (1.0 - discountRate)) + " Yen"; //stores burger name, and calculates price to be stored in burgerNamePrice[]
			if(discountRate > 0.0) { //If there is a discount adds the regular price before discount
				burgerNamePrice[i] += " (regular: " + df.format(getBurgerPrice(i) * yen.Rate())+")";
			}
		}
		new MenuGUI(franchise,pro,burgerNamePrice[0],getBurgerToppings(0),burgerNamePrice[1],getBurgerToppings(1),burgerNamePrice[2],getBurgerToppings(2)); //Uses MenuGUI to display menu
	}
}
