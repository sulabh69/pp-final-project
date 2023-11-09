
import javax.swing.JOptionPane;
public class VendingMachine extends javax.swing.JFrame {

    public VendingMachine() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        spriteRB = new javax.swing.JRadioButton();
        waterRB = new javax.swing.JRadioButton();
        cokeRB = new javax.swing.JRadioButton();
        pepsiRB = new javax.swing.JRadioButton();
        redbullRB = new javax.swing.JRadioButton();
        mirindaRB = new javax.swing.JRadioButton();
        purchaseBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        j = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        moneyTF = new javax.swing.JTextField();
        changeTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vending Machine\n");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setText("GS Vending Machine");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Select an item"));
        jPanel1.setToolTipText("sfdfd");

        spriteRB.setText("Sprite 50₹");
        spriteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteRBActionPerformed(evt);
            }
        });

        waterRB.setText("Water  20₹");
        waterRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterRBActionPerformed(evt);
            }
        });

        cokeRB.setText("Coke  80₹");
        cokeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeRBActionPerformed(evt);
            }
        });

        pepsiRB.setText("Pepsi  50₹");
        pepsiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepsiRBActionPerformed(evt);
            }
        });

        redbullRB.setText("Redbull  110₹");
        redbullRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redbullRBActionPerformed(evt);
            }
        });

        mirindaRB.setText("Mirinda  40₹");
        mirindaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mirindaRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spriteRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cokeRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pepsiRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redbullRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mirindaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spriteRB)
                    .addComponent(cokeRB)
                    .addComponent(redbullRB))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waterRB)
                    .addComponent(pepsiRB)
                    .addComponent(mirindaRB))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        purchaseBtn.setText("Purchase");
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        j.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        j.setText("Insert Money :");

        k.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        k.setText("Change :");

        changeTF.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(purchaseBtn)
                        .addGap(120, 120, 120)
                        .addComponent(clearBtn)
                        .addGap(129, 129, 129)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(k)
                            .addComponent(j))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeTF)
                            .addComponent(moneyTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(j)
                    .addComponent(moneyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k)
                    .addComponent(changeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseBtn)
                    .addComponent(clearBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBtnActionPerformed
       
        int money = 0;
        money = Integer.parseInt(moneyTF.getText());
        if(spriteRB.isSelected()){
            money= money - 50;
        }else if(cokeRB.isSelected()){
            money = money - 80;
        }else if(pepsiRB.isSelected()){
            money = money - 50;
        }else if(waterRB.isSelected()){
            money = money - 20;
        }else if(redbullRB.isSelected()){
            money = money - 110;
        }else if(mirindaRB.isSelected()){
            money = money - 40;
        
            
    }
        if(money<0){
            JOptionPane.showMessageDialog(rootPane, "sorry you do not have enough money");
            
        }else{
            changeTF.setText(Integer.toString(money));
        }
        
    }//GEN-LAST:event_purchaseBtnActionPerformed

    private void spriteRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteRBActionPerformed
        
        if (spriteRB.isSelected()) {
            cokeRB.setSelected(false);
            mirindaRB.setSelected(false);
            redbullRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);

        }

    }//GEN-LAST:event_spriteRBActionPerformed

    private void cokeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeRBActionPerformed
         
         if(cokeRB.isSelected()){
            mirindaRB.setSelected(false);
            redbullRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            spriteRB.setSelected(false);
        
    }
    }//GEN-LAST:event_cokeRBActionPerformed

    private void pepsiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepsiRBActionPerformed
        
        if(pepsiRB.isSelected()){
            mirindaRB.setSelected(false);
            redbullRB.setSelected(false);
            cokeRB.setSelected(false);
            waterRB.setSelected(false);
            spriteRB.setSelected(false);
        }
    }//GEN-LAST:event_pepsiRBActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        
        spriteRB.setSelected(false);
        cokeRB.setSelected(false);
        mirindaRB.setSelected(false);
        redbullRB.setSelected(false);
        pepsiRB.setSelected(false);
        waterRB.setSelected(false);

        moneyTF.setText(" ");
        changeTF.setText(" ");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // cancel selections 
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void redbullRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redbullRBActionPerformed
        
         if(redbullRB.isSelected()){
            mirindaRB.setSelected(false);
            pepsiRB.setSelected(false);
            waterRB.setSelected(false);
            pepsiRB.setSelected(false);
            cokeRB.setSelected(false);
         }
    }//GEN-LAST:event_redbullRBActionPerformed

    private void waterRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterRBActionPerformed
        
        if(waterRB.isSelected()){
            mirindaRB.setSelected(false);
            spriteRB.setSelected(false);
            redbullRB.setSelected(false);
            pepsiRB.setSelected(false);
            cokeRB.setSelected(false);
        }
    }//GEN-LAST:event_waterRBActionPerformed

    private void mirindaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mirindaRBActionPerformed
        // TODO add your handling code here:
         if(mirindaRB.isSelected()){
            waterRB.setSelected(false);
            pepsiRB.setSelected(false);
            redbullRB.setSelected(false);
            pepsiRB.setSelected(false);
            cokeRB.setSelected(false);
        }
    }//GEN-LAST:event_mirindaRBActionPerformed

 
    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingMachine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField changeTF;
    private javax.swing.JButton clearBtn;
    private javax.swing.JRadioButton cokeRB;
    private javax.swing.JLabel j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel k;
    private javax.swing.JRadioButton mirindaRB;
    private javax.swing.JTextField moneyTF;
    private javax.swing.JRadioButton pepsiRB;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JRadioButton redbullRB;
    private javax.swing.JRadioButton spriteRB;
    private javax.swing.JRadioButton waterRB;
    // End of variables declaration//GEN-END:variables
}
