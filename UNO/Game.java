package UNO;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshat Gupta and Varun Sahini
 */
public class Game {
    private int currentPlayer;
    private String[] playerIds;
    
    private NormalCard deck;
    private ArrayList<ArrayList<CardInfo>> playerHand;
    private ArrayList<CardInfo> stockPile;
    
    private CardInfo.Color validColor;
    private CardInfo.Value validValue;
    
    boolean gameDirection;
    
    public Game(String[] playerIds){
        deck = new NormalCard();
        deck.rearrange();
        stockPile = new ArrayList<CardInfo>();
     
        this.playerIds = playerIds;
        currentPlayer=0;
        gameDirection = false;
        
        playerHand = new ArrayList<ArrayList<CardInfo>>();
        
        for(int i = 0; i < playerIds.length; i++){
            ArrayList<CardInfo> hand = new ArrayList<CardInfo>(Arrays.asList(deck.drawCard(7)));
            playerHand.add(hand);   
        }     
    }
    
    public void start(Game game){
        CardInfo card = deck.drawCard();
        validColor = card.getColor();
        validValue = card.getValue();
        
        if(card.getValue() == CardInfo.Value.Wild || card.getValue() == CardInfo.Value.Wild_Four || card.getValue() == CardInfo.Value.DrawTwo){
            start(game);
        }
        
        if(card.getValue() == CardInfo.Value.Skip){
            JLabel message = new JLabel(playerIds[currentPlayer] + " was skipped!");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);
            
            if(gameDirection == false){
                currentPlayer = (currentPlayer+1) % playerIds.length;
            }
            
            else if(gameDirection == true){
                currentPlayer = (currentPlayer - 1)% playerIds.length;
                if(currentPlayer ==-1){
                    currentPlayer = playerIds.length - 1;
                }
            }
        }
        
        if(card.getValue() == CardInfo.Value.Reverse){
            JLabel message = new JLabel(playerIds[currentPlayer] + " The game direction changed!");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);   
            
            if(gameDirection){
                gameDirection = false;
            }
            
            else if(!gameDirection){
                gameDirection = true;
            }
            if(playerIds.length !=2){
            currentPlayer = playerIds.length - 1;
        }
        }
        
        stockPile.add(card);
    }
    public CardInfo getTopCard(){
        return new CardInfo(validColor, validValue);
    }
    
    public ImageIcon getTopCardImage() {
        return new ImageIcon(validColor + "_" + validValue + ".png");
    }
    
    public boolean isGameOver(){
        for(String player: this.playerIds){
            if(hasEmptyHand(player)){
                return true;
            }
        }
        
        return false;
    }
    
    public String getCurrentPlayer(){
        return this.playerIds[this.currentPlayer];
    }
    
    public String getPreviousPlayer(int i){
        int index = this.currentPlayer - i;
        if(index == -1){
            index = playerIds.length - 1;
        }
        return this.playerIds[index];
    }
    
    public String[] getPlayers(){
        return playerIds;
    }
    
    public ArrayList<CardInfo> getPlayerHand(String playerIds){
        int index = Arrays.asList(this.playerIds).indexOf(playerIds);
        return playerHand.get(index);
    }
    
    public int getPlayerHandsSize(String playerIds){
        return getPlayerHand(playerIds).size();
    }
    
    public CardInfo getPlayerCard(String playerIds, int choice){
        ArrayList<CardInfo> hand = getPlayerHand(playerIds);
        return hand.get(choice);
    }
    
    public boolean hasEmptyHand(String playerIds){
        return getPlayerHand(playerIds).isEmpty();
    }
    
    public boolean validCardPlay(CardInfo card){
        return card.getColor() == validColor || card.getValue() == validValue;
    }
    
    public void checkPlayerTurn(String playerIds) throws InvalidPlayerTurnException {
        if(this.playerIds[this.currentPlayer] != playerIds){
            throw new InvalidPlayerTurnException("It is not " + playerIds + " 's turn", playerIds);
        }
    }
    
    public void submitDraw(String playerIds) throws InvalidPlayerTurnException {
        checkPlayerTurn(playerIds);
        
        if(deck.isEmpty()){
            deck.substituteDeckWith(stockPile);
            deck.rearrange();            
        }
        
        getPlayerHand(playerIds).add(deck.drawCard());
        
        if(gameDirection == false) {
            currentPlayer = (currentPlayer + 1)%playerIds.length();
        }
        
        else if(gameDirection == true) {
            currentPlayer = (currentPlayer - 1)%playerIds.length();
            
            if(currentPlayer ==-1){
                    currentPlayer = playerIds.length() - 1;
                }
        }   
    }
    
    public void setCardColor(CardInfo.Color color){
        validColor = color;
    }
    public void submitPlayerCard(String pid, CardInfo card, CardInfo.Color declaredColor) throws InvalidColorSubmissionException, InvalidValueSubmissionException, InvalidPlayerTurnException {
        checkPlayerTurn(pid);

        ArrayList<CardInfo> phand = getPlayerHand(pid);

        if(!validCardPlay(card)){
            if (card.getColor() == CardInfo.Color.Wild ){
                validColor = card.getColor();
                validValue = card.getValue();
            }
            if(card.getColor() != validColor){
                JLabel message = new JLabel("Invalid player move, excected color: " + validColor + "but got color" + card.getColor()); 
                message.setFont(new Font("Calibri", Font.BOLD, 24));
                JOptionPane.showMessageDialog(null, message);
                throw new InvalidColorSubmissionException("Invalid player move, excected color: " + validColor + "but got color" + card.getColor(), card.getColor(), validColor);
            }
            else if(card.getValue() != validValue){
                JLabel message = new JLabel("Invalid player move, excected value: " + validValue + "but got value" + card.getValue()); 
                message.setFont(new Font("Calibri", Font.BOLD, 24));
                JOptionPane.showMessageDialog(null, message);
                throw new InvalidValueSubmissionException("Invalid player move, excected value: " + validValue + "but got value" + card.getValue(), card.getValue(), validValue);
            }
        }
        phand.remove(card);
        if(hasEmptyHand(this.playerIds[this.currentPlayer])){
            JLabel message = new JLabel(this.playerIds[this.currentPlayer] + " has won the game!" + "Thank You for playing");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);
            System.exit(0);
        }

        validColor = card.getColor();
        validValue = card.getValue();
        stockPile.add(card);

        if(gameDirection == false) {
            currentPlayer = (currentPlayer + 1) % playerIds.length;
        }
        
        else if(gameDirection == true) {
            currentPlayer = (currentPlayer - 1)%playerIds.length;
            
            if(currentPlayer ==-1){
                    currentPlayer = playerIds.length - 1;
                }
        }

        if ( card.getColor()== CardInfo.Color.Wild){
            validColor = declaredColor;
        }
        if (card.getValue() == CardInfo.Value.DrawTwo){
            pid = playerIds[currentPlayer];
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            JLabel message = new JLabel(this.playerIds[this.currentPlayer] + " has drawn 2 cards");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);
        }
        if (card.getValue() == CardInfo.Value.Wild_Four){
            pid = playerIds[currentPlayer];
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            JLabel message = new JLabel(this.playerIds[this.currentPlayer] + " has drawn 4 cards");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);
        }
        if ( card.getValue()== CardInfo.Value.Skip){
            JLabel message = new JLabel(this.playerIds[this.currentPlayer] + " has skipped");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);
            if(gameDirection == false) {
                currentPlayer = (currentPlayer + 1) % playerIds.length;
            }
            
            else if(gameDirection == true) {
                currentPlayer = (currentPlayer - 1)%playerIds.length;
                
                if(currentPlayer ==-1){
                    currentPlayer = playerIds.length - 1;
                }
            }
            
        }
        if ( card.getValue()== CardInfo.Value.Reverse){
            
            JLabel message = new JLabel(this.playerIds[this.currentPlayer] + " has reversed the direction");
            message.setFont(new Font("Calibri", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, message);
            if(gameDirection){
                gameDirection = false;
            }
            else if(!gameDirection){
                gameDirection = true;
            }
            
            if (gameDirection == true){
               if(playerIds.length !=2){
                currentPlayer = (currentPlayer - 2)%playerIds.length;
                
                if(currentPlayer == -1){
                    currentPlayer = playerIds.length - 1;
                }
                if(currentPlayer == -2){
                    currentPlayer = playerIds.length - 2;
                }
               }
            }
            else if (gameDirection == false){
                if(playerIds.length !=2){
                currentPlayer = (currentPlayer + 2) % playerIds.length;
            }
            }
        }
}
}


class InvalidPlayerTurnException extends Exception{
    private String playerId;
    
    public InvalidPlayerTurnException(String message, String playerId){
        super(message);
        this.playerId = playerId;
    }
  
    public String getPlayerId(){
        return playerId;
    }
}
class InvalidColorSubmissionException extends Exception{
    private CardInfo.Color expectedColor;
    private CardInfo.Color actualColor;

    public InvalidColorSubmissionException(String message, CardInfo.Color expectedColor, CardInfo.Color actualColor){
        super(message);
        this.expectedColor = expectedColor;
        this.actualColor = actualColor;
    }
}
class InvalidValueSubmissionException extends Exception{
    private CardInfo.Value expectedValue;
    private CardInfo.Value actualValue;

    public InvalidValueSubmissionException(String message, CardInfo.Value expectedValue, CardInfo.Value actualValue){
        super(message);
        this.expectedValue = expectedValue;
        this.actualValue = actualValue;
    }
}