package app;

import java.util.Random;

public class Arvuuttaja {
	
	private Random r;
	
	public Arvuuttaja() {
		
	}
	
	public boolean arvaus(int arvaus, Object o) {
		Memento m = (Memento) o;
		if(arvaus == m.getLuku()) {
			System.out.println(arvaus + " oli oikein");
			return true;
		}
		else {
			System.out.println(arvaus + " tais olla väärin");
		}
		return false;
	}
	
	public Memento liittyyPeliin() {
		r = new Random();
		return new Memento(r.nextInt(10)+ 1);
	}
	
	private class Memento {
		private int luku;

		public Memento(int luku) {
			this.luku = luku;
		}

		public int getLuku() {
			return luku;
		}
		
	}

}
