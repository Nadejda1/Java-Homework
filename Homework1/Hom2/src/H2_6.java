import java.util.Scanner;

public class H2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert your score from 0 to 9:");
		int a = input.nextInt();
		if (a >= 1 && a <= 9) {
			if (a >= 1 && a <= 3) {
				a *= 5;
				System.out.println(a + " (Your score were multiplied by 5)");
			} else if (a >= 4 && a <= 6) {
				a *= 10;
				System.out.println(a + " (Your score were multiplied by 10)");
			} else {
				a *= 50;
			System.out.println(a + " (Your score were multiplied by 50)");
		}} else {
			System.out.println("Wrong score:");
		}}}


