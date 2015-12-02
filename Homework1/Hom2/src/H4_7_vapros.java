
import java.util.Scanner;

public class H4_7_vapros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Number: ");
		int n = input.nextInt();
		int[] array = { 9, 3, 7, 2, 4, 7 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				System.out.println("i = " + i);
				break;
			}
			
		}System.out.println("No element is equal to input number:" );
		// Как да прекратя цикъла ако if е изпълнено?

	}
}
