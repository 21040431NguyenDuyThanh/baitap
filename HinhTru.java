package bai3;

public class HinhTru {
	private int r;
	private int h;
	
	public HinhTru(int r, int h) {
		super();
		this.r = r;
		this.h = h;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	public String toString() {
		return "HinhTru [r=" + r + ", h=" + h + "]";
	}

	public float dtXungQuanh() {
		return (float) (Math.PI*2*h*r);
	}
	
	public float dtToanPhan() {
		return (float) (Math.PI*2*r+(r+h));
	}
	
}
