/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author phong
 */
public class Sptest extends JPanel {

    JLabel lblIcon, lblPrice, lblName;
    JButton btnAddCart;

    public Sptest() {
        setSize(350, 120);
        setLayout(null);
        setBorder(new LineBorder(Color.yellow, 2));
        lblIcon = new JLabel();
        lblPrice = new JLabel("Muỗng");
        lblName = new JLabel("3000000 VND");
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

        add(lblIcon);
        add(lblName);
        add(lblPrice);
        add(btnAddCart);
        setVisible(true);
    }

    public static void main(String[] args) {
        Sptest sp = new Sptest();

    }
}
