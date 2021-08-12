package by.godev.algorithm.multi_array.task13;

/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * */

public class MultiArrayTask13 {

	public static void main(String[] args) {
		int[][] arr;
		int[] midArr;

		arr = new int[][] { { 3, -4, 5, 9, -5 }, { 3, -1, 5, -2, 6 }, { -3, 2, 3, -9, -8 }, { 5, 4, -2, 7, -7 },
				{ 4, -4, -9, 3, 8 } };
		midArr = new int[arr.length];

		System.out.print("\nСтолбцы отсортированны по возрастанию:\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				midArr[j] = arr[j][i];
				if (j == arr.length - 1) {
					bubbleSort(midArr);
					for (int h = 0; h < arr.length; h++) {
						arr[h][i] = midArr[h];
					}
				}
			}
		}
		printMatrix(arr);

		System.out.print("\nСтолбцы отсортированны по убыванию:\n");
		reverseMatrixColumn(arr);
		printMatrix(arr);

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int mid = 0;
					mid = arr[i];
					arr[i] = arr[j];
					arr[j] = mid;
				}
			}
		}

	}

	public static void reverseMatrixColumn(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length / 2; j++) {
				int mid = 0;
				mid = arr[j][i];
				arr[j][i] = arr[(arr.length - 1) - j][i];
				arr[(arr.length - 1) - j][i] = mid;
			}
		}
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
