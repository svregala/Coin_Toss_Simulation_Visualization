// Name: Steve Regala
// USC NetID: sregala
// CS 455 PA1
// Fall 2021

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * CoinSimComponent class that extends JComponent
 * The constructor initializes any necessary data and runs the simulation.
 * Overrides paintComponent to draw the bar graph, using Bar objects for each bar in the graph.
 * This class uses CoinTossSimulator and Bar class.
 * 
*/

public class CoinSimComponent extends JComponent
{

   private int inputTrial; 
   private CoinTossSimulator toss;   // we initialize object toss as an instance variable (varying designs available)
   
   private static final int BAR_WIDTH = 100;           // assigned this to 100 pixels (of my choice)
   private static final int TOTAL_VERT_BUFFER = 100;   // top vertical buffer is 50 and bottom vertical buffer is 50
   private static final int BOTTOM_VERT_BUFFER = 50;

   // magic numbers that help determine the left component of the individual bar
   private static final int HALF_BARWIDTH = 2;           // this will divide BAR_WIDTH by 2
   private static final int HALF_FRAMEWIDTH = 2;         // this will divide the frame width by 2
   private static final int FOURTH_FRAMEWIDTH = 4;       // this will divide the frame width by 4
   private static final int TRIPLE_FRAMEWIDTH = 3;       // this will multiply the frame width by 3
   private static final int TURN_INTO_PERCENT = 100;     // this will multiply the decimal by 100 to display in percentage form %
   
   private static final Color HEAD_COLOR = new Color(255,0,0);           // red
   private static final Color TAIL_COLOR = new Color(0,0,255);           // green
   private static final Color HEAD_TAIL_COLOR = new Color(0,255,0);      // blue
   
   
   /**
      This is the constructor for CoinSimComponent since we're taking an input from a user;
      it initializes the private variable inputTrial, and it assigns the object toss to new CoinTossSimulator;
      this is also where we call the method, run(inputTrial), for the toss object;
      we put it in the constructor (and not a part of the paintComponent method) because we want to
      call the toss.run(inputTrial) method only once, and once the user gives the desired number of trials.
      
      @param trials  the number of trial desired by the user
   */  
   public CoinSimComponent(int trials) {
      inputTrial = trials;
      toss = new CoinTossSimulator();
      toss.run(inputTrial); 
   }

   
   public void paintComponent(Graphics g)
   {
   
      Graphics2D g2 = (Graphics2D) g;
                                
      double scaleComponent = ( (getHeight() - TOTAL_VERT_BUFFER) )/( (double)(toss.getNumTrials()) );  
      // ^ made toss.getNumTrials() of type double 
      // ^ scaleComponent depends on height of frame, total vertical bufferspace (100), and total number of trials
      
      int bottomComponent = getHeight() - BOTTOM_VERT_BUFFER;
      // ^ bottomComponent is determined by the frame height (depending on resizing of frame) minus the bottom vertical buffer
      
      
      Bar bar1 = new Bar(bottomComponent, (int)( getWidth()/FOURTH_FRAMEWIDTH - BAR_WIDTH/HALF_BARWIDTH ), BAR_WIDTH, toss.getTwoHeads(), scaleComponent, HEAD_COLOR,
                        "Two Heads: " + toss.getTwoHeads() + " " + "(" + (int)(TURN_INTO_PERCENT*(toss.getTwoHeads()/(double)toss.getNumTrials())) + "%)");
      
      Bar bar2 = new Bar(bottomComponent, (int)( getWidth()/HALF_FRAMEWIDTH - BAR_WIDTH/HALF_BARWIDTH ), BAR_WIDTH, toss.getHeadTails(), scaleComponent, HEAD_TAIL_COLOR,
                        "A Head and a Tail: " + toss.getHeadTails() + " " + "(" + 
                        (int)(TURN_INTO_PERCENT*(toss.getHeadTails()/(double)toss.getNumTrials())) + "%)");
     
      Bar bar3 = new Bar(bottomComponent, (int)( (TRIPLE_FRAMEWIDTH*getWidth())/FOURTH_FRAMEWIDTH - BAR_WIDTH/HALF_BARWIDTH ), BAR_WIDTH, toss.getTwoTails(), scaleComponent, TAIL_COLOR,
                        "Two Tails: " + toss.getTwoTails() + " " + "(" + (int)(TURN_INTO_PERCENT*(toss.getTwoTails()/(double)toss.getNumTrials())) + "%)");
      
      // Bar(int bottom, int left, int width, int applicationHeight, double scale, Color color, String label)
      /* 
         For all three declarations of Bar objects, the variable left (left location of the bar) 
         depends on a fraction of the frame width and half of the bar width.  
         Moreover, the parameter 'label' involves displaying the percent so 100 is multiplied to convert.
      */
                          
      bar1.draw(g2);
      bar2.draw(g2);
      bar3.draw(g2);
   }

}