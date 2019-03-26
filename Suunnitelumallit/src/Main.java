
public class Main {
	
public static void main(String[] args) {
		
		System.out.println("Opiskeluaikana pukeuduin:\n");
		
		Jasper jasper = new Jasper(new AdidasFactory());
		jasper.luoVaatekerrasto();
		jasper.luetteleVaatteet();
		
		System.out.println("\nValmistuttuani oli varaa:\n");
		jasper.setTehdas(new BossFactory());
		jasper.luoVaatekerrasto();
		jasper.luetteleVaatteet();
		
	}

}
