public class H4_4 {

	public static void main(String[] args) {
		int[][] massive = new int[5][6];
		int n = 0;
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[0].length; j++) {
				massive[i][j] = 30 - n;
				n++;
				if (massive[i][j]<10) {      // как се принтира точно подредени елементи на матрица?
					System.out.printf(massive[i][j] + "  ");
				}
				else {System.out.printf(massive[i][j] + " ");};
			}
			System.out.println();
		}
	}

}
