package app;

import java.util.ArrayList;
import java.util.List;

public class McBuilder implements Burger_if {
	
	private List<Object> mac;

	@Override
	public void createNewBurger() {
		mac = new ArrayList<Object>();

	}

	@Override
	public void getBread() {
		mac.add(new Bread("Brioche"));

	}

	@Override
	public void getCheese() {
		mac.add(new Cheese("Cheddar"));

	}

	@Override
	public void getVegetables() {
		mac.add(new Vegetables("Onion"));

	}

	@Override
	public void getHamburgerPatty() {
		mac.add(new HamburgerPatty("Beef"));

	}
	
	public List<Object> getBurger(){
		return mac;
	}

}
