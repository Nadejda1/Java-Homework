public class LoopsForWhileDoWhile {
	public static void main(String[] args) {

		int newnum = 1;

		while (newnum <= 33) {
			if (newnum % 7 == 0 || newnum % 11 == 0) {
				System.out.print(newnum + ", ");
			}
			newnum++;
		}
		for (; newnum >= 34 && newnum <= 60; newnum++) {
			if (newnum % 7 == 0 || newnum % 11 == 0) {
				System.out.print(newnum + ", ");
			}
		}
		do {
			if (newnum % 7 == 0 || newnum % 11 == 0) {
				System.out.print(newnum + ", ");
			}
			newnum++;
		} while (newnum <= 100);

		System.out
				.println (" - всички числа от 1 до 100, които се делят на 7 и 11. ");
	}
}
