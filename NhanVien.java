package assignment1;

public class NhanVien {
	public String ID;
	public String name;
	public double Luong;
	
	public NhanVien(String ID,String name, float Luong) {
		this.ID = ID;
		this.name = name;
		this.Luong = Luong;
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLuong() {
		return Luong;
	}
	public void setLuong(float luong) {
		Luong = luong;
	}
	
	public double getThuNhap() {
		return Luong;
	}

	public double getThueThuNhap() {
		double pt = 0;
		if(Luong < 9000000) {
			 pt = 0;
		}
		if(this.Luong>=9000000 && this.Luong<=15000000) {
			 pt = 0.1;
		}
		if(Luong>15000000) {
			 pt = 0.12;
		}
		double thue = Luong * pt;
		return thue;
	}

//	public float ThuNhap(float luong) {
//		if(luong < 9000000) {
//			this.ThuNhap = luong;
//		}
//		if(luong>=9000000 && luong<=15000000) {
//			this.ThuNhap = (float) (luong - luong*0.1);
//		}
//		if(luong>15000000) {
//			this.ThuNhap = (float) (luong - luong*0.12);
//		}
//		return ThuNhap;
//	}
}
