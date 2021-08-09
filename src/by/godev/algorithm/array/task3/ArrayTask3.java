package by.godev.algorithm.array.task3;

/*
 * 3.  Дан  массив  действительных  чисел,  размерность  которого  N.  
 * Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов.
 * */

public class ArrayTask3 {

	public static void main(String[] args) {
		double[] arr;
		int positive;
		int negative;
		int zero;

		arr = new double[] { 1.1, 1.4, 5.6, -2.1, -1, -4, 0, 2, 0, 1 };
		positive = 0;
		negative = 0;
		zero = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] < 0) {
				negative++;
			} else if (arr[i] == 0) {
				zero++;
			}
		}

		System.out.print("В массиве элементов:\nПоложительных: " + positive 
				+ "\nОтрицательных: " + negative + "\nНулевых: " + zero);
	}

}
