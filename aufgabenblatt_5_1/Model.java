package aufgabenblatt_5_1;

public class Model {

	private double temp;
	
	public Model() {}
	
	public Model(double temp) {
		this.temp = temp;
	}
	
	public void setCelsius(double t) {
		this.temp = t;
	}
	
	public double getCelsius() {
		return (this.temp - 32) / 1.8;
	}
	
	public void setFahrenheit(double t) {
		this.temp = t;
	}
	
	public double getFahrenheit() {
		return (this.temp + 32) * 1.8;
	}
	
}
