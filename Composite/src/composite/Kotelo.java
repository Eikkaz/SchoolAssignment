package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa{
	
	public Kotelo(double hinta) {
		this.hinta = hinta;
		this.kOsat = new ArrayList<>();
	}

	private double hinta;
	private List<Laiteosa> kOsat;
	
	

	@Override
	public double getHinta() {
		// TODO Auto-generated method stub
		return hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		// TODO Auto-generated method stub
		kOsat.add(osa);
		
	}

	@Override
	public List<Laiteosa> getLaiteosat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Kotelo";
	}

}
