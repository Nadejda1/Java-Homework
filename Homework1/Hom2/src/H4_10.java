import java.util.Scanner;

public class H4_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Input number a: ");
		int a = input.nextInt();
		System.out.println("Input number b; b>a: ");
		int b = input.nextInt();
		if (b <= a) {
			System.out.println("You need to enter b>a: ");
		}
		int[] c = new int[b - a - 1]; // ako a i b ne se vkluchvat, inache
										// [b-a+1]

		for (int i = 0; i < (b - a - 1); i++) {
			c[i] = a + 1 + i;
			if (c[i] % 3 == 0) {
				System.out.print(c[i] + ", ");
			}else {System.out.print("There is no numbers between \"a\" and \"b\" to be devided by 3 with no rest.");
		}
	}
	}}
