package by.godev.algorithm.decomposition.task3;

import java.util.Scanner;

/*
 * 3.  Вычислить  площадь  правильного  шестиугольника  со  стороной  а,  
 * используя  метод  вычисления  площади треугольника.
 * */

public class DecompositionTask3 {

	public static void main(String[] args) {
		double a;

		System.out.print("Чтобы узнать площадь правильного шестиугольника, введите его сторону: ");
		a = valueFromConsole();

		System.out.printf("Площадь правильного шестиугольника со стороной %.2f равна %.4f\n", a, areaRegularHexagon(a));
	}

	public static double areaRegularHexagon(double a) {
		return areaRegularTriangle(a) * 6;
	}

	public static double areaRegularTriangle(double a) {
		return ((Math.sqrt(3) * a * a) / 4);
	}

	public static double valueFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double value;

		while (!scan.hasNextDouble()) {
			System.out.print("Пожалуйста введите число: ");
			scan.next();
		}
		value = scan.nextDouble();

		return value;
	}

}
