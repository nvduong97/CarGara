/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ptit.view;

import com.ptit.dao.CustomerDAO;
import com.ptit.model.Customer;
import com.ptit.utility.Validation;
import javax.swing.JOptionPane;

/**
 *
 * @author DUONGNV
 */
public class AddCustomerView extends javax.swing.JFrame {

    CustomerDAO customerDAO;
    Customer customer;

    /**
     * Creates new form AddCustomerView
     */
    public AddCustomerView() {
        initComponents();
        this.setLocationRelativeTo(null);
        customerDAO = new CustomerDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldBirthDate = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelNote = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNote = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setText("Họ tên");

        jLabelBirthDate.setText("Ngày sinh");

        jLabelAddress.setText("Địa chỉ");

        jLabelPhone.setText("Số điện thoại");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Thêm");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Hủy");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelNote.setText("Note");

        jButtonBack.setText("Quay lại");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextAreaNote.setColumns(20);
        jTextAreaNote.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNote);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPhone)
                                    .addComponent(jLabelBirthDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNote, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButtonCancel)
                                .addGap(41, 41, 41)
                                .addComponent(jButtonAdd)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonBack)))
                        .addContainerGap(89, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBirthDate)
                    .addComponent(jTextFieldBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhone)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelNote))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        customer = new Customer();
        customer.setFullName(jTextFieldName.getText());
        customer.setAddress(jTextFieldAddress.getText());
        customer.setBirthDate(jTextFieldBirthDate.getText());
        customer.setPhone(jTextFieldPhone.getText());
        customer.setNote(jTextAreaNote.getText());
        
        if (Validation.isCustomerValid(customer)) {
            int row = customerDAO.insertCustomer(customer);
            if (row == 0) {
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi");
            } else {
                JOptionPane.showMessageDialog(this, "Đã thêm vào cơ sở dữ liệu");
                this.setVisible(false);
                customer.setCustomerID(row);
                CustomerView customerView = new CustomerView(customer);
                customerView.setVisible(true);
                customerView.setTitle("Thông tin khách hàng");
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        jTextFieldName.setText("");
        jTextFieldAddress.setText("");
        jTextFieldBirthDate.setText("");
        jTextFieldPhone.setText("");
        jTextAreaNote.setText("");
//        ResetValue();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SearchCustomerView searchCustomerView = new SearchCustomerView();
        searchCustomerView.setVisible(true);
        searchCustomerView.setTitle("Tìm khách hàng theo tên");
    }//GEN-LAST:event_jButtonBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomerView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNote;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaNote;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldBirthDate;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
