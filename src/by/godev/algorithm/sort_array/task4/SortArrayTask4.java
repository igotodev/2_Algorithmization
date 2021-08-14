package by.godev.algorithm.sort_array.task4;

/*
 * 4.  Сортировка  обменами.  Дана  последовательность  чисел a1 <= a2 <= .... <= a_n .
 * Требуется  переставить  числа  в порядке  возрастания. Для этого сравниваются два соседних  числа a_i и a_i+1 . 
 * Если a_i > a_i+1 , то  делается перестановка. Так продолжается до тех пор, 
 * пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * */

public class SortArrayTask4 {

	public static void main(String[] args) {
		int[] arr;
		int count;

		arr = new int[] { 12, 14, 23, 26, 30, 32, 35, 39, 45 };
		//arr = new int[] { 12, -14, 23, -26, -30, 32, -35, 39, 45 };

		count = bubbleSort(arr);

		printTable(arr);
		System.out.println("Совершено перестановок: " + count);
	}
	
	public static int bubbleSort(int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				int mid = 0;
				if (arr[j] < arr[j-1]) {
					mid = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = mid;
					count++;
				}
			}
		}
		
		return count;
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
