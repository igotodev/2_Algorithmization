package by.godev.algorithm.decomposition.task6;

import java.util.Scanner;

/*
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * */

public class DecompositionTask6 {

	public static void main(String[] args) {
		int a;
		int b; 
		int c;
		
		System.out.print("Пожалуйста, введите число a: ");
		a = valueFromConsole();
		System.out.print("Пожалуйста, введите число b: ");
		b = valueFromConsole();
		System.out.print("Пожалуйста, введите число c: ");
		c = valueFromConsole();
		
		if (isRelativelyPrime(a, b, c)) {
			System.out.println("Данные три числа являются взаимно простыми");
		} else {
			System.out.println("Данные три числа не являются взаимно простыми");
		}
		
		
	}
	
	public static boolean isRelativelyPrime(int a, int b, int c) {
		if (greatestCommonFactor(a, b) == 1 && greatestCommonFactor(a, c) == 1 && greatestCommonFactor(b, c) == 1) {
			return true;
		} 
		return false;
	}
	
	public static int greatestCommonFactor(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return (greatestCommonFactor(b, a % b));
		}
	}
	
	public static int valueFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num;
		
		while (!scan.hasNextInt()) {
			System.out.print("Пожалуйста введите целое число: ");
			scan.next();
		}
		num = scan.nextInt();
		
		return num;
	}

}
