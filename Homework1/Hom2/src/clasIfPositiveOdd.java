import java.util.Scanner;

public class clasIfPositiveOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Моля въведете число :");
		int num = input.nextInt();
		if (num < 0) {
			int b = num % 2;
			boolean result = b == 0;
			if (result) {
				System.out.print("Negative Even");
			} else
				System.out.print("Negative Odd");
		} else if (num>0)		{
			int b = num % 2;
			boolean result = b == 0;
			if (result) {
				System.out.print("Positive Even");
			} else
				System.out.print("Negative Odd");
		}else {
			System.out.print("Null");
		}
	}
}
