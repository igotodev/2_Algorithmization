package by.godev.algorithm.multi_array.task1;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 * */

public class MultiArrayTask1 {

	public static void main(String[] args) {
		int[][] mArr;
		mArr = new int[][] { { 9, 8, 9, 4 }, { 9, 2, 3, 4 }, { 8, 0, 5, 5 }, { 5, 2, 2, 3 } };

		for (int i = 0; i < mArr.length; i++) {
			for (int j = 0; j < mArr[i].length; j++) {
				// Будут выведены нечетные столбцы при нумерации с 0-го элемента
				if (j % 2 != 0) {
					if (mArr[0][j] > mArr[mArr[i].length - 1][j]) {
						System.out.print(mArr[i][j] + " ");
					}

				}
			}
			System.out.print("\n");
		}

	}

}
