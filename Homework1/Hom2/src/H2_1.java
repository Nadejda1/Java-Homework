import java.util.Scanner;

public class H2_1 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in, "UTF-8");
			System.out.println("Pls inser number 1 :");
			int a = input.nextInt();
			System.out.println("Pls insert number 2 :");
			int b = input.nextInt();
			if (a!=0&&b!=0){
			if (a>0){
					if (b>0){
						System.out.println("The multiplication is positive number.");
					}
						else {
							System.out.println("The multiplication is negative number.");
						}}
					else if (b<0){
						System.out.println("The multiplication is positive number.");
					}
						else {
							System.out.println("The multiplication is negative number.");	
					}}
				else {
					System.out.println("The multiplication is null.");	
				}}}
