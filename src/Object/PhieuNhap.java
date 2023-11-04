package Object;

import java.util.Date;

public class PhieuNhap {
String MaSoPhieu;
String TenSP;
Date NgayNhap;
String MaKho;
String MaNV;
public PhieuNhap(String maSoPhieu, String tenSP, Date ngayNhap, String maKho, String maNV) {
	super();
	MaSoPhieu = maSoPhieu;
	TenSP = tenSP;
	NgayNhap = ngayNhap;
	MaKho = maKho;
	MaNV = maNV;
}
public String getMaSoPhieu() {
	return MaSoPhieu;
}
public void setMaSoPhieu(String maSoPhieu) {
	MaSoPhieu = maSoPhieu;
}
public String getTenSP() {
	return TenSP;
}
public void setTenSP(String tenSP) {
	TenSP = tenSP;
}
public Date getNgayNhap() {
	return NgayNhap;
}
public void setNgayNhap(Date ngayNhap) {
	NgayNhap = ngayNhap;
}
public String getMaKho() {
	return MaKho;
}
public void setMaKho(String maKho) {
	MaKho = maKho;
}
public String getMaNV() {
	return MaNV;
}
public void setMaNV(String maNV) {
	MaNV = maNV;
}



}
