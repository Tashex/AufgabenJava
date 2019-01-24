package aufgabenblatt_4_2;

public abstract class Tier {

	private String name;
	
	public Tier(String name) {
		this.name = name;
	}
	
	public void steckbrief() {
		System.out.println(this.name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
