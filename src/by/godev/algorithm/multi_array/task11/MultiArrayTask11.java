package by.godev.algorithm.multi_array.task11;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 * */

public class MultiArrayTask11 {

	public static void main(String[] args) {
		int[][] arr;

		arr = createMatrix(10, 20);

		printMatrix(arr);
		countFromLine(arr, 5);
	}

	public static int[][] createMatrix(int x, int y) {
		int[][] arr;

		arr = new int[x][y];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = getNum(15);
			}
		}
		return arr;
	}

	public static int getNum(int max) {
		Random rand = new Random();
		long newRandSeed;

		newRandSeed = ThreadLocalRandom.current().nextLong();
		rand.setSeed(newRandSeed);

		return rand.nextInt(max);
	}

	public static void countFromLine(int[][] arr, int num) {
		int done = 0;

		System.out.println("// Нумерация начинается с 0-го элемента!");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == num) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.printf("В строке [%d] число %d встречается три и более раз\n", i, num);
				done++;
			}
		}
		if (done < 1) {
			System.out.printf("В матрице не найдено строк, где число %d встречается три и более раз\n", num);
		}

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
