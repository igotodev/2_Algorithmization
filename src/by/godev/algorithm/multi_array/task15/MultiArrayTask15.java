package by.godev.algorithm.multi_array.task15;

/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 
 * */

public class MultiArrayTask15 {

	public static void main(String[] args) {
		int[][] arr;
		int maxNum;

		arr = new int[][] { { 6, -2, 0, 10, -3 }, { 1, -1, 5, -2, 4 }, { -3, 5, -1, 6, -8 }, { 5, -1, -2, 2, -7 },
				{ -1, -6, -9, 2, 5 } };
		maxNum = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > maxNum) {
					maxNum = arr[i][j];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = maxNum;
				}
			}
		}

		System.out.println("Наибольший элемент изначальной матрицы: " + maxNum);
		System.out.println("Mатрица после замены всех нечетных элементов:");
		printMatrix(arr);
	}

	// для красивой отрисовки
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print("+-------");
		}
		System.out.print("+\n");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("   %d\t|", arr[i][j]);
			}
			System.out.print("\n");
			for (int d = 0; d < arr[0].length; d++) {
				System.out.print("+-------");
			}
			System.out.print("+\n");
		}
	}

}
