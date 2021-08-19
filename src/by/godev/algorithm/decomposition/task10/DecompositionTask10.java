package by.godev.algorithm.decomposition.task10;

/*
 * 10.  Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  
 * элементами  которого являются цифры числа N. 
 * */

public class DecompositionTask10 {

	public static void main(String[] args) {
		int n;

		n = 5020;

		System.out.printf("Число %d преобразовано в массив цифр: ", n);
		printArray(numToArray(n));

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d, ", arr[i]);
		}
	}

	public static int[] numToArray(int n) {
		int count;
		int[] arr;

		count = countDigits(n);
		arr = new int[count];

		while (n > 0) {
			arr[count - 1] = n % 10;
			n = (n - (n % 10)) / 10;
			count--;
		}

		return arr;
	}

	public static int countDigits(int n) {
		int count;

		count = 0;

		while (n > 0) {
			n = (n - (n % 10)) / 10;
			// System.out.printf("%d ", n);
			count++;
		}
		return count;
	}

}
