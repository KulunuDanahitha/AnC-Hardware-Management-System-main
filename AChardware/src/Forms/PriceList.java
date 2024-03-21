/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import AChardware.DBConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PriceList extends javax.swing.JFrame {

    /**
     * Creates new form PriceList
     */
    public PriceList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrice = new javax.swing.JTable();
        cmbCat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblDis = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblItmName = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHome1 = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPrice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblPrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Price"
            }
        ));
        tblPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPriceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPrice);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 800, 285));

        cmbCat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL" }));
        cmbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCatActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 180, 27));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Item Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 125, 21));

        lblDis.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDis.setForeground(new java.awt.Color(255, 255, 255));
        lblDis.setText("(no_data)");
        getContentPane().add(lblDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 630, 222, -1));

        jLabel3.setBackground(new java.awt.Color(242, 112, 164));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                               Discounts");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 740, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Discount");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 125, 24));

        lblItmName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblItmName.setForeground(new java.awt.Color(255, 255, 255));
        lblItmName.setText("(no_data)");
        getContentPane().add(lblItmName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 184, 40));

        lblHome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Gold Luxury Initial Circle Logo(3).jpg"))); // NOI18N
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        getContentPane().add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 174, 180));

        jPanel1.setBackground(new java.awt.Color(241, 225, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("A&C Hardware");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 276, 50));

        jLabel5.setBackground(new java.awt.Color(242, 112, 164));
        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel5.setText("                                              Price List");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 48, 800, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 100));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 800, 190));

        jPanel2.setBackground(new java.awt.Color(241, 225, 77));
        jPanel2.setMinimumSize(new java.awt.Dimension(174, 618));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 618));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome1.setBackground(new java.awt.Color(241, 225, 77));
        btnHome1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home(1).png"))); // NOI18N
        btnHome1.setText("   Home");
        btnHome1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 174, 86));

        btnHome.setBackground(new java.awt.Color(241, 225, 77));
        btnHome.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-money(1).png"))); // NOI18N
        btnHome.setText(" Price List");
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 174, 86));

        btnStock.setBackground(new java.awt.Color(241, 225, 77));
        btnStock.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/giftbox(1).png"))); // NOI18N
        btnStock.setText("  Stock");
        btnStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        jPanel2.add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 174, 86));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 174, 620));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("                                                                                                                   Copyright 2023 All Rights Reserved A & C Hardware");
        jLabel19.setMaximumSize(new java.awt.Dimension(1024, 50));
        jLabel19.setMinimumSize(new java.awt.Dimension(1024, 50));
        jLabel19.setOpaque(true);
        jLabel19.setPreferredSize(new java.awt.Dimension(1024, 50));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1030, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2552(1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 860, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
        CustomerFrame cuspage = new CustomerFrame();
        cuspage.show();
        dispose();
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        // TODO add your handling code here:
        ChooseUser ch = new ChooseUser();
        ch.show();
        dispose();
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void cmbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCatActionPerformed
        // TODO add your handling code here:
        String selectedvalue = cmbCat.getSelectedItem().toString();
        
        DBConn dbConn = new DBConn();
        Connection conn = dbConn.conn();
        
        if (selectedvalue.equals("ALL")){
            
            //remove items from table
            try{
                int j = tblPrice.getRowCount();
                DefaultTableModel dtm = (DefaultTableModel) tblPrice.getModel();

                for (int k=0; k<j; k++){
                    dtm.removeRow(0);
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage()); 
            }
            
            // add items to table
            try {
                Statement stm2 = (Statement) conn.createStatement();

                String sql = "SELECT ITEM_ID, ITEM_NAME, SELLING_PRICE\n "
                                + " FROM ITEM_;";

                ResultSet rs = stm2.executeQuery(sql);

                while (rs.next()){
                    String itmID = String.valueOf(rs.getString("ITEM_ID"));
                    String itmName = String.valueOf(rs.getString("ITEM_NAME"));
                    String itmPrice = String.valueOf(rs.getString("SELLING_PRICE"));

                    //string array for store data into table
                    String tbData[] = {itmID,itmName,itmPrice};
                    DefaultTableModel tblModel = (DefaultTableModel) tblPrice.getModel();

                    //add string array data into tblStock
                    tblModel.addRow(tbData);
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(CustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else{
            //remove items from table
            try{
                int j = tblPrice.getRowCount();
                DefaultTableModel dtm = (DefaultTableModel) tblPrice.getModel();

                for (int k=0; k<j; k++){
                    dtm.removeRow(0);
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage()); 
            }

            // add items to table
            try {
                Statement stm3 = (Statement) conn.createStatement();

                String sql = "SELECT i.ITEM_ID, i.ITEM_NAME, i.SELLING_PRICE\n "
                                + " FROM ITEM_ i\n "
                                + " LEFT JOIN CATEGORY c ON i.CAT_ID = c.CAT_ID"
                                + " WHERE c.CAT_NAME = '"+selectedvalue+"';";

                ResultSet rs = stm3.executeQuery(sql);

                while (rs.next()){
                    String itmID = String.valueOf(rs.getString("ITEM_ID"));
                    String itmName = String.valueOf(rs.getString("ITEM_NAME"));
                    String itmPrice = String.valueOf(rs.getString("SELLING_PRICE"));

                    //string array for store data into table
                    String tbData[] = {itmID,itmName,itmPrice};
                    DefaultTableModel tblModel = (DefaultTableModel) tblPrice.getModel();

                    //add string array data into tblStock
                    tblModel.addRow(tbData);
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(CustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbCatActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        // add categories to combo box
        
        DBConn dbConn = new DBConn();
        Connection conn = dbConn.conn();
                
        try {
            Statement stm = (Statement) conn.createStatement();
            
            String sql = "select * from category;";
            ResultSet rs = stm.executeQuery(sql);
                
            while (rs.next()){
                cmbCat.addItem(rs.getString("CAT_NAME"));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // add items to table
        try {
            Statement stm2 = (Statement) conn.createStatement();
            
            String sql = "SELECT ITEM_ID, ITEM_NAME, SELLING_PRICE\n "
                            + " FROM ITEM_;";

            ResultSet rs = stm2.executeQuery(sql);
                
            while (rs.next()){
                String itmID = String.valueOf(rs.getString("ITEM_ID"));
                String itmName = String.valueOf(rs.getString("ITEM_NAME"));
                String itmPrice = String.valueOf(rs.getString("SELLING_PRICE"));
                
                //string array for store data into table
                String tbData[] = {itmID,itmName,itmPrice};
                DefaultTableModel tblModel = (DefaultTableModel) tblPrice.getModel();
                
                //add string array data into tblStock
                tblModel.addRow(tbData);
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CustomerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void tblPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPriceMouseClicked
        // TODO add your handling code here:
        //DefaultTableModel tblModel = (DefaultTableModel) tblPrice.getModel();
        try{
            DBConn dbConn = new DBConn();
            Connection conn = dbConn.conn();
                
            Statement stm = (Statement) conn.createStatement();
            
            if (tblPrice.getSelectedRowCount()==1){
                
                int row = tblPrice.getSelectedRow();

                String it_ID = tblPrice.getValueAt(row, 0).toString();
                String it_NAME = tblPrice.getValueAt(row, 1).toString();
                
                //display item name
                lblItmName.setText(it_NAME);
                
                try {
                    String sql = "SELECT DISCOUNT FROM ITEM_ WHERE ITEM_ID = '"+it_ID+"';";
                    ResultSet rs;
                
                    rs = stm.executeQuery(sql);
                
                
                    while (rs.next()){

                        String discount = rs.getString("DISCOUNT");
                        if (discount == null){
                            lblDis.setText("no discount");
                        }
                        else{
                            lblDis.setText(discount+"%");
                        }
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(PriceList.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(PriceList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblPriceMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        ChooseUser ch = new ChooseUser();
        ch.show();
        dispose();
    }//GEN-LAST:event_lblHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PriceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PriceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PriceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PriceList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PriceList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnStock;
    private javax.swing.JComboBox<String> cmbCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDis;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblItmName;
    private javax.swing.JTable tblPrice;
    // End of variables declaration//GEN-END:variables
}
