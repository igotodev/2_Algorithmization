package by.godev.algorithm.array.task7;

/*
 * 7. Даны действительные числа a1,a2, ... ,a2n. 
 * Найти max( a1 + a2n, a2 + a2(n-1), ... ,an + a(n+1) ).
 * */

public class ArrayTask7 {

	public static void main(String[] args) {
		double[] arr;

		arr = new double[] { 23, 231, 33, 44, 54, 434, 54, 78 }; // 33+434

		System.out.println(getMax(arr));
	}

	public static double getMax(double[] arr) {
		double max = arr[0] + arr[arr.length - 1];

		for (int i = 1; i < arr.length / 2; i++) {
			if ((arr[i] + arr[arr.length - i - 1]) > max) {
				max = arr[i] + arr[arr.length - i - 1];
			}
		}

		return max;
	}

}
