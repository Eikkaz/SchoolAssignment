
public class Kinkku extends TayteDecorator{

	public Kinkku(Pizza pohja) {
		super(pohja);
		// TODO Auto-generated constructor stub
	}
	
	public double getHinta() {
		return super.getHinta() + 3;
		
	}
	
	public String getNimi() {
		return super.getNimi()+ ", Serrano Kinkku";
	}

}
