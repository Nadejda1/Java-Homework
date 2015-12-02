public class H4_8 {

	public static void main(String[] args) {
		int[] array1 = { 5, 7, 6, 7, 5 };
		int[] array2 = { 5, 7, 6, 4, 7, 5 };
		boolean symmetric1 = true;
		boolean symmetric2 = true;
		for (int i = 0; i < ((array1.length +1) / 2); i++) {
			if (array1[i] != array1[array1.length - 1 - i]) {
				symmetric1 = false;
			}
		}
		for (int i = 0; i < ((array1.length +1) / 2); i++) {
			if (array2[i] != array2[(array2.length - 1) -i]) {
				symmetric2 = false;
			}
		}
		if (symmetric1 == true) {
			System.out.println("Array1 is symmetrical");
		} else {
			System.out.println("Array1 is not symmetrical");
		}

		if (symmetric2 == true) {
			System.out.println("Array2 is symmetrical");
		} else {
			System.out.println("Array2 is not symmetrical");
		}

	}
}