public class H4_classtask2 {

	public static void main(String[] args) {
		int[][] matrix1 = { { 2, 5, 9, 4 }, { 3, 6, 5, 1 }, { 4, 7, 3, 5 },
				{ 3, 8, 9, 2 } };
		int[][] matrix2 = new int[4][4];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = matrix1[i][j];
			}
		}for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				if (matrix2[i][j]%2!=0) {
					matrix2[i][j]=matrix2[i][j]*2;
				}System.out.print(matrix2[i][j] + "  ");
			}System.out.println();
		}
	}
}

		
