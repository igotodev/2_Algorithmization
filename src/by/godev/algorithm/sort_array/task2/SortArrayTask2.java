package by.godev.algorithm.sort_array.task2;

/*
 * 2. Даны две последовательности a1 <= a2 <= .... <= a_n и b1 <= b2 <= ... <= b_m. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать.
 * */

public class SortArrayTask2 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;

		arr1 = new int[] { 10, 12, 14, 16, 18, 20 };
		arr2 = new int[] { 11, 13, 15, 17, 19 };
		
		System.out.println("Совмещенный массив с неубывающей последовательностью сформирован: ");
		printTable(mergeArrays(arr1, arr2));
	}

	public static int[] mergeArrays(int[] toArr, int[] arr) {
		int[] finalArr;

		finalArr = new int[toArr.length + arr.length];

		for (int i = 0; i < finalArr.length; i++) {
			if (i < toArr.length) {
				finalArr[i] = toArr[i];
			} else if (i >= toArr.length) {
				finalArr[i] = arr[i - toArr.length];
			}
			if (i == finalArr.length - 1) {
				bubbleSort(finalArr);
			}
		}
		return finalArr;

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				int mid = 0;
				if (arr[j-1] > arr[j]) {
					mid = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = mid;
				}
			}
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
