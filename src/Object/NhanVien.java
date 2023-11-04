package Object;

import java.util.Date;

public class NhanVien {

    private String MaNV;
    private String TenNV;
    private String GioiTinh;
    private Date NgaySinh;
    private String VaiTro;
    private String Email;
    private String MatKhau;
    private String hinh;

    public NhanVien(String maNV, String tenNV, String gioiTinh, Date ngaySinh, String vaiTro, String email, String matKhau,
            String hinh) {
        super();
        MaNV = maNV;
        TenNV = tenNV;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        VaiTro = vaiTro;
        Email = email;
        MatKhau = matKhau;
        this.hinh = hinh;
    }

    public NhanVien() {

    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String vaiTro) {
        VaiTro = vaiTro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

}
