
public abstract class TayteDecorator implements Pizza{
	
	protected Pizza pizzaPohja;
	
	public TayteDecorator(Pizza pohja) {
		this.pizzaPohja = pohja;
	}
	
	public double getHinta() {
		return pizzaPohja.getHinta();	
	}
	
	public String getNimi() {
		return pizzaPohja.getNimi();
	}

}
