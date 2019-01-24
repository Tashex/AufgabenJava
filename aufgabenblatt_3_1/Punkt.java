package aufgabenblatt_3_1;

public class Punkt {

	private double x,y;
	
	public Punkt() {
		
	}
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Punkt(Punkt p) {
		this.x = p.getX();
		this.y = p.getY();
	}

	public double abstand() {
		double d = (this.x*this.x)+(this.y*this.y);
		d = Math.sqrt(d);
		return d;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
