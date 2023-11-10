/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Nguyen Van Loi
 */
import Util.JdbcHelper;
import Object.SanPham;
public class SanPhamDAO {
    public void insert(SanPham model)
    {
        String sql = "insert San_pham values(?,?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, model.getMaSP(),
                model.getTenSP(),
                model.getSoLuong(),
                model.getGia(),
                model.getNgayNhapHang(),
                model.getTrangThai(),
                model.getMaLoai(),
                model.getMaKho());
    }
    public void delete(String Masp)
    {
        String sql ="delete san_pham where masp=?";
        JdbcHelper.executeUpdate(sql, Masp);
    }
    public void update(SanPham model)
    {
        String sql = "update san_pham set tensp =?,soluong = ?,gia=?,NgayNhapHang =?, TrangThai =?, Maloai=?,Makho=? where Masp =?";
        JdbcHelper.executeUpdate(sql,model.getTenSP(),
                model.getSoLuong(),
                model.getGia(),
                model.getNgayNhapHang(),
                model.getTrangThai(),
                model.getMaLoai(),
                model.getMaKho(),
                model.getMaSP());
    }
}
