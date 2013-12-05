import java.util.Random;      //Needed for shuffle method
import java.util.ArrayList;   //Needed for ArrayList
import java.util.Collections; //Needed for shuffle method

//This class holds information about a deck of cards...an ArrayList of Cards
public class Deck extends PileOfCards
{
   
   public static ArrayList<Card> deckOfCards;
   
   public Deck()
   {
      deckOfCards = new ArrayList<Card>();
      int i = 0;
      
      for ( Card.Suit s : Card.Suit.values())
      {
         for( Card.Rank r : Card.Rank.values())
         {
            Card C = new Card(r,s);
            deckOfCards.add(C);
            i++;
         }
      }
   }
   
   public void shuffle()
   {
      Collections.shuffle(deckOfCards);
   }
   
   public Card getTopCard()
   {
      Card topCard = deckOfCards.get(0);
      return topCard;
   }
   
   public void printCards()
   {
      for (Card C : deckOfCards)
      {
         System.out.println(C.getRank() + " of " + C.getSuit());
         
      }
   }
   
   public int size()
   {
      int num = 0;
      for (Card C : deckOfCards)
      {
         num++;
      }
      return num;
   }  
   
   public void remove(Card c)
   {
      deckOfCards.remove(c);
   }
   
   public void add(Card c)
   {
      deckOfCards.add(c);
   }
   
   public Card get(int n)
   {
      Card c = deckOfCards.get(n);
      return c;
   }

      
     
   public static void main(String [] args)
   {
      Deck d = new Deck();
            System.out.println("****************");
      d.shuffle();
      for (Card C : deckOfCards)
      {
         System.out.println(C);
      }
      System.out.println("/////////////////");
      System.out.println(d.getTopCard());
   }
   
}