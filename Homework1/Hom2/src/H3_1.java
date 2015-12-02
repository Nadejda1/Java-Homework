import java.util.Scanner;


public class H3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert N:");
		int N = input.nextInt();
		int a = 0;
		
		do {
			System.out.println(a);
			a++;
		} while (a<=N);

	}

}
