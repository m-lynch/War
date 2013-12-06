//Michael Lynch
//CS 110
//October 7, 2013

//This class holds information about a card including suit and rank
public final class Card
{
   //Possible ranks of card
   public enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
   //Possible suits of card
   public enum Suit {HEARTS, DIAMONDS, CLUBS, SPADES}
   
   //Rank for this card
   public Rank rank;
   //Suit for this card
   public Suit suit;
   
   //This constructor takes in a Rank and Suit from the enum type
   public Card(final Rank rank, final Suit suit)
   {
      this.rank = rank;
      this.suit = suit;
   }
   
   public Card(Card another)
   {
      this.rank = another.rank;
      this.suit = another.suit;
   }
   
   //This method returns the rank of the card
   public Rank getRank()
   {
      return rank;
   }
   
   //This method returns the suit of the card
   public Suit getSuit()
   {
      return suit;
   }
   
   //This method sets the rank of the card
   public void setRank(Rank r)
   {
      rank = r;
   }
   
   //This method sets the suit of the card
   public void setSuit(Suit s)
   {
      suit = s;
   }
   
   //This method returns the suit and rank in a string
   public String toString()
   {
      String str;
      str = this.getRank() + " of " + this.getSuit();
      return str;
   }

}

