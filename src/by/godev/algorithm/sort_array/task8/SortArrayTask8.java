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
		doneArr = commonDenForFraction(arr);

		printTable(arr, "Изначальный массив дробей:");

		shellNumSort(doneArr);
		printTable(doneArr, "Приведенный массив дробей:");
	}

	public static Fraction[] commonDenForFraction(Fraction[] arr) {
		Fraction[] doneArr;

		doneArr = new Fraction[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int x = LCMArray(arr);
			int den = x / arr[i].denominator;
			// System.out.println(den);
			doneArr[i] = new Fraction(arr[i].numerator * den, arr[i].denominator * den);
		}

		return doneArr;
	}

	public static int LCMArray(Fraction[] arr) {
		int r;
		int i;

		r = arr[0].denominator;
		i = 0;

		while (i < arr.length - 1) {
			r = LCM(r, arr[++i].denominator);
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

	public static void shellNumSort(Fraction[] arr) {
		int i = 0;

		while (i < arr.length - 1) {
			Fraction mid;

			if (arr[i].numerator > arr[i + 1].numerator) {
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
			arr[i] = new Fraction(getNum(6), getNum(6));
		}

		return arr;
	}

	public static int getNum(int max) {
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
			System.out.printf(" %d/%d ", arr[j].numerator, arr[j].denominator);
		}
		System.out.print("\n");

	}

}
