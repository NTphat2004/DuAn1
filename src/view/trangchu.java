package view;

import Util.Auth;
import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseMotionAdapter;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class trangchu extends JFrame {

    private JPanel contentPane;
    JPanel panelmenu;
    Color defaultcolor, clickcolor;
    JPanel panel;
    JPanel panel_2;
    JPanel panel_2_1;
    JPanel panel_2_2;
    JPanel panel_2_3;
    JPanel panel_2_3_1;
    JPanel panel_2_3_2;
    JPanel panel_2_3_3;
    JPanel panel_2_3_3_1;
    JPanel panel_2_3_3_1_1;
    JPanel panel_2_3_3_1_2;
    JPanel panel_2_3_3_1_3;
    JLabel lblNewLabel_10_1;
    JLabel lblNewLabel_10;
    JLabel lblNewLabel_10_2;
    JLabel lblNewLabel_7_2;
    JLabel lblNewLabel_7_2_1;
    JLabel lblNewLabel_7_2_2;

    /**
     * Launch the application.
     */
    int width = 229;
    int height = 692;
    private final JLabel lblNewLabel_6 = new JLabel("New label");

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    trangchu frame = new trangchu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public trangchu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1048, 692);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);

        defaultcolor = new Color(25, 118, 211);
        clickcolor = new Color(219, 238, 238);

        setUndecorated(true);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panelmenu = new JPanel();
        panelmenu.setBackground(new Color(25, 118, 211));
        panelmenu.setBounds(0, 0, 1, 692);
        contentPane.add(panelmenu);
        panelmenu.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-x-25.png")));
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                closemenubar();
            }
        });
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 39));
        lblNewLabel_3.setBounds(233, -11, 46, 49);
        panelmenu.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                closemenubar();
            }
        });
        lblNewLabel_4.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-x-25.png")));
        lblNewLabel_4.setBounds(195, 0, 46, 38);
        panelmenu.add(lblNewLabel_4);

        JSeparator separator = new JSeparator();
        separator.setBounds(0, 87, 229, 9);
        panelmenu.add(separator);

        panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(defaultcolor);
            }
        });
        panel.setBounds(0, 119, 229, 43);
        panelmenu.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("   Trang Chủ");
        lblNewLabel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(defaultcolor);
            }
        });
        lblNewLabel.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-home-36.png")));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(-20, 0, 159, 43);

        panel.add(lblNewLabel);

        panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(0, 164, 229, 43);
        panelmenu.add(panel_2);
        panel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2.setBackground(defaultcolor);
            }
        });

        JLabel lblAccount = new JLabel("     Account");
        lblAccount.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-account-36.png")));
        lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAccount.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2.setBackground(defaultcolor);
            }
        });

        lblAccount.setBounds(-20, 0, 159, 43);
        panel_2.add(lblAccount);

        panel_2_1 = new JPanel();
        panel_2_1.setLayout(null);
        panel_2_1.setBounds(0, 211, 229, 43);
        panelmenu.add(panel_2_1);
        panel_2_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_1.setBackground(defaultcolor);
            }
        });

        JLabel lblNhnVin = new JLabel("    Nhân Viên");
        lblNhnVin.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-conference-36.png")));
        lblNhnVin.setHorizontalAlignment(SwingConstants.CENTER);
        lblNhnVin.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_1.setBackground(defaultcolor);
            }
        });
        lblNhnVin.setBounds(-20, 0, 159, 43);
        panel_2_1.add(lblNhnVin);

        panel_2_2 = new JPanel();
        panel_2_2.setLayout(null);
        panel_2_2.setBounds(0, 259, 229, 43);
        panelmenu.add(panel_2_2);
        panel_2_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_2.setBackground(defaultcolor);
            }
        });

        JLabel lblThngK = new JLabel("   Thống Kê");
        lblThngK.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-analytics-36.png")));
        lblThngK.setHorizontalAlignment(SwingConstants.CENTER);
        lblThngK.setBounds(-20, 0, 159, 43);
        lblThngK.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_2.setBackground(defaultcolor);
            }
        });

        panel_2_2.add(lblThngK);

        panel_2_3 = new JPanel();
        panel_2_3.setLayout(null);
        panel_2_3.setBounds(0, 306, 229, 43);
        panelmenu.add(panel_2_3);
        panel_2_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3.setBackground(defaultcolor);
            }
        });

        JLabel lblSnPhm = new JLabel("    Sản Phẩm");
        lblSnPhm.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-object-36.png")));
        lblSnPhm.setHorizontalAlignment(SwingConstants.CENTER);
        lblSnPhm.setBounds(-20, 0, 159, 43);
        lblSnPhm.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3.setBackground(defaultcolor);
            }
        });

        panel_2_3.add(lblSnPhm);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-account-45.png")));
        lblNewLabel_1.setBounds(10, 11, 81, 61);
        panelmenu.add(lblNewLabel_1);

        panel_2_3_1 = new JPanel();
        panel_2_3_1.setLayout(null);
        panel_2_3_1.setBounds(0, 352, 229, 43);
        panelmenu.add(panel_2_3_1);
        panel_2_3_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_1.setBackground(defaultcolor);
            }
        });

        JLabel lblSnPhm_1 = new JLabel("     Kho");
        lblSnPhm_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-warehouse-36.png")));
        lblSnPhm_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblSnPhm_1.setBounds(-34, 0, 159, 43);
        panel_2_3_1.add(lblSnPhm_1);
        lblSnPhm_1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_1.setBackground(defaultcolor);
            }
        });

        panel_2_3_2 = new JPanel();
        panel_2_3_2.setLayout(null);
        panel_2_3_2.setBounds(0, 398, 229, 43);
        panelmenu.add(panel_2_3_2);
        panel_2_3_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_2.setBackground(defaultcolor);
            }
        });

        JLabel lblHan = new JLabel("    Hóa Đơn");
        lblHan.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-bill-36.png")));
        lblHan.setHorizontalAlignment(SwingConstants.CENTER);
        lblHan.setBounds(-25, 0, 159, 43);
        panel_2_3_2.add(lblHan);
        lblHan.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_2.setBackground(defaultcolor);
            }
        });
        panel_2_3_3 = new JPanel();
        panel_2_3_3.setLayout(null);
        panel_2_3_3.setBounds(0, 445, 229, 43);
        panelmenu.add(panel_2_3_3);
        panel_2_3_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3.setBackground(defaultcolor);
            }
        });

        JLabel lblKhchHng = new JLabel("    Khách Hàng");
        lblKhchHng.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-user-3611.png")));
        lblKhchHng.setHorizontalAlignment(SwingConstants.CENTER);
        lblKhchHng.setBounds(-15, 0, 159, 43);
        panel_2_3_3.add(lblKhchHng);
        lblKhchHng.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3.setBackground(defaultcolor);
            }
        });
        panel_2_3_3_1 = new JPanel();
        panel_2_3_3_1.setLayout(null);
        panel_2_3_3_1.setBounds(0, 493, 229, 43);
        panelmenu.add(panel_2_3_3_1);
        panel_2_3_3_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1.setBackground(defaultcolor);
            }
        });

        JLabel lblLchLmVic = new JLabel("   Lịch làm việc");
        lblLchLmVic.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-schedule-36.png")));
        lblLchLmVic.setHorizontalAlignment(SwingConstants.CENTER);
        lblLchLmVic.setBounds(-15, 0, 159, 43);
        panel_2_3_3_1.add(lblLchLmVic);
        lblLchLmVic.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1.setBackground(defaultcolor);
            }
        });

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(0, 541, 229, 9);
        panelmenu.add(separator_1);

        panel_2_3_3_1_1 = new JPanel();
        panel_2_3_3_1_1.setLayout(null);
        panel_2_3_3_1_1.setBounds(0, 595, 229, 43);
        panelmenu.add(panel_2_3_3_1_1);
        panel_2_3_3_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1_1.setBackground(defaultcolor);
            }
        });

        JLabel lblThot = new JLabel("    Hỗ Trợ");
        lblThot.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-earth-36.png")));
        lblThot.setHorizontalAlignment(SwingConstants.CENTER);
        lblThot.setBounds(-26, 0, 159, 43);
        panel_2_3_3_1_1.add(lblThot);
        lblThot.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1_1.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1_1.setBackground(defaultcolor);
            }
        });

        JPanel panel_2_3_3_1_2 = new JPanel();
        panel_2_3_3_1_2.setLayout(null);
        panel_2_3_3_1_2.setBounds(0, 547, 229, 43);
        panelmenu.add(panel_2_3_3_1_2);
        panel_2_3_3_1_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1_2.setBackground(defaultcolor);
            }
        });

        JLabel lblLchLmVic_2 = new JLabel("   Đăng Xuất");
        lblLchLmVic_2.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-log-out-3612.png")));
        lblLchLmVic_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblLchLmVic_2.setBounds(-19, 0, 159, 43);
        panel_2_3_3_1_2.add(lblLchLmVic_2);
        lblLchLmVic_2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1_2.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1_2.setBackground(defaultcolor);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                loginform main = new loginform();
                main.setVisible(true);
                dispose();
            }
        });

        JPanel panel_2_3_3_1_3 = new JPanel();
        panel_2_3_3_1_3.setLayout(null);
        panel_2_3_3_1_3.setBounds(0, 642, 229, 43);
        panelmenu.add(panel_2_3_3_1_3);
        panel_2_3_3_1_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1_3.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1_3.setBackground(defaultcolor);
            }
        });

        JLabel lblLchLmVic_1 = new JLabel("   Thoát");
        lblLchLmVic_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_2_3_3_1_3.setBackground(clickcolor);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_2_3_3_1_3.setBackground(defaultcolor);
            }
        });

        lblLchLmVic_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-log-out-36.png")));
        lblLchLmVic_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblLchLmVic_1.setBounds(-25, 0, 159, 43);
        panel_2_3_3_1_3.add(lblLchLmVic_1);

        panel.setBackground(new Color(25, 118, 211));
        panel_2.setBackground(new Color(25, 118, 211));
        panel_2_1.setBackground(new Color(25, 118, 211));
        panel_2_2.setBackground(new Color(25, 118, 211));
        panel_2_3.setBackground(new Color(25, 118, 211));
        panel_2_3_1.setBackground(new Color(25, 118, 211));
        panel_2_3_2.setBackground(new Color(25, 118, 211));
        panel_2_3_3.setBackground(new Color(25, 118, 211));
        panel_2_3_3_1.setBackground(new Color(25, 118, 211));
        panel_2_3_3_1_2.setBackground(new Color(25, 118, 211));
        panel_2_3_3_1_3.setBackground(new Color(25, 118, 211));
        panel_2_3_3_1_1.setBackground(defaultcolor);

        JLabel lblNewLabel_8 = new JLabel("NGUYỄN VĂN LỢI");
        lblNewLabel_8.setForeground(new Color(255, 255, 255));
        lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_8.setBounds(68, 28, 128, 26);
        panelmenu.add(lblNewLabel_8);

        JLabel lblNewLabel_9 = new JLabel("Trưởng Phòng");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_9.setForeground(new Color(192, 192, 192));
        lblNewLabel_9.setBounds(78, 50, 90, 26);
        panelmenu.add(lblNewLabel_9);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openmenubar();
            }
        });
        lblNewLabel_2.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-list-42.png")));
        lblNewLabel_2.setBounds(24, 11, 62, 50);
        contentPane.add(lblNewLabel_2);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(205, 252, 225));
        panel_1.setBounds(10, 180, 1048, 512);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_3 = new JPanel();
//		panel_3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				 lblNewLabel_7_2.setForeground(Color.RED);
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				lblNewLabel_7_2.setForeground(new Color(21, 181, 176));
//			}
//		});
//		panel_3.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				lblNewLabel_10_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/Wavy_Bus-04_Single-04-removebg-preview.png")));
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//				lblNewLabel_10_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/picture1-removebg-preview.png")));
//			}
//		});
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setBounds(25, 93, 297, 330);
        panel_1.add(panel_3);
        panel_3.setLayout(null);

        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(199, 248, 215));
        panel_4.setBounds(10, 11, 277, 177);
        panel_3.add(panel_4);

        lblNewLabel_10_1 = new JLabel("");

        panel_4.setLayout(new CardLayout(0, 0));
        lblNewLabel_10_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/picture1-removebg-preview.png")));
        panel_4.add(lblNewLabel_10_1, "name_1288668325553600");

        lblNewLabel_7_2 = new JLabel("MỤC TIÊU");
        lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_2.setForeground(new Color(21, 181, 176));
        lblNewLabel_7_2.setFont(new Font("Segoe UI", Font.BOLD, 30));
        lblNewLabel_7_2.setBounds(69, 215, 156, 41);
        panel_3.add(lblNewLabel_7_2);

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(255, 255, 255));
        panel_3_1.setBounds(369, 93, 297, 330);
        panel_1.add(panel_3_1);
        panel_3_1.setLayout(null);
        panel_3_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblNewLabel_7_2_1.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblNewLabel_7_2_1.setForeground(new Color(21, 181, 176));
            }
        });

        lblNewLabel_7_2_1 = new JLabel("GIỚI THIỆU");
        lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_2_1.setForeground(new Color(21, 181, 176));
        lblNewLabel_7_2_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        lblNewLabel_7_2_1.setBounds(9, 199, 278, 57);
        panel_3_1.add(lblNewLabel_7_2_1);

        JPanel panel_4_1 = new JPanel();
        panel_4_1.setBackground(new Color(199, 248, 215));
        panel_4_1.setBounds(10, 11, 277, 177);
        panel_3_1.add(panel_4_1);
        panel_4_1.setLayout(null);

        lblNewLabel_10 = new JLabel("");
        lblNewLabel_10.setIcon(new ImageIcon(trangchu.class.getResource("/icon/KOGAY-removebg-preview.png")));
        lblNewLabel_10.setBounds(0, 0, 277, 177);
        panel_4_1.add(lblNewLabel_10);

        JPanel panel_3_2 = new JPanel();
        panel_3_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                lblNewLabel_7_2_2.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblNewLabel_7_2_2.setForeground(new Color(21, 181, 176));
            }
        });
        panel_3_2.setBackground(new Color(255, 255, 255));
        panel_3_2.setBounds(727, 93, 297, 330);
        panel_1.add(panel_3_2);
        panel_3_2.setLayout(null);

        lblNewLabel_7_2_2 = new JLabel("CHÍNH XÁC");
        lblNewLabel_7_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_2_2.setForeground(new Color(21, 181, 176));
        lblNewLabel_7_2_2.setFont(new Font("Segoe UI", Font.BOLD, 30));
        lblNewLabel_7_2_2.setBounds(9, 201, 278, 57);
        panel_3_2.add(lblNewLabel_7_2_2);

        JPanel panel_4_2 = new JPanel();
        panel_4_2.setBackground(new Color(199, 248, 215));
        panel_4_2.setBounds(10, 11, 277, 177);
        panel_3_2.add(panel_4_2);
        panel_4_2.setLayout(null);

        JLabel lblNewLabel_10_2 = new JLabel("");
        lblNewLabel_10_2.setIcon(new ImageIcon(trangchu.class.getResource("/icon/databaseadmin_4-removebg-preview.png")));
        lblNewLabel_10_2.setBounds(0, 0, 277, 177);
        panel_4_2.add(lblNewLabel_10_2);

        JLabel lblNewLabel_2_1 = new JLabel("");
        lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        lblNewLabel_2_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-x-25.png")));
        lblNewLabel_2_1.setBounds(1018, 0, 62, 38);
        contentPane.add(lblNewLabel_2_1);

        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(trangchu.class.getResource("/icon/logo-cua-hang-tien-loi-8-removebg-preview.png")));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setBounds(164, -21, 375, 204);
        contentPane.add(lblNewLabel_5);
        lblNewLabel_6.setBounds(681, -21, 98, 31);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("QUẢN LÍ SIÊU THỊ");
        lblNewLabel_7.setForeground(new Color(21, 181, 176));
        lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 30));
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setBounds(593, 23, 278, 57);
        contentPane.add(lblNewLabel_7);

        JLabel lblNewLabel_7_1 = new JLabel("- Hãy hướng về ánh mặt trời, nơi mà bóng tối luôn ở sau lưng bạn");
        lblNewLabel_7_1.setBackground(new Color(21, 181, 176));
        lblNewLabel_7_1.setForeground(new Color(21, 181, 176));
        lblNewLabel_7_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        lblNewLabel_7_1.setBounds(531, 71, 449, 68);
        contentPane.add(lblNewLabel_7_1);

        try {
//                if(Auth.user.getGioiTinh()=="nam")
//                {
//                    lblNewLabel_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-account-45.png")));
//                }
//                else{
//                    lblNewLabel_1.setIcon(new ImageIcon(trangchu.class.getResource("/icon/icons8-female-user-45.png")));
//                }
            lblNewLabel_8.setText(Auth.user.getTenNV());
            
            System.out.println(Auth.user.getTenNV());
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public void openmenubar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    panelmenu.setSize(i, height);
                    try {
                        Thread.sleep(2);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }

            }
        }).start();
    }

    public void closemenubar() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    panelmenu.setSize(i, height);
                    try {
                        Thread.sleep(2);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }

            }
        }).start();
    }
}
