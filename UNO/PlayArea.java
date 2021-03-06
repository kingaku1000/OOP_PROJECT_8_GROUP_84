
package UNO;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshat Gupta and Varun Sahini
 */
public class PlayArea extends javax.swing.JFrame {

    private Player addPlayer = new Player();
    ArrayList<String> temp = new ArrayList<>();
    String[] pids;
    Game game;
    
    ArrayList<JButton> cardButtons = new ArrayList<JButton>();
    ArrayList<String> cardIds;
    CardConfirmation window;
    
    public PlayArea() {} 
    
    
    public PlayArea(ArrayList<String> playerIds) {
        initComponents();
        temp = playerIds;
        pids = temp.toArray(new String[temp.size()]);
        game = new Game(pids);
        fillSlots();
        game.start(game);
        setPlayerIdName();     
        discardPile.setIcon(new javax.swing.ImageIcon("C:\\Users\\91870\\OneDrive\\Documents\\NetBeansProjects\\UNO\\src\\main\\java\\UNO\\cardsImage\\" + game.getTopCardImage()));
        setButtonIcons();
    }
    
    public void setButtonIcons(){
        String listString = game.getPlayerHand(game.getCurrentPlayer()).stream().map(Object::toString).collect(Collectors.joining(","));
        String[] cardNames = listString.split(",");
        cardIds = new ArrayList<> (Arrays.asList(cardNames));
        for( int i = 0 ; i< cardIds.size(); i++){
            cardButtons.get(i).setIcon(new javax.swing.ImageIcon("C:\\Users\\91870\\OneDrive\\Documents\\NetBeansProjects\\UNO\\src\\main\\java\\UNO\\cardsImage\\" + cardIds.get(i) + ".png"));
        }
        for ( int i = cardIds.size() ; i< cardButtons.size(); i++){
        cardButtons.get(i).setIcon(null);//making all icons to null
        }
    }
    public void fillSlots(){
        cardButtons.add(slot1);
        cardButtons.add(slot2);
        cardButtons.add(slot3);
        cardButtons.add(slot4);
        cardButtons.add(slot5);
        cardButtons.add(slot6);
        cardButtons.add(slot7);
        cardButtons.add(slot8);
        cardButtons.add(slot9);
        cardButtons.add(slot10);
        cardButtons.add(slot11);
        cardButtons.add(slot12);
        cardButtons.add(slot13);
        cardButtons.add(slot14);
        cardButtons.add(slot15);
        cardButtons.add(slot16);
        cardButtons.add(slot17);
        cardButtons.add(slot18);
        cardButtons.add(slot19);
        cardButtons.add(slot20);   
    }
    
    public void setPlayerIdName(){
        String currentPlayer = game.getCurrentPlayer();
        playerName.setText(currentPlayer + "'s Cards");
    }
    
    public void setPlayerIdName(String currentPlayer){
        playerName.setText(currentPlayer + "'s Cards");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        slot1 = new javax.swing.JButton();
        slot2 = new javax.swing.JButton();
        slot3 = new javax.swing.JButton();
        slot4 = new javax.swing.JButton();
        slot5 = new javax.swing.JButton();
        slot6 = new javax.swing.JButton();
        slot7 = new javax.swing.JButton();
        slot8 = new javax.swing.JButton();
        slot9 = new javax.swing.JButton();
        slot10 = new javax.swing.JButton();
        slot11 = new javax.swing.JButton();
        slot12 = new javax.swing.JButton();
        slot13 = new javax.swing.JButton();
        slot14 = new javax.swing.JButton();
        slot15 = new javax.swing.JButton();
        slot16 = new javax.swing.JButton();
        slot17 = new javax.swing.JButton();
        slot18 = new javax.swing.JButton();
        slot19 = new javax.swing.JButton();
        slot20 = new javax.swing.JButton();
        playerName = new javax.swing.JLabel();
        drawCard = new javax.swing.JButton();
        drawPile = new javax.swing.JButton();
        discardPile = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        slot1.setBackground(new java.awt.Color(51, 51, 51));
        slot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot1ActionPerformed(evt);
            }
        });

        slot2.setBackground(new java.awt.Color(51, 51, 51));
        slot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot2ActionPerformed(evt);
            }
        });

        slot3.setBackground(new java.awt.Color(51, 51, 51));
        slot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot3ActionPerformed(evt);
            }
        });

        slot4.setBackground(new java.awt.Color(51, 51, 51));
        slot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot4ActionPerformed(evt);
            }
        });

        slot5.setBackground(new java.awt.Color(51, 51, 51));
        slot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot5ActionPerformed(evt);
            }
        });

        slot6.setBackground(new java.awt.Color(51, 51, 51));
        slot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot6ActionPerformed(evt);
            }
        });

        slot7.setBackground(new java.awt.Color(51, 51, 51));
        slot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot7ActionPerformed(evt);
            }
        });

        slot8.setBackground(new java.awt.Color(51, 51, 51));
        slot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot8ActionPerformed(evt);
            }
        });

        slot9.setBackground(new java.awt.Color(51, 51, 51));
        slot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot9ActionPerformed(evt);
            }
        });

        slot10.setBackground(new java.awt.Color(51, 51, 51));
        slot10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot10ActionPerformed(evt);
            }
        });

        slot11.setBackground(new java.awt.Color(51, 51, 51));
        slot11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot11ActionPerformed(evt);
            }
        });

        slot12.setBackground(new java.awt.Color(51, 51, 51));
        slot12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot12ActionPerformed(evt);
            }
        });

        slot13.setBackground(new java.awt.Color(51, 51, 51));
        slot13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot13ActionPerformed(evt);
            }
        });

        slot14.setBackground(new java.awt.Color(51, 51, 51));
        slot14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot14ActionPerformed(evt);
            }
        });

        slot15.setBackground(new java.awt.Color(51, 51, 51));
        slot15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot15ActionPerformed(evt);
            }
        });

        slot16.setBackground(new java.awt.Color(51, 51, 51));
        slot16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot16ActionPerformed(evt);
            }
        });

        slot17.setBackground(new java.awt.Color(51, 51, 51));
        slot17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot17ActionPerformed(evt);
            }
        });

        slot18.setBackground(new java.awt.Color(51, 51, 51));
        slot18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot18ActionPerformed(evt);
            }
        });

        slot19.setBackground(new java.awt.Color(51, 51, 51));
        slot19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot19ActionPerformed(evt);
            }
        });

        slot20.setBackground(new java.awt.Color(51, 51, 51));
        slot20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot20ActionPerformed(evt);
            }
        });

        playerName.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        playerName.setForeground(new java.awt.Color(255, 255, 255));
        playerName.setText("...");

        drawCard.setBackground(new java.awt.Color(20, 206, 70));
        drawCard.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        drawCard.setForeground(new java.awt.Color(255, 255, 255));
        drawCard.setText("DRAW CARD");
        drawCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawCardActionPerformed(evt);
            }
        });

        drawPile.setIcon(new javax.swing.ImageIcon("C:\\Users\\91870\\OneDrive\\Desktop\\cardsImage\\Deck.png")); // NOI18N
        drawPile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawPileActionPerformed(evt);
            }
        });

        discardPile.setBackground(new java.awt.Color(4, 240, 34));
        discardPile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardPileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(discardPile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(drawCard, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(drawPile, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slot11, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot12, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(slot13, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot14, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot15, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(slot16, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot17, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot18, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(slot19, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slot20, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discardPile, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drawPile)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(drawCard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(playerName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slot16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void slot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot3ActionPerformed
        if(cardIds.get(2) != null){
            int index = 2;
            String cardId = cardIds.get(2);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot3ActionPerformed

    private void slot11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot11ActionPerformed
        if(cardIds.get(10) != null){
            int index = 10;
            String cardId = cardIds.get(10);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot11ActionPerformed

    private void slot20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot20ActionPerformed
        if(cardIds.get(19) != null){
            int index = 19;
            String cardId = cardIds.get(19);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot20ActionPerformed

    private void slot13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot13ActionPerformed
        if(cardIds.get(12) != null){
            int index = 12;
            String cardId = cardIds.get(12);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot13ActionPerformed

    private void slot12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot12ActionPerformed
        if(cardIds.get(11) != null){
            int index = 11;
            String cardId = cardIds.get(11);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot12ActionPerformed

    private void slot14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot14ActionPerformed
        if(cardIds.get(13) != null){
            int index = 13;
            String cardId = cardIds.get(13);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot14ActionPerformed

    private void slot15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot15ActionPerformed
        if(cardIds.get(14) != null){
            int index = 14;
            String cardId = cardIds.get(14);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot15ActionPerformed

    private void slot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot1ActionPerformed
        if(cardIds.get(0) != null){
            int index = 0;
            String cardId = cardIds.get(0);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot1ActionPerformed

    private void drawPileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawPileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drawPileActionPerformed

    private void drawCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawCardActionPerformed
        JLabel message = new JLabel(game.getCurrentPlayer() + " has drawn a card!");
        message.setFont(new Font("Calbri",Font.BOLD,24));
        JOptionPane.showMessageDialog(null,message);
        
        try{
            game.submitDraw(game.getCurrentPlayer());
        }catch(InvalidPlayerTurnException e){
            Logger.getLogger(PlayArea.class.getName()).log(Level.SEVERE,null,e);
        }
        this.setPlayerIdName(game.getCurrentPlayer());
        this.setButtonIcons();
    }//GEN-LAST:event_drawCardActionPerformed

    private void slot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot2ActionPerformed
        if(cardIds.get(1) != null){
            int index = 1;
            String cardId = cardIds.get(1);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot2ActionPerformed

    private void slot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot4ActionPerformed
        if(cardIds.get(3) != null){
            int index = 3;
            String cardId = cardIds.get(3);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot4ActionPerformed

    private void slot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot5ActionPerformed
        if(cardIds.get(4) != null){
            int index = 4;
            String cardId = cardIds.get(4);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot5ActionPerformed

    private void slot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot6ActionPerformed
        if(cardIds.get(5) != null){
            int index = 5;
            String cardId = cardIds.get(5);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot6ActionPerformed

    private void slot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot7ActionPerformed
        if(cardIds.get(6) != null){
            int index = 6;
            String cardId = cardIds.get(6);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot7ActionPerformed

    private void slot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot8ActionPerformed
        if(cardIds.get(7) != null){
            int index = 7;
            String cardId = cardIds.get(7);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot8ActionPerformed

    private void slot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot9ActionPerformed
        if(cardIds.get(8) != null){
            int index = 8;
            String cardId = cardIds.get(8);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot9ActionPerformed

    private void slot10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot10ActionPerformed
        if(cardIds.get(9) != null){
            int index = 9;
            String cardId = cardIds.get(9);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot10ActionPerformed

    private void slot16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot16ActionPerformed
        if(cardIds.get(15) != null){
            int index = 15;
            String cardId = cardIds.get(15);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot16ActionPerformed

    private void slot17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot17ActionPerformed
        if(cardIds.get(16) != null){
            int index = 16;
            String cardId = cardIds.get(16);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot17ActionPerformed

    private void slot18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot18ActionPerformed
        if(cardIds.get(17) != null){
            int index = 17;
            String cardId = cardIds.get(17);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot18ActionPerformed

    private void slot19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot19ActionPerformed
        if(cardIds.get(18) != null){
            int index = 18;
            String cardId = cardIds.get(18);
            window = new CardConfirmation(cardId,game,index,cardButtons,this,discardPile);
            window.setBounds(400,40,400,400);
            window.setVisible(true);
            window.setResizable(false);
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            
        }
    }//GEN-LAST:event_slot19ActionPerformed

    private void discardPileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardPileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discardPileActionPerformed

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
            java.util.logging.Logger.getLogger(PlayArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlayArea().setVisible(true);
            }
        });
    }

    // VCalibribles declaration - do not modify//GEN-BEGIN:vCalibribles
    private javax.swing.JButton discardPile;
    private javax.swing.JButton drawCard;
    private javax.swing.JButton drawPile;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel playerName;
    private javax.swing.JButton slot1;
    private javax.swing.JButton slot10;
    private javax.swing.JButton slot11;
    private javax.swing.JButton slot12;
    private javax.swing.JButton slot13;
    private javax.swing.JButton slot14;
    private javax.swing.JButton slot15;
    private javax.swing.JButton slot16;
    private javax.swing.JButton slot17;
    private javax.swing.JButton slot18;
    private javax.swing.JButton slot19;
    private javax.swing.JButton slot2;
    private javax.swing.JButton slot20;
    private javax.swing.JButton slot3;
    private javax.swing.JButton slot4;
    private javax.swing.JButton slot5;
    private javax.swing.JButton slot6;
    private javax.swing.JButton slot7;
    private javax.swing.JButton slot8;
    private javax.swing.JButton slot9;
    // End of vCalibribles declaration//GEN-END:vCalibribles
}
