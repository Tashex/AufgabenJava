package aufgabenblatt_4_1;

import aufgabenblatt_3_1.Punkt;

public class Main {
	
	public Main() {
		
		Viereck v = new Viereck("Viereck-1");
		Kreis k = new Kreis("Kreis-1");
		
		Punkt p1 = new Punkt(1, 3);
		Punkt p2 = new Punkt(4, 3);
		Punkt p3 = new Punkt(5, 8);
		Punkt p4 = new Punkt(1, 8);
		
		double raduis = 2.5;
		
		v.setPunkte(p1,p2,p3,p4);
		k.setPunktRaduiss(p1, raduis);
		
		v.ausgabe();
		k.ausgabe();
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
