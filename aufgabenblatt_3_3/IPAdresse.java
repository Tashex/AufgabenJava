package aufgabenblatt_3_3;

import java.util.regex.Pattern;

public class IPAdresse {

	private String adress;
	
	public IPAdresse() {}
	
	public IPAdresse(int a, int b, int c, int d) {
		String adress = a + "." + b + "." + c + "." + d;
		checkAdress(adress);
	}
	
	public IPAdresse(String adress) {
		checkAdress(adress);
	}

	public boolean setIP(int a, int b, int c, int d) {
		String adress = a + "." + b + "." + c + "." + d;
		return checkAdress(adress);
 	}
	
	public boolean setIP(String adress) {
		return checkAdress(adress);
	}
	
	public String getIP() {
		return this.adress;
	}
	
	private boolean checkAdress(String adress) {
		try {
			boolean valid = true;
			this.adress = adress;
			String[] c = adress.split(Pattern.quote("."));
			for(String s : c) {
				int i = Integer.valueOf(s);
				if(i < 0 || i > 255) {
					this.adress = "0.0.0.0";
					valid = false;
				}
			}
			return valid;
		}catch(Exception ex) {
			this.adress = "0.0.0.0";
			return false;
		}
	}
	
}