public class H4_6 { // Мехурчето, метод за сортиране на масив. В случая по възходящ ред.

	public static void main(String[] args) {
		int[] array = { 9, 3, 7, 2, 4 };

		int a = 0;

		for (int i = 1; i < array.length; i++) {
			for (int j = array.length - 1; j >= i; j--) {
				if (array[j - 1] > array[j]) {
					a = array[j - 1];
					array[j - 1] = array[j];
					array[j] = a;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);

		}

	}
}
