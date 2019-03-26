package composite;

import java.util.List;

public class Muistipiiri implements Laiteosa{
	
	public Muistipiiri(double hinta) {
		this.hinta = hinta;
	}

	private double hinta;
	
	

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
		return "Muistipiiri";
	}

}
