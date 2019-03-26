
public class Farkut implements Vaate{
	
private String[] brand;
	
	public Farkut(String valmistaja) {
		this.brand = valmistaja.split("F");
	}

	public String toString() {
		return this.brand[0] + " farkut";
	}

}
