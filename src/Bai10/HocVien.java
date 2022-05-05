package Bai10;

import java.util.*;

public abstract class HocVien {
	public  String Hoten, Diachi, LoaiChuongTrinh;
	public  int LoaiUuTien;
	public static Scanner s = new Scanner(System.in);

	public void NhapThongTin() {
		System.out.println("Họ Tên : ");
		Hoten = s.nextLine();
		System.out.println("Địa chỉ : ");
		Diachi = s.nextLine();
		System.out.println("Loại ưu tiên  : ");
	    LoaiUuTien =s.nextInt();
		s.nextLine();
		System.out.println("Loại chương trình : ");
		LoaiChuongTrinh = s.nextLine();
	}
	public abstract void HocPhi();

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	public String getDiachi() {
		return Diachi;
	}

	public void setDiachi(String diachi) {
		Diachi = diachi;
	}

	public String getLoaiChuongTrinh() {
		return LoaiChuongTrinh;
	}

	public void setLoaiChuongTrinh(String loaiChuongTrinh) {
		LoaiChuongTrinh = loaiChuongTrinh;
	}

	public double getLoaiUuTien() {
		return LoaiUuTien;
	}

	public void setLoaiUuTien(int LoaiUuTien) {
	    LoaiUuTien=LoaiUuTien;
	}

	public void InThongTin() {
		System.out.println("Họ Tên : " + Hoten + " Địa chỉ : " + Diachi + " Loại ưu Tiên : " + LoaiUuTien
				+ " Loại chương trình : " + LoaiChuongTrinh);
	}
}
