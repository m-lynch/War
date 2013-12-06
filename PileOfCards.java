//Michael Lynch

import java.util.Random; //Needed for shuffle method
import java.util.ArrayList;
import java.util.Collections;


public class PileOfCards
{
   public ArrayList<Card> cards = new ArrayList<Card>();

   public PileOfCards()
   {
      cards = null;
   }
   
   public void remove(Card c)
   {
      cards.remove(c);
   }
   
   public void add(Card c)
   {
      cards.add(c);
   }
   
   public int size()
   {
      int num = 0;
      for (Card C : cards)
      {
         num++;
      }
      return num;
   }  
   
   public Card get(int n)
   {
      Card c = cards.get(n);
      return c;
   }


   public void printCards()
   {
      for (Card C : cards)
      {
         System.out.println(C.getRank() + " of " + C.getSuit());
         
      }
   }

}
