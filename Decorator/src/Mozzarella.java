
public class Mozzarella extends TayteDecorator{

	public Mozzarella(Pizza pohja) {
		super(pohja);
		
	}
	public double getHinta() {
		return super.getHinta() + 2;
		
	}
	
	public String getNimi() {
		return super.getNimi()+ ", Mozzarella";
	}

}
