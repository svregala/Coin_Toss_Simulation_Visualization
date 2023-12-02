// Name: Steve Regala
// USC NetID: sregala
// CS 455 PA1
// Fall 2021

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;


/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
*/
public class Bar {
   
   private int bottomLocation;
   private int leftLocation;
   private int barWidth;
   private int appHeight;
   private double pixPerApp;
   private Color barColor;
   private String barLabel;

   private static final int DIVIDE_CONSTANT = 2;
   
   
   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale).
  
      @param bottom  location of the bottom of the bar
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)
      @param applicationHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label under the bar
   */
   public Bar(int bottom, int left, int width, int applicationHeight, 
              double scale, Color color, String label) 
   {
      // Rectangle
      bottomLocation = bottom;
      leftLocation = left;
      barWidth = width;
      appHeight = applicationHeight;
      pixPerApp = scale;
      barColor = color;
      barLabel = label;
   }
   
   /**
      Draw the labeled bar.
      @param g2  the graphics context
   */
   public void draw(Graphics2D g2) {
      
      Rectangle box = new Rectangle(leftLocation, bottomLocation - (int)(appHeight*pixPerApp), 
                                    barWidth, (int)(appHeight*pixPerApp));
      /* 
         * leftLocation is the x-coordinate of the top left-corner
         * bottomLocation - (int)(appHeight*pixPerApp) is y-coordinate of the top left-corner
         * barWidth is the width of the rectangle
         * (int)(appHeight*pixPerApp) is the height of the rectangle
      */
      
      Font font = g2.getFont();
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D labelBounds = font.getStringBounds(barLabel, context);
      int widthOfLabel = (int) labelBounds.getWidth();
      int heightOfLabel = (int) labelBounds.getHeight();
      
      g2.setColor(Color.black);
      // ^^this is to set color of the font before setting the color of bar
      
      g2.drawString(barLabel, (leftLocation + (barWidth/DIVIDE_CONSTANT)) - (widthOfLabel/DIVIDE_CONSTANT), bottomLocation + heightOfLabel);
      //^^drawString(label, x coordinate of top left corner of label, y coordinate of bottom left corner of label)

      if (appHeight != 0) {
         g2.setColor(barColor);  // setting the color of the bar
         g2.fill(box);
         g2.draw(box);
      }
      // This if-statement is to account for the lines that form when the number of trials in a denomination is zero

   }
}
