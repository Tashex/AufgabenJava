package aufgabenblatt_5_1;

import java.util.Scanner;

public class View {

	private Model model;
	private Controller controller;
	private Scanner scanner;
	
	public View() {}
	
	public View(Model model) {
		this.model = model;
		scanner = new Scanner(System.in);
	}
	
	public void anzeigen() {
		
		System.out.println("Wählen Sie Ihre eingabe");
		System.out.println("<1> Eingabe in Celius");
		System.out.println("<2> Eingabe in Fahrenheit");
		
		int input = scanner.nextInt();
				
		if(input == 1) {
			inputCelsius();
		} else if(input == 2) {
			inputFahrenheit();
		} else {
			System.out.println("Falsche eingabe Methode");
			System.out.println("");
			anzeigen();
		}
		
	}
	
	private void inputCelsius() {
		
		System.out.println("");
		System.out.print("Geben Sie Ihren Wert in CELSIUS ein: ");
		double temp = scanner.nextDouble();
		
		model.setCelsius(temp);
		
		System.out.println("Ihre CELSIUS eingabe in FAHRENHEIT: " + model.getFahrenheit());
		
	}
	
	private void inputFahrenheit() {

		System.out.println("");
		System.out.print("Geben Sie Ihren Wert in FAHRENHEIT ein: ");
		double temp = scanner.nextDouble();
		
		model.setFahrenheit(temp);
		
		System.out.println("Ihre FAHRENHEIT eingabe in CELSIUS: " + model.getCelsius());
		
	}
	
}
