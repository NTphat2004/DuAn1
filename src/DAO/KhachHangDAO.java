/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Nguyen Van Loi
 */
import Object.KhachHang;
import Util.JdbcHelper;
public class KhachHangDAO {
    public void insert(KhachHang model)
    {
        String sql ="insert Khach_hang values(?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql, 
                model.getHoTen(),
                model.getSoDienThoai(),
                model.getEmail(),
                model.getDiaChi(),
                model.getMaKh());
    }
    public void delete(String makh)
    {
        String sql = "delete khach_hang where makh = ?";
        JdbcHelper.executeUpdate(sql, makh);
    }
    public void update(KhachHang model)
    {
        String sql ="update khach_hang set hoten = ?,sodienthoai = ?,email=?,diachi =?,makh=?";
        JdbcHelper.executeUpdate(sql, 
                model.getHoTen(),
                model.getSoDienThoai(),
                model.getEmail(),
                model.getDiaChi(),
                model.getMaKh());
    }
    
}
