package bai4;

public class TestSinhVien {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(11111, "Nguyen Thanh An", 6.5f, 8.6f);
		SinhVien sv2 = new SinhVien(22222, "Le Thi Bong ", 7.5f, 8);
		SinhVien sv3 = new SinhVien(33333, "Nguyen Hoang Anh", 5, 9);
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		System.out.println("Diem trung binh sv1 : "+sv1.toString());
		System.out.println("Diem trung binh sv2 : "+sv2.toString());
		System.out.println("Diem trung binh sv3 : "+sv3.toString());
	}
}
