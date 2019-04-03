
public class Tomaatti extends TayteDecorator{
	
	public Tomaatti(Pizza pohja) {
		super(pohja);
	}
	
	public double getHinta() {
		return super.getHinta() + 1;
		
	}
	
	public String getNimi() {
		return super.getNimi()+ ", Aurinkokuivattu tomaatti";
	}

}
