package aufgabenblatt_2_2;
import java.util.Arrays;

public class Main {

	public Main() {
		int[] werte1 = {10,55,23,18,5,99,22,33,1,38};
		int[] werte2 = {10,55,23,18,5,99,22,33,1,38};
		bubblesort(werte1);
		test(werte2);
		System.out.println("Sortiert mit Bubblesort:");
		for(int i = 0; i < werte1.length; i++) {
			System.out.print(werte1[i]);
			if(i != (werte1.length-1))
				System.out.print(" > ");
		}
		System.out.println();
		System.out.println("Sortiert mit Java:");
		for(int i = 0; i < werte2.length; i++) {
			System.out.print(werte2[i]);
			if(i != (werte2.length-1))
				System.out.print(" > ");
		}
	}
	
	public void bubblesort(int[] zusortieren) {
		int temp;
		for (int i = 1; i < zusortieren.length; i++) {
			for (int j = 0; j < zusortieren.length - i; j++) {
				if (zusortieren[j] > zusortieren[j + 1]) {
					temp = zusortieren[j];
					zusortieren[j] = zusortieren[j + 1];
					zusortieren[j + 1] = temp;
				}

			}
		}
	}
	
	public void test(int[] ints) {
		Arrays.sort(ints);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
