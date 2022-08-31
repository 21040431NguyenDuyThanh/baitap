package bai3;

public class TestHinhTru {
	public static void main(String[] args) {
		HinhTru ht = new HinhTru(3, 4);
		System.out.println(ht);
		System.out.println("Dien tich xung quanh la "+ht.dtXungQuanh());
		System.out.println("Dien tich toan phan la "+ht.dtToanPhan());
	}

}
