package composite;

import java.util.Random;

public class TokaFactory extends AbstractFactory{
	
	private Random r;
	
	public TokaFactory() {
		r = new Random();
	}

	@Override
	public Tietokone kasaaTietokone() {
		Tietokone tietokone = new Tietokone();
		tietokone.addLaiteosa(luoKotelo());
		tietokone.addLaiteosa(luoEmolevy());
		// TODO Auto-generated method stub
		return tietokone;
	}

	@Override
	public Laiteosa luoKotelo() {
		Laiteosa kotelo = new Kotelo(r.nextInt(100) + lisaaKate());
		// TODO Auto-generated method stub
		return kotelo;
	}

	@Override
	public Laiteosa luoEmolevy() {
		Laiteosa emo = new Emolevy(r.nextInt(100) + lisaaKate());
		emo.addLaiteosa(new Muistipiiri(r.nextInt(100) + lisaaKate()));
		emo.addLaiteosa(new Verkkokortti(r.nextInt(100) + lisaaKate()));
		emo.addLaiteosa(new Prosessori(r.nextInt(100) + lisaaKate()));
		emo.addLaiteosa(new Naytonohjain(r.nextInt(100) + lisaaKate()));
		// TODO Auto-generated method stub
		return emo;
	}

	@Override
	public double lisaaKate() {
		// TODO Auto-generated method stub
		return 100;
	}

}
