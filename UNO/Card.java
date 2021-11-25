package UNO;

import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 *
 * @author Akshat Gupta
 * @author Varun Sahni
 */
public interface Card
{
    public void restart();
    public void substituteDeckWith(ArrayList<CardInfo> cards);
    public boolean isEmpty();
    public void rearrange();
    public CardInfo drawCard();
    public ImageIcon drawCardImage();
    public CardInfo[] drawCard(int n);
    
}
