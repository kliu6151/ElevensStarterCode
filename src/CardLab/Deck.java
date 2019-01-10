package CardLab;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> unDealt;
    List<Card> Dealt;

    public Deck(String[] Rank, String[] Suit, int[] pointValue)
    {
        List<Card> deck = new ArrayList();

        for(int s = 0;s<Suit.length;s++)
        {
            for(int i = 0;i<Rank.length;i++)
            {
                deck.add(new Card(Rank[i] , Suit[s], pointValue[i]));
            }
        }
        this.unDealt = deck;
        this.Dealt = new ArrayList();

    }
    public boolean isEmpty()
    {
        return unDealt.size() <= 0;
    }
    public int size(int amount)
    {
        return unDealt.size();
    }
    public Card deal()
    {
        if(this.unDealt.size() <= 0)
        {
            return null;
        }
        Card topCard = this.unDealt.remove(0);
        this.Dealt.add(topCard);
        return topCard;
    }
    public void shuffle()
    {
        System.out.println(this.unDealt);
        for(int i = 0;i<this.Dealt.size()-1;i++)
        {
            this.unDealt.add(this.Dealt.get(i));
        }
        for(int k = this.unDealt.size()-1;k>0;k--)
        {
            int r = (int)(Math.random() * this.unDealt.size());
            Card temp = this.unDealt.get(k);
            this.unDealt.set(k,this.unDealt.get(r));
            this.unDealt.set(r,temp);
        }

    }
}