package aufgabenblatt_3_3;

public class Main {

	public Main() {
		
		IPAdresse adresse1 = new IPAdresse("243.135.258.42");
		System.out.println("IP-1 >> " + adresse1.getIP());
		
		IPAdresse adresse2 = new IPAdresse();
		adresse2.setIP(134, 32, 67, 3);
		System.out.println("IP-2 >> " + adresse2.getIP());
				
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
