import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Моля въведете Име: ");
        String name = input.nextLine();
        
        System.out.println("Моля въведете Фамилия : ");
        String surname = input.nextLine();
        
        System.out.println("Моля въведете Години: ");
        Byte age = input.nextByte();
        
        input.nextLine();                              //Tazi komanda se slaga kogato preskacha reda
        
        System.out.println("Моля въведете пол (М/Ж): ");	//ASK
        char sex = input.next().charAt(0);                  //kak daizpolzvame char kato go nqma v metoda
        
        System.out.println("Моля въведете ЕГН: ");
        Long EGN = input.nextLong();
        
        System.out.println("Моля въведете Телефон : ");
        Long phone = input.nextLong();

        System.out.println("Име: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Години : " + age);
        System.out.println("Пол : " + sex);
        System.out.println("ЕГН : " + EGN);
        System.out.println("Телефон : " + phone);
                
        input.close();
	}

}
