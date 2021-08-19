package by.godev.algorithm.decomposition.task9;

/*
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 * */

public class DecompositionTask9 {

	public static void main(String[] args) {
		double area;
		double x;
		double y;
		double z;
		double t;

		x = 3;
		y = 2;
		z = 4;
		t = 3;
		area = areaQuadrangle(x, y, z, t);

		System.out.printf("%.2f\n", area);
	}

	public static double segmentDividingQuadrangle(double x, double y) {
		double line;

		line = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		return line;
	}

	public static double areaRightTriangle(double x, double y) {
		double area;

		area = (x * y) / 2;

		return area;
	}

	public static double areaTriangle(double z, double t, double dividingSegment) {
		double area;
		double p;

		p = (z + t + dividingSegment) / 2;
		area = Math.sqrt(p * (p - z) * (p - t) * (p - dividingSegment));

		return area;
	}

	public static double areaQuadrangle(double x, double y, double z, double t) {
		double areaQ;
		double areaRT;
		double areaT;

		areaRT = areaRightTriangle(x, y);
		areaT = areaTriangle(z, t, segmentDividingQuadrangle(x, y));
		areaQ = areaRT + areaT;

		return areaQ;

	}

}
