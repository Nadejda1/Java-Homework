import java.util.Scanner;

public class H3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert num:");
		int a = input.nextInt();
		int min = a;
		int max = a;
		for (int i = 1; i < 5; i++) {
			System.out.println("Pls insert num:");
			int num = input.nextInt();
			if (min > num) {
				min = num;
			}
			if (max < num) {
				max = num;
			}
		}
		System.out.println("Max = " + max + "; Min = " + min);

	}

}
