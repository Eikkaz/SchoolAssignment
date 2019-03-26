package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Eka kone: ");
		AbstractFactory eka = new EkaFactory();
		Tietokone k1 = eka.kasaaTietokone();
		System.out.println("Koneen hinta: " + k1.getHinta() + " euroa");
		System.out.println("Toka kone: ");
		AbstractFactory toka = new EkaFactory();
		Tietokone k2 = toka.kasaaTietokone();
		System.out.println("Koneen hinta: " + k2.getHinta() + " euroa");

	}

}
