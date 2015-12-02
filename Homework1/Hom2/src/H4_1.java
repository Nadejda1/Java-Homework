import java.util.Scanner;

public class H4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Lenght: ");
		int n = input.nextInt();
		int[] massive = new int[n];
		int sum = 0;
		for (int i = 0; i < massive.length; i++) {
			System.out.println("input number: ");
			massive[i]=input.nextInt();
			if (massive[i] % 2 == 0) {
			sum = sum + massive[i];
			}
		}
		System.out.println("Sum of even inputs is: " + sum);

	}
}