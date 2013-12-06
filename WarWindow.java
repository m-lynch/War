//Michael Lynch
//CS 110
//December 5, 2013

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;      //Needed for shuffle method
import java.util.ArrayList;   //Needed for ArrayList
import java.util.Collections; //Needed for shuffle method


public class WarWindow extends JFrame
{
   private JPanel panel;
   private JButton playHand;
   private JButton startNewGame;
   private final int WINDOW_WIDTH = 350;
   private final int WINDOW_HEIGHT = 250;
   public Deck WarDeck;
   private PileOfCards CardsWon;
   private PileOfCards P1Cards;
   private PileOfCards P2Cards;
   private PileOfCards discard;

   public WarWindow()
   {
      setTitle("WAR");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      
      add(panel);
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setVisible(true);
      
      
      
      
      ///////////
      WarDeck = new Deck();
      CardsWon = new PileOfCards();
      P1Cards = new PileOfCards();
      P2Cards = new PileOfCards();
      
      WarDeck.shuffle();
      
      //WarDeck.printCards();    
      System.out.println(WarDeck.size());
      
    //   while(WarDeck.size() > 0)
//       {
//          Card topCard = WarDeck.getTopCard();
//          WarDeck.remove(topCard);
//          P1Cards.add(topCard);
//          topCard = WarDeck.getTopCard();
//          WarDeck.remove(topCard);
//          P2Cards.add(topCard);
//          System.out.println(WarDeck.size());
//          
//       }
//       
//       P1Cards.printCards();
      this.dealDeck(WarDeck,P1Cards,P2Cards);
      
      System.out.println(WarDeck.size());
      System.out.println(P1Cards.size());
      System.out.println(P2Cards.size());

      
   }
   
   private void buildPanel()
   {
      playHand = new JButton("Play Hand");
      playHand.addActionListener(new PlayHandListener());
      panel = new JPanel();
      panel.add(playHand);
   }
   
   
   private class PlayHandListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      }
   }
   public static void main(String [] args)
   {
      WarWindow window = new WarWindow();
   }
   
   public void dealDeck(Deck d, PileOfCards a, PileOfCards b)
   {
      int num = 0;
      while(num<26)
      {
         Card k = new Card(WarDeck.get(num));
         a.add(k);
         num++;
         System.out.println("********" + num);
         a.printCards();
         System.out.println("////////////" + num);
         b.printCards();
      }
         

      while(num>=26 && num< 52)
      {
         b.add(WarDeck.get(num));
         num++;
         System.out.println("********" + num);
         b.printCards();

      }
               
   }
}