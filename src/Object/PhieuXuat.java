package Object;

import java.util.Date;

public class PhieuXuat {
String MaSoPhieuXuat;
String TenSP;
Date NgayXuat;
String MaKho;
String MaNV;
public PhieuXuat(String maSoPhieuXuat, String tenSP, Date ngayXuat, String maKho, String maNV) {
	super();
	MaSoPhieuXuat = maSoPhieuXuat;
	TenSP = tenSP;
	NgayXuat = ngayXuat;
	MaKho = maKho;
	MaNV = maNV;
}
public String getMaSoPhieuXuat() {
	return MaSoPhieuXuat;
}
public void setMaSoPhieuXuat(String maSoPhieuXuat) {
	MaSoPhieuXuat = maSoPhieuXuat;
}
public String getTenSP() {
	return TenSP;
}
public void setTenSP(String tenSP) {
	TenSP = tenSP;
}
public Date getNgayXuat() {
	return NgayXuat;
}
public void setNgayXuat(Date ngayXuat) {
	NgayXuat = ngayXuat;
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
