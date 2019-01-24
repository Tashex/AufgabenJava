package aufgabenblatt_4_2;

public class Main {

	public Main() {
		
		Elefant e = new Elefant("Elefant");
		Nashorn n = new Nashorn("Nashorn");
		Delfin d = new Delfin("Delfin");
		Wal w = new Wal("Wal");
		
		Tier t;
		
		t = e;
		t.steckbrief();
		
		t = n;
		t.steckbrief();
		
		t = d;
		t.steckbrief();
		
		t = w;
		t.steckbrief();
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
