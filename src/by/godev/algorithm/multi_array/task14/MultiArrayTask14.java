package by.godev.algorithm.multi_array.task14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца. 
 * */

public class MultiArrayTask14 {

	public static void main(String[] args) {
		int[][] arr;
		int n;
		int m;

		n = getNum(10);
		m = getNum(10);
		while (m < n) {
			m = getNum(10);
		}
		arr = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j >= i)
					arr[i][j] = 1;
			}
		}

		printMatrix(arr);

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

	// для красивой отрисовки
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print("+-------");
		}
		System.out.print("+\n");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("   %d\t|", arr[i][j]);
			}
			System.out.print("\n");
			for (int d = 0; d < arr[0].length; d++) {
				System.out.print("+-------");
			}
			System.out.print("+\n");
		}
	}

}
