package by.godev.algorithm.decomposition.task8;

/*
 * 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно 
 * расположенных элементов массива с номерами от k до m.
 * */

public class DecompositionTask8 {

	public static void main(String[] args) {
		int[] arr;

		arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(sumThree(arr, 1, 3));
		System.out.println(sumThree(arr, 3, 5));
		System.out.println(sumThree(arr, 4, 6));

	}

	public static int sumThree(int[] arr, int start, int end) {
		int sum;

		sum = 0;

		for (int i = start; i <= end; i++) {
			sum += arr[i];
		}

		return sum;
	}

}
