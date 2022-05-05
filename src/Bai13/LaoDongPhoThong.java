package Bai13;

public class LaoDongPhoThong extends NguoiLaoDong {
	public int SoNgayCong;
	public double DonGiaNgayCongPhoThong;
	public int Thuong;

	public void tinhLuong() {
		double LuongThang = (SoNgayCong * DonGiaNgayCongPhoThong) + getThuong();
		System.out.println("Lương Tháng Loại Lao Động Phổ Thông : ");
		System.out.println(LuongThang);
	}

	public void NhapLaoDongPhoThong() {
		NhapThongTinLaoDong();
		System.out.println("Nhập vào số ngày công : ");
		SoNgayCong = s.nextInt();
		System.out.println("Đơn Giá : ");
		DonGiaNgayCongPhoThong = s.nextDouble();
	}

	public int getSoNgayCong() {
		return SoNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		SoNgayCong = soNgayCong;
	}

	public double getDonGiaNgayCong() {
		return DonGiaNgayCongPhoThong;
	}

	public void setDonGiaNgayCong(double donGiaNgayCong) {
		DonGiaNgayCongPhoThong = donGiaNgayCong;
	}

	public int getThuong() {
		setThuong(Thuong);
		return Thuong;
	}

	public void setThuong(int thuong) {
		Thuong = thuong;
		if (SoNgayCong >= 25) {
			Thuong = 1000000;
		} else if (SoNgayCong <= 25 && SoNgayCong > 15) {
			Thuong = 700000;
		} else if (SoNgayCong <= 15) {
			Thuong = 0;
		}
	}

	public void InThongTin() {
		System.out.println("Tên : " + HoTen + "Địa chỉ : " + DiaChi + "Loại lao động : " + LoaiLaoDong
				+ "Số Ngày Công : " + SoNgayCong + "Đơn Giá Lao động phổ thông : " + DonGiaNgayCongPhoThong
				+ "Thưởng : " + getThuong());
	}
}
