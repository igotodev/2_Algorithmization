package by.godev.algorithm.array.task10;

/*
 * 10. Дан целочисленный массив с количеством элементов n. 
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать. 
 * */

public class ArrayTask10 {

	public static void main(String[] args) {
		int[] arr;

		arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

		for (int i = 0, j = 0; j < arr.length; i++, j += 2) {
			arr[i] = arr[j];
		}
		// printArr(arr);

		for (int i = arr.length / 2; i < arr.length; i++) {
			if (arr.length % 2 == 0) {
				arr[i] = 0;
			} else {
				if (i != arr.length - 1) {
					arr[i + 1] = 0;
				}
			}

		}

		System.out.print("Массив после сжатия: ");
		printArr(arr);

	}

	public static void printArr(int[] arr) {
		for (int value : arr) {
			System.out.print(value + ", ");
		}
		System.out.print("\n");
	}

}
