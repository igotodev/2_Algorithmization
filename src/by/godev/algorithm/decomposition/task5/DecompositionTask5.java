package by.godev.algorithm.decomposition.task5;

/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
которое меньше максимального элемента массива, но больше всех других элементов). 
 * */

public class DecompositionTask5 {

	public static void main(String[] args) {
		double[] arr;
		double secondMax;

		arr = new double[] { 1.2, 3.4, 5.5, 7.7, 8.9, 9.0 };
		secondMax = searchSecondMax(arr);

		System.out.printf("Второе по величине число в массиве %.2f\n", secondMax);

	}

	public static double searchSecondMax(double[] arr) {
		double maxNum;
		double secondMaxNum;
		int index;

		index = 0;
		maxNum = searchMax(arr);
		while (arr[index] == maxNum) {
			index++;
		}
		secondMaxNum = arr[index];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != maxNum && arr[i] > secondMaxNum) {
				secondMaxNum = arr[i];
			}
		}

		return secondMaxNum;
	}

	public static double searchMax(double[] arr) {
		double maxNum;

		maxNum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

}
