
import java.sql.*;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author phong
 */
public class NewClass {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost;database=SUPERDuAn1;encrypt=false;trustservercertificate=true";
    private static String username = "sa";
    private static String password = "1234";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(dburl, username, password);
            String sql = "SELECT * FROM Nhan_Vien where MaNV = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "NV001");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
