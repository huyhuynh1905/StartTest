package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//test git
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<NhanVien> nv = new ArrayList();
		while(true) {
			System.out.println("+--------------------MENU-------------------+");
			System.out.println("| 1.  Nhập Danh Sách Nhân Viên       	    |");
			System.out.println("| 2.  Xuất Danh Sách Nhân Viên       	    |");
			System.out.println("| 3.  Tìm Nhân Viên Theo Mã Nhập       	    |");
			System.out.println("| 4.  Xoá Nhân Viên Theo Mã Từ Bàn Phím     |");
			System.out.println("| 5.  Cập Nhật Thông Tin Theo Mã       	    |");
			System.out.println("| 6.  Tìm Nhân Viên Theo Khoảng Lương       |");
			System.out.println("| 7.  Sắp Xếp Nhân Viên Theo Họ Tên         |");
			System.out.println("| 8.  Sắp Xếp Nhân Viên Theo Thu Nhập       |");
			System.out.println("| 9.  Xuất 5 Nhân Viên Có Thu Nhập Cao Nhất |");
			System.out.println("| 10. Kết Thúc!                             |");
			System.out.println("+-------------------------------------------+");
			System.out.print("Mời Nhập Thao Tác Thực Hiện: ");
			String input = scan.nextLine();
			if(Integer.parseInt(input)==1) {
				while(true) {
//					System.out.print("Nhập Mã Nhân Viên:");
//					String ID = scan.nextLine();
//					System.out.print("Nhập Tên Nhân Viên:");
//					String name = scan.nextLine();
//					System.out.print("Nhập Lương:");
//					String Luong = scan.nextLine();
//					NhanVien ql = new NhanVien(ID,name,Float.parseFloat(Luong));
//					nv.add(ql);
					inPutNV(nv);
					inPutNVTT(nv);
					System.out.println("Nhap N neu ban muon ngung nhap, nhan Y de tiep tuc!");
					String ip = scan.nextLine();
					if(ip.equalsIgnoreCase("n")) {
						break;
					}
					
				}
				System.out.println("-----------------------------------------------------");
				outNV(nv);
			}
			
		}
	}
	
	public static void inPutNV(ArrayList<NhanVien> nv) {
		Scanner scan = new Scanner(System.in);
		//ArrayList<NhanVien> nv = new ArrayList();
		System.out.print("Nhập Mã Nhân Viên:");
		String ID = scan.nextLine();
		System.out.print("Nhập Tên Nhân Viên:");
		String name = scan.nextLine();
		System.out.print("Nhập Lương:");
		String Luong = scan.nextLine();
		NhanVien ql = new NhanVien(ID,name,Float.parseFloat(Luong));
		nv.add(ql);
	}
	
	public static void inPutNVTT(ArrayList<NhanVien> nv) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập Mã Nhân Viên:");
		String ID = scan.nextLine();
		System.out.print("Nhập Tên Nhân Viên:");
		String name = scan.nextLine();
		System.out.print("Nhập Lương:");
		String Luong = scan.nextLine();
		System.out.print("Nhập Doanh Số:");
		String doanhso = scan.nextLine();
		System.out.print("Nhập Hoa Hồng:");
		String hoahong = scan.nextLine();
		NVTiepThi tt = new NVTiepThi(ID,name,Float.parseFloat(Luong));
		tt.setThuNhap();
		NhanVien ql = new NhanVien(ID, name, Float.parseFloat(Luong),tt.getThuNhap());
		nv.add(ql);
	}
	
	public static void outNV(ArrayList<NhanVien> nv) {
		for(int i=0; i<nv.size();i++) {
			System.out.println("Mã NV:" + nv.get(i).getID());
			System.out.println("Tên NV:" + nv.get(i).getName());
			System.out.println("Lương NV:" + String.format("%.0f", nv.get(i).getLuong()));
			System.out.println("Thu Nhập NV:" + String.format("%.0f", nv.get(i).getThuNhap()));
		}
	}
	

}
