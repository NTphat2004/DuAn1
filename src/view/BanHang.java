package view;

import Util.JdbcHelper;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BanHang extends javax.swing.JFrame {

    String sqlselectsp[] = {"select * from DoGiaDung", "select * from RauCu", "select * from DoAn"};
    String header[] = {"", "Tên SP", "Giá"};
    String header2[] = {"", "Tên SP", "Giá", "Số lượng"};
    DefaultTableModel modeltbl = new DefaultTableModel(header, 5);
    DefaultTableModel modeltbl2 = new DefaultTableModel(header2, 5);
    JPanel panelsp, panelsp2, panelsp3;
    JScrollPane scrollpane1;
    JLabel lblIcon, lblPrice, lblName;
    JButton btnAddCart;
    Color defaultcolor, blankcolor;
    String ten, url;
    float gia;

    public static CardLayout cl;

    public BanHang() {
        initComponents();
//        tblSelectedSP.getTableHeader().setDefaultRenderer(new HeaderColor());
        cl = (CardLayout) (spcard.getLayout());
        init();
    }

    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setBackground(new java.awt.Color(255, 128, 0));
            return this;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        btnGiadungsp = new javax.swing.JButton();
        btnRauCusp = new javax.swing.JButton();
        btnDoAn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        spcard = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNV = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSaleOff = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnPay = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblThanhTIen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1700, 800));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Danh mục sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnGiadungsp.setBackground(new java.awt.Color(255, 128, 0));
        btnGiadungsp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGiadungsp.setForeground(new java.awt.Color(0, 0, 179));
        btnGiadungsp.setText("Gia dụng");
        btnGiadungsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGiadungspMouseClicked(evt);
            }
        });

        btnRauCusp.setBackground(new java.awt.Color(255, 128, 0));
        btnRauCusp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRauCusp.setForeground(new java.awt.Color(0, 0, 179));
        btnRauCusp.setText("Rau củ");
        btnRauCusp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRauCuspMouseClicked(evt);
            }
        });

        btnDoAn.setBackground(new java.awt.Color(255, 128, 0));
        btnDoAn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoAn.setForeground(new java.awt.Color(0, 0, 179));
        btnDoAn.setText("Đồ ăn");
        btnDoAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoAnMouseClicked(evt);
            }
        });
        btnDoAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoAnActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 128, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 179));
        jButton4.setText("Sản phẩm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGiadungsp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnRauCusp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDoAn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRauCusp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnGiadungsp, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoAn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spcard.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        spcard.setLayout(new java.awt.CardLayout());

        jScrollPane2.setViewportView(null);

        jPanel8.setLayout(new java.awt.GridLayout(50, 1));
        jScrollPane2.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
        );

        spcard.add(jPanel12, "card5");

        jPanel10.setLayout(new java.awt.GridLayout(20, 1));
        spcard.add(jPanel10, "doan");

        jPanel9.setLayout(new java.awt.GridLayout(20, 1));
        spcard.add(jPanel9, "giadung");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Danh sách sản phẩm đã chọn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel6.setLayout(new java.awt.GridLayout(10, 1));
        jScrollPane1.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 3, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thông tin cơ bản ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 179));
        jLabel1.setText("Mã hóa đơn :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 179));
        jLabel2.setText("Nhân viên :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 179));
        jLabel3.setText("Giảm giá :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSaleOff, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(lblNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaleOff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thao Tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(3, 2));

        btnPay.setBackground(new java.awt.Color(255, 128, 0));
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPay.setForeground(new java.awt.Color(0, 0, 179));
        btnPay.setText("Thanh toán");
        jPanel4.add(btnPay);

        btnUpdate.setBackground(new java.awt.Color(255, 128, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 179));
        btnUpdate.setText("Cập nhật");
        jPanel4.add(btnUpdate);

        btnClose.setBackground(new java.awt.Color(255, 128, 0));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 179));
        btnClose.setText("Đóng");
        jPanel4.add(btnClose);

        btnPrint.setBackground(new java.awt.Color(255, 128, 0));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 0, 179));
        btnPrint.setText("In hóa đơn");
        jPanel4.add(btnPrint);

        btnCancel.setBackground(new java.awt.Color(255, 128, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 179));
        btnCancel.setText("Hủy hóa đơn");
        jPanel4.add(btnCancel);

        jPanel1.add(jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 179));
        jLabel4.setText("Trạng thái :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 179));
        jLabel5.setText("Địa chỉ :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 179));
        jLabel6.setText("Số ĐT :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 179));
        jLabel7.setText("Thành tiền :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblThanhTIen, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(lblThanhTIen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(spcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(spcard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiadungspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiadungspMouseClicked

    }//GEN-LAST:event_btnGiadungspMouseClicked

    private void btnRauCuspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRauCuspMouseClicked
        cl.show(spcard, "card1");
    }//GEN-LAST:event_btnRauCuspMouseClicked

    private void btnDoAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoAnMouseClicked
        cl.show(spcard, "card3");
    }//GEN-LAST:event_btnDoAnMouseClicked

    private void btnDoAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoAnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoAnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanHang().setVisible(true);
            }
        });
    }

    public void init() {
        setLocationRelativeTo(null);
        setBackground(blankcolor);

        defaultcolor = (new Color(246, 247, 246));
        blankcolor = (new Color(242, 246, 250));

        btnGiadungsp.setFocusPainted(false);
        btnDoAn.setFocusPainted(false);
        btnRauCusp.setFocusPainted(false);

        jPanel2.setBackground(defaultcolor);
        jPanel3.setBackground(defaultcolor);
        jPanel4.setBackground(defaultcolor);
        jPanel5.setBackground(defaultcolor);
        spcard.setBackground(defaultcolor);
        jPanel7.setBackground(defaultcolor);
        panelsp = new JPanel();
        panelsp.setSize(350, 200);
        panelsp.setLayout(null);
        panelsp.setBorder(new LineBorder(Color.yellow, 2));
        lblIcon = new JLabel();
        lblPrice = new JLabel();
        lblName = new JLabel();
        btnAddCart = new JButton();

        lblIcon.setSize(70, 70);
        lblName.setSize(100, 200);
        lblPrice.setSize(100, 200);
        btnAddCart.setSize(60, 60);

        lblIcon.setLocation(25, 30);
        lblIcon.setIcon(new ImageIcon("C:\\Users\\phong\\Desktop\\SIEUDUAN\\src\\icon\\icons8-earth-36.png"));
        lblName.setLocation(90, -60);
        lblPrice.setLocation(90, -10);
        btnAddCart.setLocation(270, 30);
        btnAddCart.setIcon(new ImageIcon());
        btnAddCart.setIcon(new ImageIcon("src\\icon\\add_50px.png"));
        Border emptyBorder = BorderFactory.createEmptyBorder(6, 6, 6, 6);
        btnAddCart.setBorder(emptyBorder);
        btnAddCart.setContentAreaFilled(false);
        btnAddCart.setBorderPainted(false);
        btnAddCart.setFocusPainted(false);

        panelsp.add(lblIcon);
        panelsp.add(lblName);
        panelsp.add(lblPrice);
        panelsp.add(btnAddCart);
//        jPanel8.add(panelsp);
//        cl.show(spcard, "raucu");

//        panelsp = new JPanel();
//        panelsp.setSize(345, 100);
//        panelsp.setLayout(new GridBagLayout());
//
//        panelsp2 = new JPanel();
//        panelsp2.setSize(365, 665);
//
//        panelsp2.setLayout(new GridLayout(1, 1));
//        panelsp2.setLayout();
//        panelsp3.setLocation(0, 0);
//        panelsp3.setSize(362, 654);
//        panelsp3 = new JPanel();
//        panelsp3.setLayout(new GridLayout(10, 1));
//        panelsp3.setSize(new Dimension(365, 665));
//        panelsp3.setBackground(Color.yellow);
//        scrollpane1 = new JScrollPane(panelsp3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        panelsp2.add(scrollpane1);
//        lblIcon = new JLabel("icon");
//        lblIcon.setOpaque(true);
//        lblIcon.setBackground(Color.yellow);
//        lblPrice = new JLabel("price");
//        lblName = new JLabel("name");
//        btnAddCart = new JButton("button");
//    
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        panelsp.add(lblIcon, gbc);
//
//        gbc.gridx = 1;
//        gbc.gridy = 0;
//        panelsp.add(lblPrice, gbc);
//
//        gbc.gridx = 1;
//        gbc.gridy = 3;
//        panelsp.add(lblName, gbc);
//
//        gbc.gridx = 3;
//        gbc.gridy = 2;
//        panelsp.add(btnAddCart, gbc);
//        
//        gbc.fill = GridBagConstraints.HORIZONTAL;
//        gbc.gridwidth = 3;
//        gbc.gridheight = 3;
//        panelsp.add(btnAddCart);
//        spcard.add(panelsp2);
//        loadSP(sqlselectsp[0]);
//        tblSelectedSP.setModel(modeltbl2);
//        JTableHeader th2 = tblSelectedSP.getTableHeader();
//        th2.setPreferredSize(new Dimension(40, 40));
//        tblSelectedSP.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 18));
//        tblSelectedSP.setBackground(defaultcolor);
//        tblSelectedSP.getTableHeader().setForeground(new Color(255, 255, 255));
//        tblSelectedSP.setRowHeight(100);
//        SPbyDanhMuc sp1 = new SPbyDanhMuc(sqlselectsp[1]);
//        spcard.add(sp1, "card1");
//
//        SPbyDanhMuc sp2 = new SPbyDanhMuc(sqlselectsp[0]);
//        spcard.add(sp2, "card2");
//
//        SPbyDanhMuc sp3 = new SPbyDanhMuc(sqlselectsp[2]);
//        spcard.add(sp3, "card3");
//        System.out.println(tblSelectedSP.getColumnClass(1));
//        loadSP(sqlselectsp[0]);
        loadSP(sqlselectsp[0]);

    }

    public void loadSP(String sql) {
        ten = "";
        url = "";
        gia = 0;

        try {
            String sql1 = "Select * from DoGiaDung";
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                ten = rs.getString(2);
                gia = rs.getFloat(3);
                url = rs.getString(4);
                SanPham ps = new SanPham(ten, gia, url);
                ps.btnAddToCart.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                 SanPham ps2 = new SanPham(ten, gia, url);
                        jPanel6.add(new SanPham(ten, gia, url));
                    }
                });
                jPanel8.add(ps);
                cl.show(spcard, "raucus");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDoAn;
    private javax.swing.JButton btnGiadungsp;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRauCusp;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblNV;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblThanhTIen;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel spcard;
    private javax.swing.JTextField txtSaleOff;
    // End of variables declaration//GEN-END:variables
}
