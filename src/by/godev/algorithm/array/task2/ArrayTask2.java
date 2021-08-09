package by.godev.algorithm.array.task2;

/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., a_n. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 * */

public class ArrayTask2 {

	public static void main(String[] args) {
		double[] arr;
		int count;
		double z;

		arr = new double[] { 11.3, 22.2, 31.7, 24.0, 35.5, 46.1, 55.0 };
		count = 0;
		z = 45.0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count++;
			}
		}
		System.out.println("Количество замененных членов массива равно " + count);

	}

}
