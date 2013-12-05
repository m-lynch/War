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
      
      WarDeck.printCards();    
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
      this.dealDeck();
      
      System.out.println(WarDeck.size());
      System.out.println(P1Cards.size());
      System.out.println(P2Cards.size());
      
      P1Cards.printCards();
      System.out.println("**********************");
    
      
      P2Cards.printCards();
      

      
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
   
   public void dealDeck()
   {
      int num = 0;
      while (num<26)
      {
         if(num%2 == 0)
         {
            P1Cards.add(WarDeck.get(num));
         }
         else if(num%2 != 0)
         {
            P2Cards.add(WarDeck.get(num));
         }
         num++;
         
      }
   }
}