
public class Kengat implements Vaate{
	
	private String[] brand;
	
	public Kengat(String valmistaja) {
		this.brand = valmistaja.split("F");
	}
	
	public String toString() {
		return this.brand[0] + " kengät";
	}

}
