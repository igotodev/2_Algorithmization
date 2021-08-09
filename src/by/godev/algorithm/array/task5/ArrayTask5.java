package by.godev.algorithm.array.task5;

/*
 * 5. Даны целые числа а1 ,а2 ,..., а_n . 
 * Вывести на печать только те числа, для которых а_i > i.
 * */

public class ArrayTask5 {

	public static void main(String[] args) {
		int[] arr;

		arr = new int[] { 0, 0, 3, 3, 2, 6, 16, 4, 54 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
