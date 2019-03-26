
public class Lippis implements Vaate{
	
private String[] brand;
	
	public Lippis(String valmistaja) {
		this.brand = valmistaja.split("F");
	}

	public String toString() {
		return this.brand[0] + " lippis";
	}

}
