// Name: Steve Regala
// USC NetID: sregala
// CS 455 PA1
// Fall 2021

import javax.swing.*;
import java.util.Scanner;


/**
  * Contains the main method
  * Prompts for the number of trials and creates the JFrame containing the CoinSimComponent
  * Does not depend on any other classes besides CoinSimComponent
*/
public class CoinSimViewer
{
   
   private static final int WIDTH_DEFAULT = 800;  // when we first want to output the frame,
   private static final int HEIGHT_DEFAULT = 500; // we will start with these given dimensions
  
   public static void main(String[] args)
   {

      Scanner in = new Scanner(System.in);
      
      System.out.print("Enter number of trials: ");
      int numberOfTrials = in.nextInt();
      
      /*
         We first get the number of trials from the user and then enter the while loop if the user provides
         an invalid number for number of trials. If the while loop is entered, it will prompt the user to 
         enter an an appropriate number; it will keep asking for a valid number until the user does so.
         Once the while loop is exited, the program will proceed to construct the display frame.
      */
        
      while (numberOfTrials <= 0) 
      {
         System.out.println("ERROR: Number entered must be greater than 0.");
         System.out.print("Enter number of trials: ");
         numberOfTrials = in.nextInt();
      }
      
      JFrame frame = new JFrame();

      frame.setSize(WIDTH_DEFAULT, HEIGHT_DEFAULT);
      frame.setTitle("CoinSim");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      CoinSimComponent component = new CoinSimComponent(numberOfTrials);
      frame.add(component);

      frame.setVisible(true);
      
   }
}