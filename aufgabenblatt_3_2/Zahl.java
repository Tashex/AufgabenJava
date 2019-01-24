package aufgabenblatt_3_2;

public class Zahl {

	private int zahl;

	private String[] a = { "Null", "Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun" };

	private String[] b = { "Nichts", "Zehn", "Zwanzig", "Dreißig", "Vierzig", "Fünfzig", "Sechzig", "Achzig","Neunzig" };

	public Zahl(int zahl) {

		this.zahl = zahl;

	}

	public int getZahl() {

		return zahl;

	}

	public void setZahl(int zahl) {

		this.zahl = zahl;

	}

	public void spell() {

		String text = "";

		if (this.zahl < 10) {

			text = a[this.zahl];

		} else if (this.zahl < 100) {

			char[] c = Integer.toString(this.zahl).toCharArray();

			text = a[Integer.parseInt("" + c[1])] + " und " + b[Integer.parseInt("" + c[0]) - 1];

		} else if (this.zahl < 1000) {

			char[] c = Integer.toString(this.zahl).toCharArray();

			text = a[Integer.parseInt("" + c[0])] + " hundert " + a[Integer.parseInt("" + c[2])] + " und " + b[Integer.parseInt("" + c[1]) - 1];

		}

		System.out.println("-> " + text);

	}

}
