package aufgabenblatt_3_1;

import aufgabenblatt_3_1.Punkt;

public class Main {

	public Main() {

		Punkt a = new Punkt(15, 20);
		Punkt b = new Punkt(a);
		Punkt c = new Punkt();
		
		c.setX(30);
		c.setY(40);
		
		System.out.println("Punkt B<" + b.getX() + "|" + b.getY() + ">");
		System.out.println("Abstand von Punkt B zu <0|0>: " + b.abstand());
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
