import java.util.Scanner;

public class H2_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert a:");
		int a = input.nextInt();
		System.out.println("Pls insert b:");
		int b = input.nextInt();
		System.out.println("Pls insert c:");
		int c = input.nextInt();
		double D = Math.pow(((double)a),2.0d) - 4*a*c;       //b*b-4ac
		if (D>=0) {
		double x1 = -b+Math.sqrt (D);
		double x2 = -b-Math.sqrt (D);
		System.out.println("X1 = " + x1 + "; X2 = " + x2);
		}
		else {
			System.out.println("Уравнението няма реални корени.");
		}
	}
}
