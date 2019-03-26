package composite;

import java.util.List;

public class Verkkokortti implements Laiteosa{
	
	private double hinta;
	
	public Verkkokortti(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		// TODO Auto-generated method stub
		return hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Laiteosa> getLaiteosat() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "verkkokortti";
	}

}
