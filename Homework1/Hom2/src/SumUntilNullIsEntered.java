import java.util.Scanner;


public class SumUntilNullIsEntered {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int b=0;
		for (int i=1;;i++) {                             //как трябва да бъде, когато не се използва брояча?
			System.out.println("Pls insert number:");
			int newa = input.nextInt();
			if (newa!=0){
			b=b+newa;
			System.out.println("Sbora e: "+ b);}
		else {
			System.out.println("Сумирането приключи, сбора е: " + b);
			break;}
		}
			
		}
	}
