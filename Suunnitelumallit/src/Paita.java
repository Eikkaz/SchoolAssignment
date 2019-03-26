
public class Paita implements Vaate {
	
private String[] brand;
	
	public Paita(String valmistaja) {
		this.brand = valmistaja.split("F");
	}

	public String toString() {
		return this.brand[0] + " t-paita";
	}

}
