package by.godev.algorithm.sort_array.task3;

/*
 * 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= .... <= a_n.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, 
 * а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется. 
 * Написать алгоритм сортировки выбором.
 * */

public class SortArrayTask3 {

	public static void main(String[] args) {
		int[] arr;

		arr = new int[] { 2, 4, 6, 8, 10, 20, 35, 40, 50 };

		selectionSort(arr);

		printTable(arr);

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}

			int mid = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = mid;
		}

	}

	// для красивой отрисовки
	public static void printTable(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("+-------");
		}
		System.out.print("+\n");
		for (int j = 0; j < arr.length; j++) {
			System.out.printf("  %d\t|", arr[j]);
		}
		System.out.print("\n");
		for (int d = 0; d < arr.length; d++) {
			System.out.print("+-------");
		}
		System.out.print("+\n");
	}

}
