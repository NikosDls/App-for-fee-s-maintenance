    
import java.io.*;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nikos
 */
public class FirstInputForm extends javax.swing.JFrame {

    /**
     * Creates new form FirstInputForm
     */
    public FirstInputForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextField5 = new javax.swing.JTextField();
        TextField6 = new javax.swing.JTextField();
        TextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TextField3 = new javax.swing.JTextField();
        adminUsername = new javax.swing.JLabel();
        adminPassword = new javax.swing.JLabel();
        TextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ΣΤΟΙΧΕΙΑ ΠΟΛΥΚΑΤΟΙΚΙΑΣ");

        jLabel2.setText("Κωδικός Πολυκατοικίας:");

        jLabel3.setText("Διεύθυνση:");

        jLabel4.setText("ΠΟΛΗ:");

        jLabel5.setText("Ταχ. Κώδικας:");
        jLabel5.setToolTipText("");

        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });
        TextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextField1FocusGained(evt);
            }
        });

        TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Ονοματεπώνυμο Διαχειριστή");

        jLabel8.setText("Τηλέφωνο Διαχειριστή");

        jButton1.setText("ΑΠΟΘΗΚΕΥΣΗ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        adminUsername.setBackground(new java.awt.Color(0, 0, 0));
        adminUsername.setForeground(new java.awt.Color(255, 0, 0));
        adminUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminUsername.setToolTipText("");

        adminPassword.setBackground(new java.awt.Color(0, 0, 0));
        adminPassword.setForeground(new java.awt.Color(255, 0, 0));
        adminPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminPassword.setToolTipText("");

        jLabel9.setText("Αριθμός διαμερισμάτων:");

        jCheckBox1.setEnabled(false);

        jCheckBox2.setEnabled(false);

        jCheckBox3.setEnabled(false);

        jCheckBox4.setEnabled(false);

        jCheckBox5.setEnabled(false);

        jCheckBox6.setEnabled(false);

        jCheckBox7.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(TextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(adminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                    .addComponent(jCheckBox1))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(jCheckBox2))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jCheckBox3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jCheckBox4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jCheckBox5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBox7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int code = Integer.parseInt(TextField1.getText());
        String address = TextField2.getText();
        String city = TextField3.getText();
        String zipCode = TextField4.getText();
        int numOfApartments = Integer.parseInt(TextField5.getText());
        String adminName = TextField6.getText();
        String adminPhone = TextField7.getText();

        jCheckBox1.setSelected(true);

        if (address.length() > 60) {
            TextField2.setText("Maximum 60 character!");
            jCheckBox2.setSelected(false);
        } else {
            jCheckBox2.setSelected(true);
        }

        if (city.length() > 30) {
            TextField3.setText("Maximum 30 character!");
            jCheckBox3.setSelected(false);
        } else {
            jCheckBox3.setSelected(true);
        }

        if (zipCode.length() > 5) {
            TextField4.setText("Maximum 5 character!");
            jCheckBox4.setSelected(false);
        } else {
            jCheckBox4.setSelected(true);
        }

        if (numOfApartments > 99) {
            TextField5.setText("Maximum 5 character!");
            jCheckBox5.setSelected(false);
        } else {
            jCheckBox5.setSelected(true);
        }

        if (adminName.length() > 50) {
            TextField6.setText("Maximum 50 character!");
            jCheckBox6.setSelected(false);
        } else {
            jCheckBox6.setSelected(true);
        }

        jCheckBox7.setSelected(true);

        if (!(jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected() && jCheckBox6.isSelected() && jCheckBox7.isSelected())) {
            return;
        }

        String[] outputArray = new String[65535];

        int counter = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String lineContents = br.readLine();

            while (lineContents != null) {
                outputArray[counter] = lineContents;
                lineContents = br.readLine();
                counter++;
            }
            br.close();
        } catch (IOException e) {
            e.getMessage();
        }
        String[] loginsArray = new String[65535];

        int counter2 = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("LOGINS.txt"));
            String lineContents = br.readLine();

            while (lineContents != null) {
                loginsArray[counter2] = lineContents;
                lineContents = br.readLine();
                counter2++;
            }
            br.close();
        } catch (IOException e) {
            e.getMessage();
        }

        if (counter == 0) {
            try {
                String tempString = TextField1.getText() + "\r\n"
                        + TextField2.getText() + "\r\n"
                        + TextField3.getText() + "\r\n"
                        + TextField4.getText() + "\r\n"
                        + TextField5.getText() + "\r\n"
                        + TextField6.getText() + "\r\n"
                        + TextField7.getText();
                FileWriter f = new FileWriter("output.txt");
                BufferedWriter b = new BufferedWriter(f);
                b.write(tempString);
                b.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try {
                String tempString = TextField1.getText() + "\r\n" + "Admin" + "\r\n" + adminPhone.charAt(0) + adminName.charAt(0) + adminPhone.charAt(1) + adminName.charAt(1) + adminPhone.charAt(2) + adminName.charAt(2);
                FileWriter f = new FileWriter("LOGINS.txt");
                BufferedWriter b = new BufferedWriter(f);
                b.write(tempString);
                b.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            adminUsername.setText("Username: Admin");
            adminPassword.setText("Password: " + adminPhone.charAt(0) + adminName.charAt(0) + adminPhone.charAt(1) + adminName.charAt(1) + adminPhone.charAt(2) + adminName.charAt(2));
            
            TextField1.setFocusable(false);
            TextField2.setFocusable(false);
            TextField3.setFocusable(false);
            TextField4.setFocusable(false);
            TextField5.setFocusable(false);
            TextField6.setFocusable(false);
            TextField7.setFocusable(false);
            jButton1.setEnabled(false);
        } else {
            try {
                String tempString = "";
                for (int i = 0; i < counter; i++) {
                    tempString += outputArray[i] + "\r\n";
                }
                tempString += TextField1.getText() + "\r\n"
                        + TextField2.getText() + "\r\n"
                        + TextField3.getText() + "\r\n"
                        + TextField4.getText() + "\r\n"
                        + TextField5.getText() + "\r\n"
                        + TextField6.getText() + "\r\n"
                        + TextField7.getText();
                FileWriter f = new FileWriter("output.txt");
                BufferedWriter b = new BufferedWriter(f);
                b.write(tempString);
                b.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try {
                String tempString = "";
                for (int i = 0; i < counter2; i++) {
                    tempString += loginsArray[i] + "\r\n";
                }
                tempString += TextField1.getText() + "\r\n" + "Admin" + "\r\n" + adminPhone.charAt(0) + adminName.charAt(0) + adminPhone.charAt(1) + adminName.charAt(1) + adminPhone.charAt(2) + adminName.charAt(2);
                FileWriter f = new FileWriter("LOGINS.txt");
                BufferedWriter b = new BufferedWriter(f);
                b.write(tempString);
                b.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            adminUsername.setText("Username: Admin");
            adminPassword.setText("Password: " + adminPhone.charAt(0) + adminName.charAt(0) + adminPhone.charAt(1) + adminName.charAt(1) + adminPhone.charAt(2) + adminName.charAt(2));
            
            TextField1.setFocusable(false);
            TextField2.setFocusable(false);
            TextField3.setFocusable(false);
            TextField4.setFocusable(false);
            TextField5.setFocusable(false);
            TextField6.setFocusable(false);
            TextField7.setFocusable(false);
            jButton1.setEnabled(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextField1FocusGained
        // TODO add your handling code here:
        String[] outputArray = new String[65535];

        int counter = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String lineContents = br.readLine();

            while (lineContents != null) {
                outputArray[counter] = lineContents;
                lineContents = br.readLine();
                counter++;
            }
            br.close();
        } catch (IOException e) {
            e.getMessage();
        }

        if (counter != 0) {
            TextField1.setEnabled(false);
            TextField1.setHorizontalAlignment(JTextField.CENTER);

            int position = counter - 7;
            int code = Integer.parseInt(outputArray[position]) + 1;
            TextField1.setText(Integer.toString(code));

        }
    }//GEN-LAST:event_TextField1FocusGained

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(FirstInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstInputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstInputForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JLabel adminPassword;
    private javax.swing.JLabel adminUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}