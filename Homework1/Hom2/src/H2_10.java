import java.util.Scanner;

public class H2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert a:");
		int a = input.nextInt();
		int b;
		int c;
		if (a==0){
			System.out.print("Null");}
		else if (a<0||a>999){                   
			System.out.print("Number is out of appointed limits");}
		if (a >= 100 && a <= 999) {
			c = a / 100;
			switch (c) {
			case 1:
				System.out.print("One hundred ");
				a = a - 100;
				break;
			case 2:
				System.out.print("Two hundred ");
				a = a - 200;
				break;
			case 3:
				System.out.print("Three hundred ");
				a = a - 300;
				break;
			case 4:
				System.out.print("Four hundred ");
				a = a - 400;
				break;
			case 5:
				System.out.print("Five hundred ");
				a = a - 500;
				break;
			case 6:
				System.out.print("Six hundred ");
				a = a - 600;
				break;
			case 7:
				System.out.print("Seven hundred ");
				a = a - 700;
				break;
			case 8:
				System.out.print("Eight hundred ");
				a = a - 800;
				break;
			case 9:
				System.out.print("Nine hundred ");
				a = a - 900;
				break;
			}
			if (a!=0){
				System.out.print("and ");		
			}
		}
		if (a >= 20 && a <= 99) {
			b = a / 10;
			switch (b) {
			case 2:
				System.out.print("Twenty ");
				a = a - 20;
				break;
			case 3:
				System.out.print("Thirty ");
				a = a - 30;
				break;
			case 4:
				System.out.print("Forty ");
				a = a - 40;
				break;
			case 5:
				System.out.print("Fifty ");
				a = a - 50;
				break;
			case 6:
				System.out.print("Sixty ");
				a = a - 60;
				break;
			case 7:
				System.out.print("Seventy ");
				a = a - 70;
				break;
			case 8:
				System.out.print("Eighty ");
				a = a - 80;
				break;
			case 9:
				System.out.print("Ninety ");
				a = a - 90;
				break;
			}
		}
		if (a >= 1 && a <= 19) {
			switch (a) {
			case 1:
				System.out.print("One");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			case 10:
				System.out.print("Ten");
				break;
			case 11:
				System.out.print("Eleven");
				break;
			case 12:
				System.out.print("Twelve");
				break;
			case 13:
				System.out.print("Thirteen");
				break;
			case 14:
				System.out.print("Fourteen");
				break;
			case 15:
				System.out.print("Fifteen");
				break;
			case 16:
				System.out.print("Sixteen");
				break;
			case 17:
				System.out.print("Seventeen");
				break;
			case 18:
				System.out.print("Eightteen");
				break;
			case 19:
				System.out.print("Nineteen");
				break;
			}
		}
	}
}
