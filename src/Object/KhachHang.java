package Object;

public class KhachHang {
String HoTen;
String SoDienThoai;
String Email;
String DiaChi;
String MaKh;
public KhachHang(String hoTen, String soDienThoai, String email, String diaChi, String maKh) {
	super();
	HoTen = hoTen;
	SoDienThoai = soDienThoai;
	Email = email;
	DiaChi = diaChi;
	MaKh = maKh;
}
public String getHoTen() {
	return HoTen;
}
public void setHoTen(String hoTen) {
	HoTen = hoTen;
}
public String getSoDienThoai() {
	return SoDienThoai;
}
public void setSoDienThoai(String soDienThoai) {
	SoDienThoai = soDienThoai;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getDiaChi() {
	return DiaChi;
}
public void setDiaChi(String diaChi) {
	DiaChi = diaChi;
}
public String getMaKh() {
	return MaKh;
}
public void setMaKh(String maKh) {
	MaKh = maKh;
}

}
