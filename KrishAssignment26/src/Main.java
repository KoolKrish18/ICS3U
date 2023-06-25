
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krish
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    

    
    public static boolean Checker(String value){
        try{
            int test = Integer.parseInt(value);
            return(true);
        }
        catch(NumberFormatException e){
            return(false);
        }
    }
    
    public static String DecimalB(int convert){
        int max = 1;
        int count = 0;
        String binary = "";
        
        while(true){
            max = max*2;
            System.out.println(max);
            count++;
            if (max > convert)
                break;
        }
        
        for (int i = 0; i < count; i++){
            max = max/2;
            System.out.println(max);
            if((convert - max) >= 0){
                binary = binary + "1";
                convert = convert - max;
            }
            else
                binary = binary + "0";
        }
        return(binary);
    }
    
    public static String BinaryD(int convert){
        String truce = String.valueOf(convert);
        int count = truce.length();
        int ret = 0;
        for(int i = 0; i < count; i++){
            if ((String.valueOf(truce.charAt(count-i-1))).equals("1")){
                ret = ret + (int)Math.pow(2, i);
            }
        }
        return(String.valueOf(ret));
    }
    
    public static String DecimalH(int convert){
        String finale = "";
        int temp;
        String lett;
        while(convert > 0){
            temp = (convert%16);
            switch(temp){
                case 10:
                    lett = "A";
                    break;
                case 11:
                    lett = "B";
                    break;
                case 12:
                    lett = "C";
                    break;
                case 13:
                    lett = "D";
                    break;
                case 14:
                    lett = "E";
                    break;
                case 15:
                    lett = "F";
                    break;
                default:
                    lett = String.valueOf(temp);
            }
            finale = lett + finale;
            convert /= 16;
        }
        return (finale);
    }
    
    public static void HexadecimalD(String convert, JLabel out){
        int count = convert.length();
        int ret = 0;
        int temp;
        for(int i = 0; i < count; i++){
            if ((String.valueOf(convert.charAt(count-i-1))).equals("A"))
                temp = 10;
            else if ((String.valueOf(convert.charAt(count-i-1))).equals("B"))
                temp = 11;
            else if ((String.valueOf(convert.charAt(count-i-1))).equals("C"))
                temp = 12;
            else if ((String.valueOf(convert.charAt(count-i-1))).equals("D"))
                temp = 13;
            else if ((String.valueOf(convert.charAt(count-i-1))).equals("E"))
                temp = 14;
            else if ((String.valueOf(convert.charAt(count-i-1))).equals("F"))
                temp = 15;
            else{
                try{
                    temp = Integer.parseInt((String.valueOf(convert.charAt(count-i-1))));
                }
                catch(NumberFormatException e){
                    out.setText("Not a valid input. Pease Try Again.");
                    return;
                }
            }
            ret = ret + ((int)Math.pow(16, i)*temp);
        }
        out.setText(String.valueOf(ret));
    }

    public Main() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtDecB = new javax.swing.JTextField();
        BTNDecB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TXTBinD = new javax.swing.JTextField();
        BTNBinD = new javax.swing.JButton();
        LBLDecB = new javax.swing.JLabel();
        LBLBinD = new javax.swing.JLabel();
        TXTHexD = new javax.swing.JTextField();
        BTNHexD = new javax.swing.JButton();
        LBLDecH = new javax.swing.JLabel();
        LBLHexD = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TXTDecH = new javax.swing.JTextField();
        BTNDecH = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Number Systems");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Decimal and Binary");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Enter a decimal number: ");

        TxtDecB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDecBActionPerformed(evt);
            }
        });

        BTNDecB.setText("Dec. to Bin.");
        BTNDecB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDecBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Enter a binary number: ");

        TXTBinD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBinDActionPerformed(evt);
            }
        });

        BTNBinD.setText("Bin. to Dec.");
        BTNBinD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBinDActionPerformed(evt);
            }
        });

        LBLDecB.setText("--");

        LBLBinD.setText("--");

        TXTHexD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTHexDActionPerformed(evt);
            }
        });

        BTNHexD.setText("Hex. to Dec.");
        BTNHexD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHexDActionPerformed(evt);
            }
        });

        LBLDecH.setText("--");

        LBLHexD.setText("--");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Decimal and Hex.");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Enter a decimal number: ");

        TXTDecH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDecHActionPerformed(evt);
            }
        });

        BTNDecH.setText("Dec. to Hex.");
        BTNDecH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNDecHActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Enter a hexadecimal number: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTBinD, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNBinD)
                                        .addGap(18, 18, 18)
                                        .addComponent(LBLBinD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtDecB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNDecB)
                                        .addGap(18, 18, 18)
                                        .addComponent(LBLDecB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTHexD, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNHexD)
                                        .addGap(18, 18, 18)
                                        .addComponent(LBLHexD))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTDecH, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTNDecH)
                                        .addGap(18, 18, 18)
                                        .addComponent(LBLDecH)))))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtDecB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNDecB)
                    .addComponent(LBLDecB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXTBinD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBinD)
                    .addComponent(LBLBinD))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TXTDecH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNDecH)
                    .addComponent(LBLDecH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXTHexD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNHexD)
                    .addComponent(LBLHexD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDecBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDecBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDecBActionPerformed

    private void TXTBinDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBinDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBinDActionPerformed

    private void TXTHexDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTHexDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTHexDActionPerformed

    private void TXTDecHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDecHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDecHActionPerformed

    private void BTNDecBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDecBActionPerformed
        // TODO add your handling code here:
        String DecB = TxtDecB.getText();
        int value;
        if (Checker(DecB) == true){
            value = Integer.parseInt(DecB);
            LBLDecB.setText(DecimalB(value));
        }
        else
            LBLDecB.setText("Not a valid input. Please Try Again.");
    }//GEN-LAST:event_BTNDecBActionPerformed

    private void BTNBinDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBinDActionPerformed
        // TODO add your handling code here:
        String BinD = TXTBinD.getText();
        int value;
        if (Checker(BinD) == true){
            value = Integer.parseInt(BinD);
            LBLBinD.setText(BinaryD(value));        
        }
        else
            LBLBinD.setText("Not a valid input. Please Try Again.");
    }//GEN-LAST:event_BTNBinDActionPerformed

    private void BTNDecHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDecHActionPerformed
        // TODO add your handling code here:
        String DecH = TXTDecH.getText();
        int value;
        if (Checker(DecH) == true){
            value = Integer.parseInt(DecH);
            LBLDecH.setText(DecimalH(value));        
        }
        else
            LBLDecH.setText("Not a valid input. Please Try Again.");
    }//GEN-LAST:event_BTNDecHActionPerformed

    private void BTNHexDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHexDActionPerformed
        // TODO add your handling code here:
        String HexD = TXTHexD.getText();
        HexadecimalD(HexD, LBLHexD);
    }//GEN-LAST:event_BTNHexDActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBinD;
    private javax.swing.JButton BTNDecB;
    private javax.swing.JButton BTNDecH;
    private javax.swing.JButton BTNHexD;
    private javax.swing.JLabel LBLBinD;
    private javax.swing.JLabel LBLDecB;
    private javax.swing.JLabel LBLDecH;
    private javax.swing.JLabel LBLHexD;
    private javax.swing.JTextField TXTBinD;
    private javax.swing.JTextField TXTDecH;
    private javax.swing.JTextField TXTHexD;
    private javax.swing.JTextField TxtDecB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
