package aufgabenblatt_1_3;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	@SuppressWarnings("resource")
	public Main() {

		String result = "";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Geben Sie eine IPv4-Adresse ein: ");
		String ip1 = s.nextLine();
		System.out.println("Geben Sie eine Subnetz-Maske ein: ");
		String sub = s.nextLine();
		
		String[] ip1Split = ip1.split(Pattern.quote("."));
		String[] subSplit = sub.split(Pattern.quote("."));
		
		for(int i = 0; i < 4; i++) {
			
			int a = Integer.parseInt(ip1Split[i]);
			int b = Integer.parseInt(subSplit[i]);
			
			if(b > 0) {
				result = result + a + ".";
			} else {
				result = result + "0" + ".";
			}
			
		}
		
		System.out.println("-> " + result);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}