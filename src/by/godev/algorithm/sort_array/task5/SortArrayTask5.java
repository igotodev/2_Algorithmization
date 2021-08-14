package by.godev.algorithm.sort_array.task5;

/*
 * 5. Сортировка вставками. Дана последовательность чисел а1, a2, ..., a_n. 
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 * Пусть а1, a2, ..., a_i - упорядоченная последовательность, 
 * т.е. а1 <= a2 <= ... <= a_n . Берется следующее число a_i+1 и вставляется в последовательность так,  
 * чтобы  новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы от i + 1 до n не будут перебраны. 
 * Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. 
 * Двоичный поиск оформить в виде отдельной функции.
 * */

public class SortArrayTask5 {

	public static void main(String[] args) {
		int[] arr;

		arr = new int[] { 26, 14, 23, 30, -32, 35, 12, 39, -45 };

		insertionSort(arr);

		printTable(arr);
	}

	public static void insertionSort(int[] arr) {
		int mid;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int j;

				mid = arr[i + 1];
				j = binarySearch(arr, i, arr[i + 1]);

				for (int k = i + 1; k > j; k--) {
					arr[k] = arr[k - 1];
				}
				arr[j] = mid;
			}

		}
	}

	private static int binarySearch(int[] arr, int lastIndex, int current) {
		int j;
		int firstIndex;

		j = lastIndex;
		firstIndex = 0;

		while (firstIndex <= lastIndex) {
			j = (firstIndex + lastIndex) / 2;
			if (arr[j] == current) {
				return j;
			} else if (arr[j] < current) {
				firstIndex = j + 1;
			} else if (arr[j] > current && j != 0 && !(arr[j - 1] < current)) {
				lastIndex = j - 1;
			} else {
				break;
			}
		}
		return j;
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
