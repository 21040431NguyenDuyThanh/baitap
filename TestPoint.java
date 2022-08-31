package bai2;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point("A", 1, 6, 3);
		System.out.println(p1);
		System.out.println("Khoang cach tu diem do tam O la :"+p1.getDistance());
		System.out.println("Diem doi xung qua O la "+p1.negate());
	}
}
