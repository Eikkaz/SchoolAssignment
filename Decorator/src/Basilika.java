
public class Basilika extends TayteDecorator{

	public Basilika(Pizza pohja) {
		super(pohja);
		// TODO Auto-generated constructor stub
	}
	
	public double getHinta() {
		return super.getHinta() + 1;
		
	}
	
	public String getNimi() {
		return super.getNimi()+ ", Basilika";
	}

}
