
public class PizzaMain {
	
	public static void main(String[] args) {
		
		Pizza kinkku = new Kinkku(new Mozzarella(new Tomaatti(new PizzaPohja())));
		Pizza vege = new Basilika(new Mozzarella(new Tomaatti(new PizzaPohja())));
		Pizza klassikko = new Kinkku(new Mozzarella(new Basilika((new Tomaatti(new PizzaPohja())))));
		
		
		System.out.println("Kinkkupizza");
		System.out.println(kinkku.getNimi() + ", " + kinkku.getHinta() + " euroa");
		System.out.println("");
		System.out.println("Vegepizza");
		System.out.println(vege.getNimi() + ", " + vege.getHinta() + " euroa");
		System.out.println("");
		System.out.println("Italian Klassikko");
		System.out.println(klassikko.getNimi() + ", " + klassikko.getHinta() + " euroa");
	}

}
