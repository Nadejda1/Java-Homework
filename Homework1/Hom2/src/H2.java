import java.util.Scanner;

public class H2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Моля въведете число:");
		int a = input.nextInt();
		if (1 <= a&&a <= 5) {
			int b = a % 2;
			if (b == 0) {
				System.out.println("The number is even");
			} else
				System.out.println("The number is odd");
		} else if (6 <= a&&a <= 15) {
			int b = a % 3;
			if (b == 0) {
				System.out.println("The number is devided on 3 without a rest");
			} else {
				System.out.println("The number is devided on 3 with a rest");
		}}
			else if (a>=0){
if (a>0){
	System.out.println("The number is positive");
}
else {
	System.out.println("The number is null");
}}
	if (a<0){
		System.out.println("The number is negative");
	}
	}}	
