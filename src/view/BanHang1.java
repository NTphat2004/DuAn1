package view;

import Object.SP1;
import Object.SP2;
import Util.Auth;
import Util.JdbcHelper;
import component.TableActionCellEditer2;
import component.TableActionCellEditor;
import component.tableActionEvent;
import component.tableCellRender;
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
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import static view.SanPham.sp;

public class BanHang1 extends javax.swing.JFrame {

    public static BanHang1 bh;

    String sqlselectsp[] = {"select * from San_Pham where Maloai like CONCAT('LSPRC','%')", "select * from San_Pham where Maloai like CONCAT('LSPDT','%')", "select * from San_Pham where Maloai like CONCAT('LSPTU','%')"};
    String header[] = {"", "Tên SP", "Giá"};
    String header2[] = {"", "Tên SP", "Giá", "Số lượng"};
    List<SP1> listsp = new ArrayList<SP1>();
    List<SP2> listspselectedsp = new ArrayList<SP2>();
    DefaultTableModel modeltbl = new DefaultTableModel(header, 0);
    DefaultTableModel modeltbl2 = new DefaultTableModel(header2, 0);
    JPanel panelsp, panelsp2, panelsp3;
    JScrollPane scrollpane1;
    JLabel lblIcon, lblPrice, lblName;
    JButton btnAddCart;
    Color defaultcolor, blankcolor;
    double thanhtien = 0;
//    String ten, url;
//    float gia;

    public static CardLayout cl;
    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());

    public BanHang1() {
        initComponents();
        tableActionEvent event = new tableActionEvent() {
            @Override
            public void Ondelete(int row) {
                if (tblSelectedSP.isEditing()) {
                    tblSelectedSP.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tblSelectedSP.getModel();
                model.removeRow(row);
                listspselectedsp.remove(row);
                checkOut();
            }

            @Override
            public void ChangeInput() {
            }
        };
        tblSelectedSP.getTableHeader().setDefaultRenderer(new HeaderColor());
        tblSelectedSP.getColumnModel().getColumn(4).setCellRenderer(new tableCellRender());
        tblSelectedSP.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        tblSelectedSP.getColumnModel().getColumn(3).setCellEditor(new TableActionCellEditer2(new tableActionEvent() {
            @Override
            public void Ondelete(int row) {
            }

            @Override
            public void ChangeInput() {
                if (listspselectedsp.size() != 0) {
                    for (int i = 0; i < tblSelectedSP.getRowCount(); i++) {
                        int soluong = Integer.parseInt(tblSelectedSP.getModel().getValueAt(i, 3).toString());
                        listspselectedsp.get(i).setSoluong(soluong);
//                        System.out.println(tblSelectedSP.getModel().getValueAt(i, 3) + "cột: " + i);
//                        System.out.println(listspselectedsp.get(i).getSoluong() + " sp :" + i);
                        checkOut();
                    }
                }
                checkOut();
            }
        }));
        tblSelectedSP.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column
            ) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        }
        );
        tblSP.getTableHeader().setDefaultRenderer(new HeaderColor());
        tblSP.removeColumn(tblSP.getColumnModel().getColumn(3));
        tblSP.removeColumn(tblSP.getColumnModel().getColumn(3));
        tblSelectedSP.removeColumn(tblSelectedSP.getColumnModel().getColumn(5));
        init();
        DefaultTableModel model2 = (DefaultTableModel) tblSelectedSP.getModel();
        model2.setRowCount(0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSelectedSP = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaHD = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNV = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblThanhTIen = new javax.swing.JLabel();
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
        txtTenKhach = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        lblGmail = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRauCuspMouseEntered(evt);
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
            .addComponent(btnDoAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGiadungsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRauCusp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
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

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Tên Sp", "Giá", "", ""
            }
        ) {
            Class[] types = new Class [] {
                ImageIcon.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.setFocusable(false);
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        javax.swing.GroupLayout spcardLayout = new javax.swing.GroupLayout(spcard);
        spcard.setLayout(spcardLayout);
        spcardLayout.setHorizontalGroup(
            spcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        spcardLayout.setVerticalGroup(
            spcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spcardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Danh sách sản phẩm đã chọn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblSelectedSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Tên SP", "Giá", "Số Lượng", "",""
            }
        ) {
            Class[] types = new Class [] {
                ImageIcon.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true,false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSelectedSP.setFocusable(false);
        tblSelectedSP.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblSelectedSP.setShowGrid(false);
        jScrollPane4.setViewportView(tblSelectedSP);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 3, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thông tin cơ bản ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 179));
        jLabel1.setText("Mã hóa đơn :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 179));
        jLabel2.setText("Nhân viên :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 179));
        jLabel7.setText("Thành tiền :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblNV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblThanhTIen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThanhTIen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thao Tác", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(3, 2));

        btnPay.setBackground(new java.awt.Color(255, 128, 0));
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPay.setForeground(new java.awt.Color(0, 0, 179));
        btnPay.setText("Thanh toán");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel4.add(btnPay);

        btnUpdate.setBackground(new java.awt.Color(255, 128, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 179));
        jPanel4.add(btnUpdate);

        btnClose.setBackground(new java.awt.Color(255, 128, 0));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 179));
        btnClose.setText("Đóng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel4.add(btnClose);

        btnPrint.setBackground(new java.awt.Color(255, 128, 0));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 0, 179));
        jPanel4.add(btnPrint);

        btnCancel.setBackground(new java.awt.Color(255, 128, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 179));
        jPanel4.add(btnCancel);

        jPanel1.add(jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 179));
        jLabel4.setText("Tên Khách");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 179));
        jLabel5.setText("Địa chỉ :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 179));
        jLabel6.setText("Số ĐT :");

        txtSoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDTActionPerformed(evt);
            }
        });

        lblGmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGmail.setForeground(new java.awt.Color(0, 0, 179));
        lblGmail.setText("Gmail");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenKhach)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtDiaChi)
                    .addComponent(txtGmail))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGmail)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(spcard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGiadungspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiadungspMouseClicked
        loadSP(sqlselectsp[0]);
    }//GEN-LAST:event_btnGiadungspMouseClicked

    private void btnRauCuspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRauCuspMouseClicked
        loadSP(sqlselectsp[1]);
    }//GEN-LAST:event_btnRauCuspMouseClicked

    private void btnDoAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoAnMouseClicked
        loadSP(sqlselectsp[2]);
    }//GEN-LAST:event_btnDoAnMouseClicked

    private void btnDoAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoAnActionPerformed

    }//GEN-LAST:event_btnDoAnActionPerformed

    private void btnRauCuspMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRauCuspMouseEntered

    }//GEN-LAST:event_btnRauCuspMouseEntered

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        SelectSP();
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        themKhachHang();
        themHoaDon();
        themHoaDonChiTiet();
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        trangchu ct = new trangchu();
        ct.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtSoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDTActionPerformed

    }//GEN-LAST:event_txtSoDTActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanHang1().setVisible(true);
            }
        });
    }

    public void init() {
        setLocationRelativeTo(null);
        setBackground(blankcolor);
//        tblSP.setModel(modeltbl);
        tblSP.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 24));
        tblSP.setShowGrid(false);
        tblSP.setIntercellSpacing(new Dimension(0, 0));
        tblSP.getTableHeader().setBackground(new Color(32, 136, 203));
        tblSP.getTableHeader().setPreferredSize(new Dimension(70, 70));
        tblSP.getTableHeader().setForeground(new Color(255, 255, 255));
        tblSP.setRowHeight(100);
        tblSP.setAutoResizeMode(tblSP.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        tblSP.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblSP.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblSP.getColumnModel().getColumn(2).setPreferredWidth(90);

        tblSelectedSP.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 24));
        tblSelectedSP.setShowGrid(false);
        tblSelectedSP.setIntercellSpacing(new Dimension(0, 0));
        tblSelectedSP.getTableHeader().setBackground(new Color(32, 136, 203));
        tblSelectedSP.getTableHeader().setPreferredSize(new Dimension(70, 70));
        tblSelectedSP.getTableHeader().setForeground(new Color(255, 255, 255));
        tblSelectedSP.setRowHeight(100);
        tblSelectedSP.setAutoResizeMode(tblSelectedSP.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        tblSelectedSP.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblSelectedSP.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblSelectedSP.getColumnModel().getColumn(2).setPreferredWidth(90);
        tblSelectedSP.getColumnModel().getColumn(3).setPreferredWidth(60);
        tblSelectedSP.getColumnModel().getColumn(4).setPreferredWidth(50);

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

        try {
            lblNV.setText(Auth.user.getTenNV());

        } catch (Exception e) {
            e.printStackTrace();
        }
        loadSP(sqlselectsp[1]);
        String maHDnew = layMaKh_or_MaHd_MoiNhat("select TOP 1 MaDH from Hoa_Don order by MaDH desc");
        lblMaHD.setText(maHDnew);

    }

    public void loadSP(String sql) {
        listsp.clear();
        DefaultTableModel model = (DefaultTableModel) tblSP.getModel();
        model.setRowCount(0);
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString(2);
                float gia = rs.getFloat(4);
                String imgurl = rs.getString(9);
                String masp = rs.getString(1);
                SP1 sp = new SP1(masp, name, gia, imgurl);
                listsp.add(sp);
                model.setRowCount(0);
                Object[] row = new Object[100];
                for (int i = 0; i < listsp.size(); i++) {
                    row[1] = listsp.get(i).getName();
                    String formattedGia = numberFormat.format(listsp.get(i).getGia());
                    String giaVN = formattedGia + "VNĐ";
                    row[2] = giaVN;
                    row[3] = listsp.get(i).getImgUrl();
                    row[4] = listsp.get(i).getMaSP();
                    if (listsp.get(i).getImgUrl() != null) {
                        row[0] = loadIconImg(listsp.get(i).getImgUrl());
                        model.addRow(row);

                    }
                }
            }
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ImageIcon loadIconImg(String url) {
        String folderUrl = "src/icon/";
        ImageIcon iconorigin = new javax.swing.ImageIcon(("src\\icon\\" + url));
        Image newimg = iconorigin.getImage();
        Image img = newimg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        return icon;
    }

    public void SelectSP() {
        int row = tblSP.getSelectedRow();

        int check = 0;
        DefaultTableModel model2 = (DefaultTableModel) tblSelectedSP.getModel();
        model2.setRowCount(0);
        String name1 = String.valueOf(tblSP.getValueAt(row, 1));
        String urlImg = String.valueOf(tblSP.getModel().getValueAt(row, 3));
        String maSP = String.valueOf(tblSP.getModel().getValueAt(row, 4));
        String formattedGia = tblSP.getValueAt(row, 2).toString();

        if (listspselectedsp.size() != 0) {
            for (int i = 0; i < listspselectedsp.size(); i++) {
                if (listspselectedsp.get(i).getName().equalsIgnoreCase(name1)) {
                    listspselectedsp.get(i).setSoluong(listspselectedsp.get(i).getSoluong() + 1);
//                    System.out.println(listspselectedsp.get(i).getSoluong());
                    check = 1;
                    break;
                }
                check = 0;
            }
        }
        if (check == 0) {
            listspselectedsp.add(new SP2(name1, formattedGia, urlImg, 1, maSP));
        }
        if (listspselectedsp.size() == 0) {
            listspselectedsp.add(new SP2(name1, formattedGia, urlImg, 1, maSP));
        }
        for (int x = 0; x < listspselectedsp.size(); x++) {

            model2.addRow(new Object[]{loadIconImg(listspselectedsp.get(x).getImgUrl()), listspselectedsp.get(x).getName(), listspselectedsp.get(x).getGia(), listspselectedsp.get(x).getSoluong(), listspselectedsp.get(x).getMaSp()});
        }
        checkOut();

    }

    public void checkOut() {

        int sumrows = tblSelectedSP.getRowCount();
//        System.out.println(sumrows);
        float[] thanhtienTemp = new float[sumrows];

        thanhtien = 0;
        for (int i = 0; i < sumrows; i++) {
            int soluong = Integer.parseInt(tblSelectedSP.getValueAt(i, 3).toString());
            String giaString = tblSelectedSP.getValueAt(i, 2).toString();
            float giatemp = 0;
            try {
                giatemp = numberFormat.parse(giaString).floatValue();
//                System.out.println(giatemp);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
//            float giatemp = Float.parseFloat(tblSelectedSP.getValueAt(i, 2).toString());
            thanhtienTemp[i] = soluong * giatemp;
        }
        for (int i = 0; i < thanhtienTemp.length; i++) {
            thanhtien = thanhtien + thanhtienTemp[i];
        }
        lblThanhTIen.setText(String.format("%,.0f", thanhtien) + " VNĐ");
        System.out.println(thanhtien);
    }

    public String layMaKh_or_MaHd_MoiNhat(String sql) {
        String MaMoiNhat = "";
        String maSubString = "";
        String maSubString2 = "";
        int soCuoiCuaMaHD = 0;
//        String sql = "select TOP 1 MaDH from Hoa_Don order by MaDH desc";
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while (rs.next()) {
                MaMoiNhat = rs.getString(1);
                maSubString = MaMoiNhat.substring(MaMoiNhat.length() - 1, MaMoiNhat.length());
                soCuoiCuaMaHD = Integer.parseInt(maSubString) + 1;
                maSubString2 = MaMoiNhat.substring(0, MaMoiNhat.length() - 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        String maHDnew = maSubString2 + soCuoiCuaMaHD;
        return maHDnew;
    }
    String maKH = "";

    public void themKhachHang() {
        try {
            maKH = "";
            maKH = layMaKh_or_MaHd_MoiNhat("select TOP 1 MaKH from Khach_Hang order by MaKH desc");
            String sql = "insert into Khach_Hang values(?,?,?,?,?)";
            JdbcHelper.executeUpdate(sql, txtTenKhach.getText(), txtSoDT.getText(),
                    txtGmail.getText(), txtDiaChi.getText(), maKH);
        } catch (Exception e1) {
            System.out.println("Lỗi ở thêm khách hàng");
            e1.printStackTrace();
        }

    }

    public void themHoaDon() {
        try {
//            float tien = 0;
//            if (lblThanhTIen.getText().length() != 0) {
//
//                try {
//                    tien = numberFormat.parse(lblThanhTIen.getText()).floatValue();
//                } catch (ParseException ex) {
//                   
//                }
//            }
            String sql = "insert into Hoa_Don values (?,?,?,?,?,?,?,?)";
            JdbcHelper.executeUpdate(sql, lblMaHD.getText(), txtTenKhach.getText(),
                    new Date(), txtSoDT.getText(), txtDiaChi.getText(),
                    thanhtien, Auth.user.getMaNV(), maKH);
        } catch (Exception e2) {
            System.out.println("Lỗi ở thêm mới hóa đơn");
            e2.printStackTrace();
        }

    }

    public void themHoaDonChiTiet() {
        try {
            String sql = "insert into ChiTietHD values(?,?,?,?,?)";
            for (int i = 0; i < tblSelectedSP.getRowCount(); i++) {
                String name = String.valueOf(tblSelectedSP.getValueAt(i, 1));
                String price = tblSelectedSP.getValueAt(i, 2).toString();
                float price2 = numberFormat.parse(price).floatValue();
                int soluong = Integer.parseInt(tblSelectedSP.getValueAt(i, 3).toString());
                String maSP = String.valueOf(tblSelectedSP.getModel().getValueAt(i, 4));
                String mahd = lblMaHD.getText();
                JdbcHelper.executeUpdate(sql, name, soluong, price2, mahd, maSP);
            }
        } catch (Exception e3) {
            System.out.println("Lỗi ở thêm mới hóa đơn chi tiết");
            e3.printStackTrace();
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblGmail;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JLabel lblNV;
    private javax.swing.JLabel lblThanhTIen;
    private javax.swing.JPanel spcard;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblSelectedSP;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenKhach;
    // End of variables declaration//GEN-END:variables
}
