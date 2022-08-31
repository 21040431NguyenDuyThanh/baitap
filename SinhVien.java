package bai4;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float dLT;
	private float dTH;
	
	public SinhVien() {
	// TODO Auto-generated constructor stub
		maSV = 0;
		hoTen = "";
		dLT = 0;
		dTH = 0;
	}

	public SinhVien(int maSV, String hoTen, float dLT, float dTH) {
		super();
		this.maSV = maSV<0?0:maSV;
		this.hoTen = (hoTen.compareTo("")==0?"@":hoTen);
		this.dLT = (dLT < 0 || dLT > 10)?0:dLT;
		this.dTH = (dTH < 0 || dTH > 10)?0:dTH;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV<0?0:maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = (hoTen.compareTo("")==0?"@":hoTen);
	}

	public float getdLT() {
		return dLT;
	}

	public void setdLT(float dLT) {
		this.dLT = (dLT < 0 || dLT > 10)?0:dLT;
	}

	public float getdTH() {
		return dTH;
	}

	public void setdTH(float dTH) {
		this.dTH = (dTH < 0 || dTH > 10)?0:dTH;
	}

	public float diemTB() {
		return (dLT+dTH)/2;
	}

	
	
	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", dLT=" + dLT + ", dTH=" + dTH + ", diemTB()="
				+ diemTB() + "]";
	}
	
}