package aufgabenblatt_4_1;

import aufgabenblatt_3_1.Punkt;

public class Viereck extends GrundForm {

	private Punkt[] punkte = new Punkt[4];
	
	public Viereck(String bezeichnung) {
		super(bezeichnung);
	}

	public void setPunkte(Punkt... punkte) {
		for(int i = 0; i < this.punkte.length; i++) {
			this.punkte[i] = punkte[i];
		}
	}
	
	public void ausgabe() {
		for(int i = 0; i < this.punkte.length; i++) {
			Punkt p = this.punkte[i];
			System.out.println("Punkt-" + (i+1) + " | X: " + p.getX() + " | Y: " + p.getY());
		}
	}
	
}
