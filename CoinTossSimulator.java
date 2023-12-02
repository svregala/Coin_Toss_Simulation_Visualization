// Name: Steve Regala
// USC NetID: sregala
// CS 455 PA1
// Fall 2021

import java.util.Random;

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

public class CoinTossSimulator {

   private int bothHeads;
   private int bothTails;
   private int diffOutcome;
   private Random gen;           // ONLY NEED ONE RANDOM GENERATOR
   
   private static final int HEAD = 0;  // 0 represents a head toss
   private static final int TAIL = 1;  // 1 represents a tail toss

   
   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
      int numTrials = 0;
      bothHeads = 0;
      bothTails = 0;
      diffOutcome = 0;
      gen = new Random(); // ONLY NEED ONE RANDOM GENERATOR
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
   */
   public void run(int numTrials) {
      
      /*
         This is a for-loop that runs depending on numTrials.
         It has local variables firstCoin and secondCoin to represent the result of a flip.
         A denomination count is incremented depending on the results of the coin flip.
      */
      for (int i=0; i<numTrials; i++) {
         
         int firstCoin = gen.nextInt(2);    // first coin
         int secondCoin = gen.nextInt(2);   // second coin (these are local variables) 
         
         if (firstCoin==HEAD && secondCoin==HEAD) {
            bothHeads++;
         }
         
         else if (firstCoin==TAIL && secondCoin==TAIL) {
            bothTails++;
         }
         
         else {
            diffOutcome++;
         }
      }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return bothHeads + bothTails + diffOutcome;
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
      return bothHeads;
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
      return bothTails;
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
      return diffOutcome;
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      int numTrials = 0;
      bothHeads = 0;
      bothTails = 0;
      diffOutcome = 0;
      gen = new Random();
   }

}
