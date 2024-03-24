package Burger;
import java.text.DecimalFormat;

/* Jasper Yeung
 * 950735279
 * 10/21/21
 * A subclass of Burger211 with overloaded methods Promotion() and Menu().
 * Calculates discount
 */

public class USA extends Burger211{
	private double discountRate = 0;
	private String pro = "";
	private String[] burgerNamePrice = new String[getHowManyBurgers()];
	
	public void Promotion(Double discount, String promote) { //Overloaded method with new toppings for the 3rd burger
		discountRate = discount;
		pro = promote;
	}
	
	public void Menu(String franchise) {//Calculates prices and creates a menu
		DecimalFormat df = new DecimalFormat("#, ###, ###.00");
		for(int i = 0; i < getHowManyBurgers(); i++) {//Repeats for all burgers
			burgerNamePrice[i] = getBurgerName(i) + " / " + "$" + df.format(getBurgerPrice(i) * (1.0 - discountRate));//stores burger name, and calculates price to be stored in burgerNamePrice[]
			if(discountRate > 0.0) {//If there is a discount adds the regular price before discount
				burgerNamePrice[i] += " (regular: " + df.format(getBurgerPrice(i))+")";
			}
		}
		new MenuGUI(franchise,pro,burgerNamePrice[0],getBurgerToppings(0),burgerNamePrice[1],getBurgerToppings(1),burgerNamePrice[2],getBurgerToppings(2));//Uses MenuGUI to display menu
	}
}
