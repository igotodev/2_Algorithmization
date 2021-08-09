package by.godev.algorithm.array.task9;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них.
 * */

public class ArrayTask9 {

	public static void main(String[] args) {
		int[] arr;
		int[] indexArr;
		int maxCountIndex;
		int minNum;

		arr = new int[] { 22, 26, 1, 4, 22, 22, 2, 2, 2 };
		indexArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					indexArr[i]++;
				}
			}
		}

		minNum = arr[0];
		maxCountIndex = indexArr[0];

		for (int i = 0; i < indexArr.length; i++) {
			if (indexArr[i] > maxCountIndex) {
				maxCountIndex = indexArr[i];
				minNum = arr[i];
			}
			if ((maxCountIndex == indexArr[i]) && (arr[i] < minNum)) {
				minNum = arr[i];
			}
		}

		// printArr(indexArr);
		System.out.print(minNum);

	}

	public static void printArr(int[] arr) {
		for (int value : arr) {
			System.out.print(value + ", ");
		}
		System.out.print("\n");
	}

}
