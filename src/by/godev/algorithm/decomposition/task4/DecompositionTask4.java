package by.godev.algorithm.decomposition.task4;

/*
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), 
 * определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 * */

public class DecompositionTask4 {

	public static void main(String[] args) {
		CoordinatePoint[] arrPoints;
		CoordinatePoint[] resPoints;
		CoordinatePoint p1;
		CoordinatePoint p2;
		CoordinatePoint p3;
		CoordinatePoint p4;
		
		p1 = new CoordinatePoint(2, 4);
		p2 = new CoordinatePoint(3, 4);
		p3 = new CoordinatePoint(-2, 4);
		p4 = new CoordinatePoint(1, -4);
		arrPoints = new CoordinatePoint[] { p1, p2, p3, p4 };
		resPoints = maxDistancePoints(arrPoints);

		printPoints(resPoints);
	}
	

	public static double distancePoints(CoordinatePoint p1, CoordinatePoint p2) {
		double distance;

		distance = Math
				.sqrt(Math.pow(p1.getPointX() - p2.getPointX(), 2) + Math.pow(p1.getPointY() - p2.getPointY(), 2));

		return distance;
	}

	public static CoordinatePoint[] maxDistancePoints(CoordinatePoint[] points) {
		CoordinatePoint[] result;
		double distance;
		double maxDistance;

		result = new CoordinatePoint[2];
		maxDistance = 0;

		for (int i = 0; i < points.length - 1; i++) {
			for (int j = i + 1; j < points.length; j++) {
				distance = distancePoints(points[i], points[j]);
				if (distance > maxDistance) {
					maxDistance = distance;
					result[0] = points[i];
					result[1] = points[j];
				}
			}
		}
		return result;
	}
	
	public static void printPoints(CoordinatePoint[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%s\n", arr[i].toString());
		}
	}

}
