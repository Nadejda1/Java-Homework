import java.util.Scanner;

public class task6ConsoleReadAndWriteFormula {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

        System.out.print("r= ");
        int r = input.nextInt();
        float pi = 3.14f;
        float P = 2*pi*r;
        float S = pi*r*r;
        System.out.print("S = " + S + ", P = " + P );			        
        input.close();


	}

}
