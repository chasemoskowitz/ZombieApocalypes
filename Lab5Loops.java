//Chase Moskowitz
package com.mycompany.lab5loops;

import java.util.Scanner;

public class Lab5Loops 
{

    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      //initialize variables
      int initialZombies=0;
      long newZombies=0;
      long runningTotal=0;
      double growthRate=0;
      int runTime=0;
      int days=0;
      
      //get user input
      System.out.print("Enter starting zombie population: ");
      initialZombies=input.nextInt();
   
      System.out.print("Enter zombie growth rate % (Example 2.5): ");
      growthRate=input.nextDouble();  
      
      System.out.print("Enter number of days for predictor to run: ");
      runTime=input.nextInt();
      
      System.out.printf("\nStarting with %d zombies and growing at %.1f%%",
              initialZombies, growthRate);
      
      runningTotal=initialZombies;
      
      //set up table
     System.out.printf("\n\n%5s %15s %15s\n","", "New",
              "Total");
      System.out.printf("%5s %15s %15s\n","Day", "Zombies",
              "Zombies");
      System.out.printf("%5s %15s %15s\n","=====", "===============",
              "==============");
     
      //calculate zombies per day
      for (days=1; runTime>=days; days++){
          
      newZombies=(long)(runningTotal*growthRate/100);
      
      runningTotal=newZombies + runningTotal;
   
      System.out.printf("%,5d %,15d %,15d\n",days,newZombies, runningTotal );
      
      if (runTime==days)
          System.out.printf("\nAfter %d days, the zombie"
                  + " population will grow from"
               + " %d to %,d", days, initialZombies, runningTotal);
    }
      
     
    }
}
