package by.godev.algorithm.multi_array.task9;

/*
 * 9.  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму.
 * */

public class MultiArrayTask9 {

	public static void main(String[] args) {
		double[][] arr;
		double[] arrSum;
		double maxSum;
		int maxColumn;

		arr = new double[][] { { 2.2, 3.1, 12.0, 34.9, 12 }, { 2, 1.1, 23.5, 4.2, 2 }, { 4.3, 5, 33.1, 2.9, 8.1 },
				{ 5.8, 7.1, 22, 7.3, 9.9 }, { 22.2, 3.6, 4.9, 12, 1.8 } };
		arrSum = new double[arr.length];
		maxSum = 0;
		maxColumn = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrSum[j] += arr[i][j];
			}
		}

		printTable(arrSum);

		for (int i = 0; i < arrSum.length; i++) {
			if (arrSum[i] > maxSum) {
				maxSum = arrSum[i];
				maxColumn = i;
			}
		}

		System.out.printf("Максимальная сумма содержится в %d столбце и равна %.2f\n", maxColumn + 1, maxSum);
	}

	// для красивой отрисовки
	public static void printTable(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("+---------------");
		}
		System.out.print("+\n");
		for (int j = 0; j < arr.length; j++) {
			System.out.printf("\t%.2f\t|", arr[j]);
		}
		System.out.print("\n");
		for (int d = 0; d < arr.length; d++) {
			System.out.print("+---------------");
		}
		System.out.print("+\n");
	}

}
