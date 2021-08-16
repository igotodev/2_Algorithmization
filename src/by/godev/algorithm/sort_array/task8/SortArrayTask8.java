package by.godev.algorithm.sort_array.task8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* Даны дроби p1/q1, p2/q2, ... p_n/p_n (p_i и q_i, - натуральные). Составить программу, которая приводит эти дроби к общему 
знаменателю и упорядочивает их в порядке возрастания.
 * */

public class SortArrayTask8 {

	public static void main(String[] args) {
		Fraction[] arr;
		Fraction[] doneArr;

		arr = initFraction(4);
		doneArr = toCommonDenominator(arr);

		printTable(arr, "Изначальный неотсортированный массив дробей:");

		shellNumeratorSort(doneArr);
		printTable(doneArr, "Приведенный и отсортированный массив дробей:");
	}

	public static Fraction[] toCommonDenominator(Fraction[] arr) {
		Fraction[] doneArr;

		doneArr = new Fraction[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int x;
			int den;

			x = LCMArray(arr);
			den = x / arr[i].getDenominator();

			doneArr[i] = new Fraction(arr[i].getNumerator() * den, arr[i].getDenominator() * den);
		}

		return doneArr;
	}

	public static int LCMArray(Fraction[] arr) {
		int r;
		int i;

		r = arr[0].getDenominator();
		i = 0;

		while (i < arr.length - 1) {
			r = LCM(r, arr[++i].getDenominator());
		}

		return r;
	}

	public static int LCM(int a, int b) {
		return (a * b) / GCF(a, b);
	}

	public static int GCF(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return (GCF(b, a % b));
		}
	}

	public static void shellNumeratorSort(Fraction[] arr) {
		int i = 0;

		while (i < arr.length - 1) {
			Fraction mid;

			if (arr[i].getNumerator() > arr[i + 1].getNumerator()) {
				mid = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = mid;

				if (i - 1 > 0) {
					i--;
				}
			} else {
				i++;
			}
		}
	}

	public static Fraction[] initFraction(int len) {
		Fraction[] arr;

		arr = new Fraction[len];

		for (int i = 0; i < len; i++) {
			arr[i] = new Fraction(randNumber(6), randNumber(6));
		}

		return arr;
	}

	public static int randNumber(int max) {
		Random rand = new Random();
		long newRandSeed;
		int num;

		newRandSeed = ThreadLocalRandom.current().nextLong();
		rand.setSeed(newRandSeed);
		num = 0;

		while (num == 0) {
			num = rand.nextInt(max);
		}

		return num;
	}

	public static void printTable(Fraction[] arr, String msg) {
		System.out.print(msg);
		for (int j = 0; j < arr.length; j++) {
			System.out.printf(" %d/%d ", arr[j].getNumerator(), arr[j].getDenominator());
		}
		System.out.print("\n");

	}

}
