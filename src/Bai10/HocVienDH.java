package Bai10;

public class HocVienDH extends HocVien {
	public double HocPhi, DonGiaDH;
	public int SoBuoi;

	public void NhapHocVienDH() {
		NhapThongTin();
		HocVien LoaiUuTien;
		System.out.println("Số Buổi : ");
		SoBuoi = s.nextInt();
		System.out.println("Đơn giá ĐH: ");
		DonGiaDH = s.nextDouble();
	}

	public double getHocPhi() {
		return HocPhi;
	}

	public void setHocPhi(double hocPhi) {
		HocPhi = hocPhi;
	}

	public double getDonGiaDH() {
		return DonGiaDH;
	}

	public void setDonGiaDH(double donGiaDH) {
		DonGiaDH = donGiaDH;
	}

	public int getSoBuoi() {
		return SoBuoi;
	}

	public void setSoBuoi(int soBuoi) {
		SoBuoi = soBuoi;
	}

// 1 2 là 2 loại 1 và loại 2 
	public void HocPhi() {
		System.out.println("Học Phí đồ họa :  ");
			if (LoaiUuTien == 1) {
				LoaiUuTien = 1000000;
			} else if (LoaiUuTien == 2) {
				LoaiUuTien = 500000;
			} else {
				System.err.println("Không có giá trị ưu tiên ! ");
				return;
			}
			HocPhi = (SoBuoi * DonGiaDH) - LoaiUuTien;
			System.out.println(HocPhi);
	}
}
