import java.util.Scanner;


public class NnaStepenM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Pls insert N");
		int N = input.nextInt();
		System.out.println("Pls insert M");
		int M = input.nextInt();
		N=(int) Math.pow(N, M);	
		System.out.println("N na stepen M = " + N);
		}}

	
