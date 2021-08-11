package by.godev.algorithm.multi_array.task2;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 * */

public class MultiArrayTask2 {

	public static void main(String[] args) {
		int[][] mArr;
		String str = new String("");
		mArr = new int[][] { { 9, 8, 9, 4 }, { 9, 2, 3, 4 }, { 8, 0, 5, 5 }, { 5, 2, 2, 3 } };

		for (int i = 0; i < mArr.length; i++) {
			for (int j = 0; j < mArr[i].length; j++) {
				if (j == i) {
					System.out.print(str + mArr[i][j]);
					str += "  "; // String.join(str, " ");
				}
			}
			System.out.print("\n");
		}

	}

}
