import java.util.Scanner;

public class H2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert a:");
		int a = input.nextInt();
		System.out.println("Pls insert b:");
		int b = input.nextInt();
		System.out.println("Pls insert c:");
		int c = input.nextInt();
		System.out.println("Pls insert d:");
		int d = input.nextInt();
		System.out.println("Pls insert e:");
		int e = input.nextInt();
		int x;
		int x1;
		int nummax;
		if (a >= b) {
			if (a >= c) {
				x = a;
			} else
				x = c;
		} else if (b >= c) {
			x = b;
		} else
			x = c;
		if (d >= e) {
			if (d >= c) {
				x1 = d;
			} else
				x1 = c;
		} else if (e >= c) {
			x1 = e;
		} else
			x1 = c;
		if (x > x1) {
			nummax = x;
		} else
			nummax = x1;

		if (nummax == a) {
			System.out.println("Nummax = a = " + nummax);
		}
		if (nummax == b) {
			System.out.println("Nummax = b = " + nummax);
		}
		if (nummax == c) {
			System.out.println("Nummax = C = " + nummax);
		}
		if (nummax == d) {
			System.out.println("Nummax = d = " + nummax);
		}
		if (nummax == e) {
			System.out.println("Nummax = e = " + nummax);
		}
	}
}
