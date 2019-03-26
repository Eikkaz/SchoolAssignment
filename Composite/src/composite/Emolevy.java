package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa{
	
	public Emolevy(double hinta) {
		super();
		this.hinta = hinta;
		this.eOsat = new ArrayList<>();
	}

	private double hinta;
	private List<Laiteosa> eOsat;

	@Override
	public double getHinta() {
		// TODO Auto-generated method stub
		return hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		// TODO Auto-generated method stub
		eOsat.add(osa);
		
	}

	@Override
	public List<Laiteosa> getLaiteosat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Emolevy";
	}

}
