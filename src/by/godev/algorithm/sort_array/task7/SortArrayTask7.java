package by.godev.algorithm.sort_array.task7;

/* 7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... a_n 
 * и b1 <= b2 <= ... b_m. Требуется указать те места, на которые нужно вставлять элементы последовательности
 * b1 <= b2 <= ... b_m в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 * */

public class SortArrayTask7 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;

		arr1 = new int[] { 1, 3, 5, 7, 16, 28, 31, 35 };
		arr2 = new int[] { 2, 4, 6, 8, 9, 23, 24, 32, 36 };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] < arr1[j]) {
					System.out.printf("%d индекс второго массива поставить на индекс %d первого массива\n", i, i + j);
					break;
				} else if (arr2[i] > arr1[arr1.length - 1]) {
					System.out.printf("%d индекс второго массива поставить на индекс %d первого массива\n", i,
							arr1.length + i);
					break;
				}
			}
		}

	}

}
