
package view;

import Util.JdbcHelper;
import java.sql.*;


public class SPbyDanhMuc extends javax.swing.JPanel {


    public SPbyDanhMuc(String sql) {
        initComponents();
        loadSp(sql);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.GridLayout(100, 1, 5, 0));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    public void loadSp(String sql) {
        try {
            String sql1 = "Select * from DoGiaDung";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                String ten = rs.getString(2);
                float gia = rs.getFloat(3);
                String url = rs.getString(4);
//                System.out.println(url);
                SanPham sp1 = new SanPham(ten, gia, url);
                jPanel1.add(sp1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
