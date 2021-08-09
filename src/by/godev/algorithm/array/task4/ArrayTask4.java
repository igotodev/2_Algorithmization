package by.godev.algorithm.array.task4;

/*
 * 4. Даны действительные числа а1 ,а2 ,..., а_n . 
 * Поменять местами наибольший и наименьший элементы.
 * */

public class ArrayTask4 {

	public static void main(String[] args) {
		double[] arr;
		double max;
		double min;
		int indexMax;
		int indexMin;
		double midValue;

		max = 0;
		min = 0;
		indexMax = 0;
		indexMin = 0;
		midValue = 0;
		arr = new double[] { -8.9, 4.2, 5.0, -3.4, 5.1, 9.7, -1.0, 0, 7.1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
				indexMin = i;
			} else if (arr[i] > max) {
				max = arr[i];
				indexMax = i;
			}
		}

		midValue = arr[indexMin];
		arr[indexMin] = arr[indexMax];
		arr[indexMax] = midValue;

		for (double value : arr) {
			System.out.print(value + ", ");
		}

	}

}
