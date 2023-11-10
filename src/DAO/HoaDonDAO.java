/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Nguyen Van Loi
 */
import Object.HoaDon;
import Util.JdbcHelper;
public class HoaDonDAO {
    public void insert(HoaDon model)
    {
        String sql = "insert hoa_don values(?,?,?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaHD(),
                model.getTenHD(),
                model.getNgayDatHang(),
                model.getSoDienThoai(),
                model.getDiaChi(),
                model.getThanhTien(),
                model.getTrangThai(),
                model.getMaNV(),
                model.getMaKH());
    }
    public void delete(String mahd)
    {
        String sql = "delete hoa_don where madh =?";
        JdbcHelper.executeUpdate(sql, mahd);
    }
    public void update(HoaDon model)
    {
        String sql = "update hoa_don set tenkh=?,ngaydathang=?,sodienthoai=?,diachi=?,thanhtien=?,trangthai=?,manv=?,makh=? where madh =?";
        JdbcHelper.executeUpdate(sql, model.getTenHD(),
                model.getNgayDatHang(),
                model.getSoDienThoai(),
                model.getDiaChi(),
                model.getThanhTien(),
                model.getTrangThai(),
                model.getMaNV(),
                model.getMaKH(),
                model.getMaHD());
    }
    
}
