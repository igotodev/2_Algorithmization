package by.godev.algorithm.decomposition.task4;

public class CoordinatePoint {
	private int x;
	private int y;

	public CoordinatePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getPointX() {
		return this.x;
	}

	public int getPointY() {
		return this.y;
	}

	public void setPointX(int x) {
		this.x = x;
	}

	public void setPointY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Точка координат [x = " + this.x + ", y = " + this.y + "]";
	}

}
