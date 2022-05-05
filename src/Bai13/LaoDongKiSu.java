package Bai13;

public class LaoDongKiSu extends NguoiLaoDong {
	public int LuongCoBan;
	public double HeSoLuong;
	public int ThuongKiSu;
	public int SoNgayCong;
	public void LaoDongKiSu() {
		NhapThongTinLaoDong();
		System.out.println("Lương cơ bản : ");
		LuongCoBan=s.nextInt();
		System.out.println("Hệ Số Lương : ");
		HeSoLuong = s.nextDouble();
		System.out.println("Số Ngày công : ");
		SoNgayCong=s.nextInt();
	}

	public int getLuongCoBan() {
		return LuongCoBan;
	}

	public void setLuongCoBan(int luongCoBan) {
		LuongCoBan = luongCoBan;
	}

	public double getDonGiaNgayCongKiSu() {
		return HeSoLuong;
	}

	public void setDonGiaNgayCongKiSu(double heSoLuong) {
		HeSoLuong = heSoLuong;
	}

	public int getThuongKiSu() {
		setThuongKiSu(ThuongKiSu);
		return ThuongKiSu;
	}

	public void setThuongKiSu(int thuongKiSu) {
		ThuongKiSu = thuongKiSu;
		if(SoNgayCong >= 25) {
			ThuongKiSu=2000000;
		}else if(SoNgayCong <=23 && SoNgayCong > 15){
			ThuongKiSu=1000000;
		}else if(SoNgayCong <= 15) {
			ThuongKiSu =500000;
		}
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		double LuongThang = (LuongCoBan*HeSoLuong) + getThuongKiSu();
		  System.out.println("Lương Tháng Loại Lao động kĩ sư  : ");
		  System.out.println(LuongThang);

	}

	@Override
	public void InThongTin() {
		// TODO Auto-generated method stub
		System.out.println("Lương cơ bản : " + LuongCoBan +"Hệ số Lương : " + HeSoLuong +"Lương Thưởng : "+ getThuongKiSu());

	}

}
