package Bai10;

public class HocVienLT extends HocVien {
	public double HocPhi, DonGiaLT;
	public int SoBuoi;
	public void NhapHocVienLT() {
		s.nextLine();
		NhapThongTin();
		HocVien LoaiUuTien;
		System.out.println("Số Buổi : ");
		SoBuoi = s.nextInt();
		System.out.println("Đơn giá LT :");
		DonGiaLT = s.nextDouble();
	}
	public double getHocPhi() {
		return HocPhi;
	}
	public void setHocPhi(double hocPhi) {
		HocPhi = hocPhi;
	}
	public double getDonGiaLT() {
		return DonGiaLT;
	}
	public void setDonGiaLT(double donGiaLT) {
		DonGiaLT = donGiaLT;
	}
	public int getSoBuoi() {
		return SoBuoi;
	}
	public void setSoBuoi(int soBuoi) {
		SoBuoi = soBuoi;
	}
	public void HocPhi() {
		System.out.println("Học Phí lập trình  :  ");
			if (LoaiUuTien == 1) {
				LoaiUuTien = 1000000;
			} else if (LoaiUuTien == 2) {
				LoaiUuTien = 800000;
			} else {
				System.err.println("Không có giá trị ưu tiên ! ");
				return;
			}
			HocPhi = (SoBuoi * DonGiaLT) - LoaiUuTien;
			System.out.println(HocPhi);
	}
}
