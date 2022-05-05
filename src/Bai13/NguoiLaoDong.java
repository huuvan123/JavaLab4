package Bai13;

import java.util.*;

public abstract class NguoiLaoDong {
	public String HoTen, DiaChi, LoaiLaoDong;
	public static Scanner s = new Scanner(System.in);

	public void NhapThongTinLaoDong() {
		System.out.println("Nhập vào Tên : ");
		HoTen = s.nextLine();
		System.out.println("Địa chỉ : ");
		DiaChi = s.nextLine();
		System.out.println("Loai lao động : ");
		LoaiLaoDong = s.nextLine();
	}

	public abstract void tinhLuong();

	public abstract void InThongTin();

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getLoaiLaoDong() {
		return LoaiLaoDong;
	}

	public void setLoaiLaoDong(String loaiLaoDong) {
		LoaiLaoDong = loaiLaoDong;
	}

	public static Scanner getS() {
		return s;
	}

	public static void setS(Scanner s) {
		NguoiLaoDong.s = s;
	}
}
