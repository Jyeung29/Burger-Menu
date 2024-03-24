package Burger;
import java.util.ArrayList;

/* Jasper Yeung
 * 950735279
 * 10/21/21
 * An abstract class. Creates 3 instances of BurgerInfo for 3 burgers and thier information.
 * Has methods to return a burger's name, price, toppings, and the number of burgers.
 * Also has abstract methods of Menu() and Promotion().
 */

public abstract class Burger211 {
	
	private ArrayList<BurgerInfo> Burger = new ArrayList<>(); //Arraylist Burger for adding the instances of burgers for getHowManyBurgers()
	
	Burger211(){
		BurgerInfo b1 = new BurgerInfo();
		b1.name = "Inheritance Burger"; //Instance of BurgerInfo with information of b1
		b1.price = 3.0;
		b1.toppings = "beef patty, tomato, onion, ranch source";
		Burger.add(b1);//Adds to Burger arraylist
		
		BurgerInfo b2 = new BurgerInfo(); //Instance of BurgerInfo with information of b2
		b2.name = "Overriding Burger";
		b2.price = 2.0;
		b2.toppings = "beef patty, lime, onion, lettuce, tomato source";
		Burger.add(b2);//Adds to Burger arraylist
		
		BurgerInfo b3 = new BurgerInfo();//Instance of BurgerInfo with information of b3
		b3.name = "Polymorphism Burger";
		b3.price = 3.5;
		b3.toppings = "chicken breast, gallo, onion, ranch source";
		Burger.add(b3); //Adds to Burger arraylist
	}
	
	public String getBurgerName(int i) { //Returns the burger's name
		return Burger.get(i).name;
	}
	
	public double getBurgerPrice(int i) { //Returns burger's price
		return Burger.get(i).price;
	}
	
	public String getBurgerToppings(int i) { //Returns burger's toppings
		return Burger.get(i).toppings;
	}
	
	public int getHowManyBurgers() { //Returns how many burgers in the Burger arraylist
		return Burger.size();
	}
	//Abstract methods
	abstract void Menu(String franchise);
	abstract void Promotion(Double discountRate, String promote);
}
