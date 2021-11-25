package UNO;
/*
*The Deck class consists of 108 Uno Cards. There are four suits, Red, Green, Blue and Yellow
* each consisting of one 0 card, two 1 cards, 2s, 3sl4sl...,9s; two Draw Two cards, two skip cards;
*two reverse
*/ 
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Akshat Gupta
 * @author Varun Sahni
 */


public class NormalCard implements Card {
    private CardInfo[] cards;
    private int cardsInDeck;
    public NormalCard()
    {
     cards = new CardInfo[108];  
     restart();
    }
    
    
    /* replaces the deck with an arraylist of UnoCards(the stock pile)*/
    public void substituteDeckWith(ArrayList<CardInfo> cards){
        this.cards = cards.toArray(new CardInfo[cards.size()]);
        this.cardsInDeck = this.cards.length;
    } 
    
    // return true if there are no cards in the deck
    public boolean isEmpty(){
        return cardsInDeck==0;
    }
    
    public void restart()
    {
        CardInfo.Color[] colors = CardInfo.Color.values();
        cardsInDeck = 0;
        for(int i=0;i<colors.length-1;i++)
        {
            CardInfo.Color color = colors[i];
            cards[cardsInDeck++]=new CardInfo(color,CardInfo.Value.getValue(0));
            
            for(int j=1;j<10;j++)
            {
              cards[cardsInDeck++] =  new CardInfo(color,CardInfo.Value.getValue(j));
              cards[cardsInDeck++] =  new CardInfo(color,CardInfo.Value.getValue(j));
            }
            
            CardInfo.Value[] values = new CardInfo.Value[]{CardInfo.Value.DrawTwo,CardInfo.Value.Skip,CardInfo.Value.Reverse};
            for(CardInfo.Value value:values)
            {
                cards[cardsInDeck++] =  new CardInfo(color,value);
                cards[cardsInDeck++] =  new CardInfo(color,value);
            }
        }
        
        CardInfo.Value[] values = new CardInfo.Value[]{CardInfo.Value.Wild,CardInfo.Value.Wild_Four};
        for(CardInfo.Value value:values)
            {   for(int i=0;i<4;i++)
                {
                    cards[cardsInDeck++] =  new CardInfo(CardInfo.Color.Wild,value);
                }
                
            }
    }

    public void rearrange(){
        int n=cards.length;
        Random random = new Random();
        for(int i=0;i<cards.length;i++)
        {
            int randomValue = i+random.nextInt(n-i);
            CardInfo randomCard = cards[randomValue];
            cards[randomValue]=cards[i];
            cards[i]=randomCard;
            
        }
    }
    
    public CardInfo drawCard() throws IllegalArgumentException{
        if(isEmpty()){
            throw new IllegalArgumentException("Cannot draw a card since there are no cards in the deck");
        }
        return cards[--cardsInDeck];
    }
    
    public ImageIcon drawCardImage() throws IllegalArgumentException{
        if(isEmpty()){
            throw new IllegalArgumentException("Cannot draw a card since there are no cards in the deck");
        }
        return new ImageIcon(cards[--cardsInDeck].toString() + ".png");
    }
    
    public CardInfo[] drawCard(int n){
        if(n<0){
            throw new IllegalArgumentException("Must draw positive cards but tried to draw"+n+"cards from the deck");
        }
        
        if(n>cardsInDeck){
            throw new IllegalArgumentException("Cannot draw " + n + " cards since there are only " + cardsInDeck + " cards present in deck");
        }
        
        CardInfo[] ret=new CardInfo[n];
        for(int i=0;i<n;i++){
            ret[i]=cards[--cardsInDeck];
        }
            
        return ret;            
    }
}
