package by.godev.algorithm.multi_array.task12;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 * */

public class MultiArrayTask12 {

	public static void main(String[] args) {
		int[][] arr;

		arr = new int[][] { { 3, -4, 5, 9, -5 }, { 3, -1, 5, -2, 6 }, { -3, 2, 3, -9, -8 }, { 5, 4, -2, 7, -7 },
				{ 4, -4, -9, 3, 8 } };

		System.out.print("\nСтроки отсортированны по возрастанию:\n");
		for (int i = 0; i < arr.length; i++) {
			bubbleSort(arr[i]);
		}
		printMatrix(arr);

		System.out.print("\nСтроки отсортированны по убыванию:\n");
		for (int i = 0; i < arr.length; i++) {
			// переворачиваем элементы в уже отсортированных по возрастанию массивах
			reverseArray(arr[i]);
		}
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

	public static void reverseArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int mid = 0;
			mid = arr[i];
			arr[i] = arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = mid;
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
