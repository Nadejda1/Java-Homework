import java.util.Scanner;

public class clasIfPositiveOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Моля въведете число :");
		int num = input.nextInt();
		int b = num % 2;
		if (num < 0) {
			if (b==0) 
			{
				System.out.print("Negative Even");
			} else
				System.out.print("Negative Odd");
		} else if (num>0)		
			if (b==0) {
				System.out.print("Positive Even");
			} else
				System.out.print("Positive Odd");
		else {
			System.out.print("Null");
		}
	}
}
