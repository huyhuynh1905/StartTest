package assignment1;

public class NVTiepThi extends NhanVien {
	
	
	private int doanhso;
	private float hoahong;
	
	public NVTiepThi(String ID, String name, float Luong) {
		super(ID, name, Luong);
		// TODO Auto-generated constructor stub
	}
	
	public int getDoanhso() {
		return doanhso;
	}
	public void setDoanhso(int doanhso) {
		this.doanhso = doanhso;
	}
	public float getHoahong() {
		return hoahong;
	}
	public void setHoahong(float hoahong) {
		this.hoahong = hoahong;
	}
	
	
}
