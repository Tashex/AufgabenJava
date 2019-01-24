package aufgabenblatt_4_1;

import aufgabenblatt_3_1.Punkt;

public class Kreis extends GrundForm {

	private Punkt p;
	private double raduis;
	
	public Kreis(String bezeichnung) {
		super(bezeichnung);
	}

	public void setPunktRaduiss(Punkt p, double raduis) {
		this.p = p;
		this.raduis = raduis;
	}
	
	public void ausgabe() {
		System.out.println("X: " + this.p.getX() + " | Y: " + this.p.getY() + " | RADUIS: " + this.raduis);
	}
	
}
