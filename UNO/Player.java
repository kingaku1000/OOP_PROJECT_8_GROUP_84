
package UNO;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshat Gupta
 * @author Varun Sahni
 */
public class Player extends javax.swing.JFrame {
    public ArrayList<String> playerIds;
    
    
          
    
    
    public Player() {
        initComponents();
        playerIds = new ArrayList<>();
         
    }
    
    public String[] getPids(){
        String[] pids = playerIds.toArray(new String[playerIds.size()]);
        return pids;
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
        NextPlayer = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pidTextBox = new javax.swing.JTextField();
        pidOneLable = new javax.swing.JLabel();
        pidTwoLable = new javax.swing.JLabel();
        pidThreeLable = new javax.swing.JLabel();
        pidFourLable = new javax.swing.JLabel();
        pidFiveLable = new javax.swing.JLabel();
        pidSixLable = new javax.swing.JLabel();
        pidSevenLable = new javax.swing.JLabel();
        pidEightLable = new javax.swing.JLabel();
        pidNineLable = new javax.swing.JLabel();
        pidTenLable = new javax.swing.JLabel();
        pidElevenLable = new javax.swing.JLabel();
        pidTwelveLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        NextPlayer.setBackground(new java.awt.Color(51, 255, 51));
        NextPlayer.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        NextPlayer.setText("NEXT PLAYER");
        NextPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextPlayerActionPerformed(evt);
            }
        });

        Done.setBackground(new java.awt.Color(51, 255, 51));
        Done.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Done.setText("DONE");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD THE PLAYERS!!");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLAYER NAME:");

        pidTextBox.setBackground(new java.awt.Color(229, 229, 229));
        pidTextBox.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pidTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTextBoxActionPerformed(evt);
            }
        });

        pidOneLable.setBackground(new java.awt.Color(51, 51, 51));
        pidOneLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidOneLable.setForeground(new java.awt.Color(255, 255, 255));

        pidTwoLable.setBackground(new java.awt.Color(51, 51, 51));
        pidTwoLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidTwoLable.setForeground(new java.awt.Color(255, 255, 255));

        pidThreeLable.setBackground(new java.awt.Color(51, 51, 51));
        pidThreeLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidThreeLable.setForeground(new java.awt.Color(255, 255, 255));

        pidFourLable.setBackground(new java.awt.Color(51, 51, 51));
        pidFourLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidFourLable.setForeground(new java.awt.Color(255, 255, 255));

        pidFiveLable.setBackground(new java.awt.Color(51, 51, 51));
        pidFiveLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidFiveLable.setForeground(new java.awt.Color(255, 255, 255));

        pidSixLable.setBackground(new java.awt.Color(51, 51, 51));
        pidSixLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidSixLable.setForeground(new java.awt.Color(255, 255, 255));

        pidSevenLable.setBackground(new java.awt.Color(51, 51, 51));
        pidSevenLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidSevenLable.setForeground(new java.awt.Color(255, 255, 255));

        pidEightLable.setBackground(new java.awt.Color(51, 51, 51));
        pidEightLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidEightLable.setForeground(new java.awt.Color(255, 255, 255));

        pidNineLable.setBackground(new java.awt.Color(51, 51, 51));
        pidNineLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidNineLable.setForeground(new java.awt.Color(255, 255, 255));

        pidTenLable.setBackground(new java.awt.Color(51, 51, 51));
        pidTenLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidTenLable.setForeground(new java.awt.Color(255, 255, 255));

        pidElevenLable.setBackground(new java.awt.Color(51, 51, 51));
        pidElevenLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidElevenLable.setForeground(new java.awt.Color(255, 255, 255));

        pidTwelveLable.setBackground(new java.awt.Color(51, 51, 51));
        pidTwelveLable.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pidTwelveLable.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(pidOneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pidFiveLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pidNineLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(pidTwoLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pidSixLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pidTenLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(pidThreeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pidSevenLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pidElevenLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pidTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(pidFourLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(pidEightLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(NextPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(pidTwelveLable, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(pidTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pidOneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidFiveLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidNineLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pidTwoLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidSixLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidTenLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pidThreeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidSevenLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidElevenLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pidFourLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidEightLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidTwelveLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextPlayerActionPerformed
        if(pidTextBox.getText().isEmpty()){
            JLabel message = new JLabel("Please Enter A Name!!");
            message.setFont(new Font("Calibri",Font.BOLD,18));
            JOptionPane.showMessageDialog(null,message);
        } 
        
        else{
            String name = pidTextBox.getText().trim();
            playerIds.add(name);
            
            if(playerIds.size()==1){
                pidOneLable.setText(playerIds.get(0));
            }
            else if(playerIds.size()==2){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
            }
            else if(playerIds.size()==3){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));    
            }
            else if(playerIds.size()==4){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
            }
            else if(playerIds.size()==5){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
            }
            else if(playerIds.size()==6){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));        
            }
            else if(playerIds.size()==7){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));
                pidSevenLable.setText(playerIds.get(6));
            }
            else if(playerIds.size()==8){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));
                pidSevenLable.setText(playerIds.get(6));
                pidEightLable.setText(playerIds.get(7));             
            }
            else if(playerIds.size()==9){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));
                pidSevenLable.setText(playerIds.get(6));
                pidEightLable.setText(playerIds.get(7));
                pidNineLable.setText(playerIds.get(8));         
            }
            else if(playerIds.size()==10){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));
                pidSevenLable.setText(playerIds.get(6));
                pidEightLable.setText(playerIds.get(7));
                pidNineLable.setText(playerIds.get(8));
                pidTenLable.setText(playerIds.get(9));                
            }
            else if(playerIds.size()==11){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));
                pidSevenLable.setText(playerIds.get(6));
                pidEightLable.setText(playerIds.get(7));
                pidNineLable.setText(playerIds.get(8));
                pidTenLable.setText(playerIds.get(9));
                pidElevenLable.setText(playerIds.get(10));             
            }
            else if(playerIds.size()==12){
                pidOneLable.setText(playerIds.get(0));
                pidTwoLable.setText(playerIds.get(1));
                pidThreeLable.setText(playerIds.get(2));
                pidFourLable.setText(playerIds.get(3));
                pidFiveLable.setText(playerIds.get(4));
                pidSixLable.setText(playerIds.get(5));
                pidSevenLable.setText(playerIds.get(6));
                pidEightLable.setText(playerIds.get(7));
                pidNineLable.setText(playerIds.get(8));
                pidTenLable.setText(playerIds.get(9));
                pidElevenLable.setText(playerIds.get(10));
                pidTwelveLable.setText(playerIds.get(11));                
            }
        
            
            if(playerIds.size()>0&&playerIds.size()<12){
                  JLabel message = new JLabel("Saved!!");
                  message.setFont(new Font("Calibri",Font.BOLD,18));
                  JOptionPane.showMessageDialog(null,message);
                  pidTextBox.setText("");
            }
            else{
                  playerIds.remove(name);
                  JLabel message = new JLabel("Maximum 12 Players Can Play");
                  message.setFont(new Font("Calibri",Font.BOLD,18));
                  JOptionPane.showMessageDialog(null,message);
                  
            }
        }
        
    }//GEN-LAST:event_NextPlayerActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        if(playerIds.size()==1||playerIds.size()==0){
            JLabel message = new JLabel("Atleast 2 Players Required To Play The Game!!");
            message.setFont(new Font("Calibri",Font.BOLD,18));
            JOptionPane.showMessageDialog(null,message);
            pidTextBox.setText("");
        }
        else{
            this.dispose();
            new PlayArea(playerIds).setVisible(true);
        }
    }//GEN-LAST:event_DoneActionPerformed

    private void pidTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidTextBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player().setVisible(true);
            }
        });
    }

    // VCalibribles declaration - do not modify//GEN-BEGIN:vCalibribles
    private javax.swing.JButton Done;
    private javax.swing.JButton NextPlayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pidEightLable;
    private javax.swing.JLabel pidElevenLable;
    private javax.swing.JLabel pidFiveLable;
    private javax.swing.JLabel pidFourLable;
    private javax.swing.JLabel pidNineLable;
    private javax.swing.JLabel pidOneLable;
    private javax.swing.JLabel pidSevenLable;
    private javax.swing.JLabel pidSixLable;
    private javax.swing.JLabel pidTenLable;
    private javax.swing.JTextField pidTextBox;
    private javax.swing.JLabel pidThreeLable;
    private javax.swing.JLabel pidTwelveLable;
    private javax.swing.JLabel pidTwoLable;
    // End of vCalibribles declaration//GEN-END:vCalibribles
}
