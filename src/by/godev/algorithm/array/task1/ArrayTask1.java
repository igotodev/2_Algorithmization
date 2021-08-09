package by.godev.algorithm.array.task1;

/*
 * 1. В массив A [N] занесены натуральные числа. 
 * Найти сумму тех элементов, которые кратны данному К.
 * */

public class ArrayTask1 {

	public static void main(String[] args) {
		int sum;
		int k;
		int[] arr = new int[] { 2, 3, 5, 7, 10, 13, 15, 19, 22, 25 };

		sum = 0;
		k = 3;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Сумма элементов массива кратных " + k + " равна " + sum);

	}

}
