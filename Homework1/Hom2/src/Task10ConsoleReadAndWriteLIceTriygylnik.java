import java.util.Scanner;

public class Task10ConsoleReadAndWriteLIceTriygylnik {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in, "UTF-8");

	        System.out.print("Страна на триъгълник= ");
	        Float a = input.nextFloat();
	        System.out.print("Височина на триъгълник= ");
	        Float h = input.nextFloat();
	        Float S = a*h/2;
	        System.out.print("S триъгълник = " + S);
	        			        
	        input.close();

	}

}
