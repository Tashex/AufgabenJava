package aufgabenblatt_1_2;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] ints = {2,4,32};
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		for(int l : ints) {
			int a = 0;
			for(int i = 0; i < l; i++) {
				a = a + input;
			}
			System.out.println("" + input + " * " + l + " = " + a);
		}
		s.close();
	}
}