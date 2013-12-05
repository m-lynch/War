//Michael Lynch

import java.util.Random; //Needed for shuffle method
import java.util.ArrayList;
import java.util.Collections;


public class PileOfCards
{
   public static  ArrayList<Card> pileOfCards;

   public PileOfCards()
   {
      pileOfCards = new ArrayList<Card>();
   }
   
   public void remove(Card c)
   {
      pileOfCards.remove(c);
   }
   
   public void add(Card c)
   {
      pileOfCards.add(c);
   }
   
   public int size()
   {
      int num = 0;
      for (Card C : pileOfCards)
      {
         num++;
      }
      return num;
   }  
   
   public Card get(int n)
   {
      Card c = pileOfCards.get(n);
      return c;
   }


   public void printCards()
   {
      for (Card C : pileOfCards)
      {
         System.out.println(C.getRank() + " of " + C.getSuit());
         
      }
   }

}
