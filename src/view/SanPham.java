/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import Util.TempVariable;
import Util.XImage;
import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class SanPham extends javax.swing.JPanel {

    Color defaultcolor, blankcolor;
    public static SanPham sp;

    public SanPham(String tensp, float gia, String hinhurl) {
        initComponents();
        try {
            lblName.setText(tensp);
            lblPrice.setText(String.valueOf(gia).toString().replaceAll("\\.?0*$", "") + " VNĐ");
            String folderUrl = "src/icon/";
            ImageIcon iconorigin = new javax.swing.ImageIcon(("src\\icon\\" + hinhurl));
            Image newimg = iconorigin.getImage();
            Image img = newimg.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
////            XImage.read(folderUrl + hinhurl)
            lblIcon.setIcon(new ImageIcon(img));
            lblIcon.setToolTipText(hinhurl);
//            System.out.println();
            defaultcolor = (new Color(246, 247, 246));
            blankcolor = (new Color(242, 246, 250));

            setBackground(defaultcolor);
            Border emptyBorder = BorderFactory.createEmptyBorder(6, 6, 6, 6);
            btnAddToCart.setIcon(new ImageIcon("src\\icon\\add_50px.png"));
            btnAddToCart.setBackground(defaultcolor);
            btnAddToCart.setBorder(emptyBorder);
            btnAddToCart.setContentAreaFilled(false);
            btnAddToCart.setBorderPainted(false);
            btnAddToCart.setFocusPainted(false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static JButton btnaddtocart() {
        return btnAddToCart;
    }

    public static JLabel lblicon() {
        return lblIcon;
    }

    public static JLabel lblname() {
        return lblName;
    }

    public static JLabel lblprice() {
        return lblPrice;
    }

//    public void btnacction() {
//        btnAddToCart.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(lblIcon.getText());
//            }
//        });
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btnAddToCart.setBorder(null);
        btnAddToCart.setFocusable(false);
        btnAddToCart.setOpaque(true);
        btnAddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddToCartMouseClicked(evt);
            }
        });
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
  
        System.out.println(lblName.getText());
    }//GEN-LAST:event_formMouseClicked

    private void btnAddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddToCartMouseClicked

    }//GEN-LAST:event_btnAddToCartMouseClicked

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddToCartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddToCart;
    public static javax.swing.JLabel lblIcon;
    public static javax.swing.JLabel lblName;
    public static javax.swing.JLabel lblPrice;
    // End of variables declaration//GEN-END:variables
}
