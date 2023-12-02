// Name: Steve Regala
// USC NetID: sregala
// CS 455 PA1
// Fall 2021

/*
   - This program will test CoinTossSimulator class indepently from its use in the CoinSimViewer program
   - It will have its own main method
*/

public class CoinTossSimulatorTester
{
   public static void main(String[] args)
   {
      
      CoinTossSimulator Test = new CoinTossSimulator();
      
      // TESTING THE CONSTRUCTOR ----------------------
      System.out.println("After constructor:");
      System.out.println("Number of trials [exp:0]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(1) ----------------------
      Test.run(1);
      System.out.println("After run(1):");
      System.out.println("Number of trials [exp:1]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(10) ----------------------
      Test.run(10);
      System.out.println("After run(10):");
      System.out.println("Number of trials [exp:11]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(100) ----------------------
      Test.run(100);
      System.out.println("After run(100):");
      System.out.println("Number of trials [exp:111]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();      
      
      
      // TESTING AFTER run(300) ----------------------
      Test.run(300);
      System.out.println("After run(300):");
      System.out.println("Number of trials [exp:411]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(500) ----------------------
      Test.run(500);
      System.out.println("After run(500):");
      System.out.println("Number of trials [exp:911]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      

      // TESTING AFTER run(1000) ----------------------
      Test.run(1000);
      System.out.println("After run(1000):");
      System.out.println("Number of trials [exp:1911]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(2000) ----------------------
      Test.run(2000);
      System.out.println("After run(2000):");
      System.out.println("Number of trials [exp:3911]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      

      System.out.println("-----------------------------------------------------------------------------");
      
      
      // TESTING AFTER RESET ----------------------
      Test.reset();
      System.out.println("After reset:");
      System.out.println("Number of trials [exp:0]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(50) ----------------------
      Test.run(50);
      System.out.println("After run(50):");
      System.out.println("Number of trials [exp:50]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(100) ----------------------
      Test.run(100);
      System.out.println("After run(100):");
      System.out.println("Number of trials [exp:150]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(500) ----------------------
      Test.run(500);
      System.out.println("After run(500):");
      System.out.println("Number of trials [exp:650]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(1000) ----------------------
      Test.run(1000);
      System.out.println("After run(1000):");
      System.out.println("Number of trials [exp:1650]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(2000) ----------------------
      Test.run(2000);
      System.out.println("After run(2000):");
      System.out.println("Number of trials [exp:3650]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(3000) ----------------------
      Test.run(3000);
      System.out.println("After run(3000):");
      System.out.println("Number of trials [exp:6650]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
      
      // TESTING AFTER run(5000) ----------------------
      Test.run(5000);
      System.out.println("After run(5000):");
      System.out.println("Number of trials [exp:11650]: " + Test.getNumTrials());
      System.out.println("Two-head tosses: " + Test.getTwoHeads());
      System.out.println("Two-tail tosses: " + Test.getTwoTails());
      System.out.println("One-head one-tail tosses: " + Test.getHeadTails());
      System.out.print("Tosses add up correctly? ");
      
      if (Test.getNumTrials() == (Test.getTwoHeads() + Test.getTwoTails() + Test.getHeadTails())) {
         System.out.println("true");
      } else {
         System.out.println("false");
      }
      System.out.println();
      
   }
}