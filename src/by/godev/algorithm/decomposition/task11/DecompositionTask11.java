package by.godev.algorithm.decomposition.task11;

/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. 
 * */

public class DecompositionTask11 {

	public static void main(String[] args) {
		int n1;
		int n2;

		n1 = 235;
		n2 = 22;

		if (moreDigits(n1, n2) == 0) {
			System.out.printf("В числах %d и %d одинаково цифр\n", n1, n2);
		} else {
			System.out.printf("В числе %d больше цифр\n", moreDigits(n1, n2));
		}

	}

	public static int moreDigits(int n1, int n2) {
		if (countDigits(n1) > countDigits(n2)) {
			return n1;
		}
		if (countDigits(n1) == countDigits(n2)) {
			return 0;
		}
		return n2;
	}

	public static int countDigits(int n) {
		int count;

		count = 0;

		while (n > 0) {
			n = (n - (n % 10)) / 10;
			count++;
		}
		return count;
	}

}
