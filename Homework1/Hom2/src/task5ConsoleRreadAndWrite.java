import java.util.Scanner;

public class task5ConsoleRreadAndWrite {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in, "UTF-8");

	        System.out.println("Моля въведете число 1:" );
	        int num1 = input.nextInt();
	        
	        System.out.println("Моля въведете число 2:");
	        int num2 = input.nextInt();
	        
	        System.out.println("Моля въведете число 3:");
	        int num3 = input.nextInt();
	        
	        System.out.println("Моля въведете число 4:");
	        int num4 = input.nextInt();

	        System.out.println("Сбора на числата е = " + (num1 + num2 + num3 + num4));
	        
	        input.close();

	}

}
