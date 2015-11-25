import java.util.Scanner;

public class task7ConsoleReadCalculateRestPrint {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in, "UTF-8");

	        System.out.print("Въведете число: ");
	        int a = input.nextInt();
	        int b = a % 5;
	        int c = a % 7;
	        boolean b1 = b==0;
	        boolean c1 = c==0;
	        boolean result = b1&&c1;
	        System.out.println("Числото се дели на 5 и 7: " + result);
	        System.out.print((a/5)/7);
	        			        
	        input.close();

	}

}
