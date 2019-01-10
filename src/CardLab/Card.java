package CardLab;

public class Card {
    String Rank;
    String Suit;
    int pointValue;

    public Card(String Rank, String Suit, int pointValue)
    {
        this.Rank = Rank;
        this.Suit = Suit;
        this.pointValue =  pointValue;
    }

    public String getRank()
    {
        return this.Rank;
    }
    public String getSuit()
    {
        return this.Suit;
    }
    public int getPointValue()
    {
        return this.pointValue;
    }
    public boolean equals(Card otherCard)
    {
        return this.pointValue == otherCard.pointValue;
    }
    public String toString()
    {
        return this.Rank + " of " + this.Suit;
    }
}
