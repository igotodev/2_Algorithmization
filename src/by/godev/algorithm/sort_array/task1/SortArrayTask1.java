package by.godev.algorithm.sort_array.task1;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один  массив,  включив  второй  массив  между  k-м  и  (k+1)-м  элементами  первого, 
 * при этом не используя дополнительный массив.
 * */

public class SortArrayTask1 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int k;

		arr1 = new int[] { 22, 31, 23, 45, 34, 2, 3, 60, 90, 100 };
		arr2 = new int[] { 50, 12, 20, 76, 15, 85, 105 };

		k = 5;

		System.out.println("Совмещенный массив сформирован: ");
		printTable(pasteToArray(arr1, arr2, k));
	}

	public static int[] pasteToArray(int[] toArr, int[] arr, int k) {
		int[] finalArr;

		finalArr = new int[toArr.length + arr.length];

		for (int i = 0; i < finalArr.length; i++) {
			if (i <= k) {
				finalArr[i] = toArr[i];
			} else if (i > k && i < k + arr.length + 1) {
				finalArr[i] = arr[i - k - 1];
			} else if (i > k + arr.length - 1) {
				finalArr[i] = toArr[i - arr.length];
			}
		}
		return finalArr;

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
