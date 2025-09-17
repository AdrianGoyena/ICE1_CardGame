/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author adrian
 * Student ID: 991655810
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        /*
        Need to print 7 cards
        print :  clubs 3, diamonds 3
        need to use array
        */
       /*Card c1 = new Card();
        c1.setSuit("diamond");
        c1.setValue(1); */
        
        Card[] magicHand = new Card[7];
        Random rng = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //Generates a number between 1-13
            c.setValue(rng.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            //Generates a number between 0-3 [0,1,2,3]
            int suitsLoc = rng.nextInt(4);
            //sets the suit according to the number given [0] = ["Hearts"]
            c.setSuit(Card.SUITS[suitsLoc]);
            //[] = c;
            magicHand[i] = c;
            //print array of object
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        /*
        //insert code to ask the user for Card value and suit, create their card
        Scanner usrIn = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int cardVal = usrIn.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitsLoc = usrIn.nextInt();
        
        Card inputCard = new Card();
        inputCard.setValue(cardVal);
        inputCard.setSuit(Card.SUITS[suitsLoc]);
        
        // and search magicHand here
        boolean cardFound = false;
        for (int i=0; i<magicHand.length; i++) {
            Card card = magicHand[i];
            if (card.getValue() == inputCard.getValue() && inputCard.getSuit().equals(inputCard.getSuit())){
                cardFound = true;
                break;
            }
        }
        
        //Then report the result here
        
       if (cardFound == true) {
           System.out.println("Your card " + inputCard.getSuit() + " "+ inputCard.getValue() + " was found in magic hand!");    
       } else {
           System.out.println("Sorry your card is not in the magic hand");
       }*/
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Diamonds");
        
        boolean cardFound = false;
        for (int i=0; i<magicHand.length; i++) {
            Card card = magicHand[i];
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())){
                cardFound = true;
                break;
            }
        }
        
        if (cardFound == true) {
           System.out.println("Your card " + luckyCard.getSuit() + " "+ luckyCard.getValue() + " was found in magic hand!");    
       } else {
           System.out.println("Sorry your card is not in the magic hand");
       }
    }
    
}
