package by.godev.algorithm.array.task8;

import java.util.Arrays;

/*
 * 8. Дана последовательность целых чисел a1, a2, ... a_n. 
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ... a_n). 
 * */

public class ArrayTask8 {

	public static void main(String[] args) {
		int[] arr;
		int[] newArr;
		int min;
		int count;

		arr = new int[] { 4, 5, 7, 12, 36, 4, 4, 98 };
		newArr = new int[] {};
		min = arr[0];
		count = 0;

		for (int value : arr) {
			if (value < min) {
				min = value;
			}
		}

		for (int value : arr) {
			if (value != min) {
				newArr = Arrays.copyOf(newArr, newArr.length + 1);
				newArr[count] = value;
				count++;
			}
		}

		printArr(newArr);

	}

	public static void printArr(int[] arr) {
		for (int value : arr) {
			System.out.print(value + ", ");
		}
	}

}
