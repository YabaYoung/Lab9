// Author: JiaYang Wu 
// Date: 12/10/2021
// File: StockMarket.java
// Description: Program that runs a simulation about the stock market. Asking the user how many money to bet for the traderrs.
// All traders have a RNG rate and a success rate, however, all of them has a base of 1000 dolars

// *Input that break code*
// Strings and characters that aren's numbers, also symbols

// Had to rename the file so I can save in my lab9 folder

import java.util.Scanner;

// A "casino" class
public class StockMarketWithArrays {

   public static void main(String Args[]) {

      // Create an array of traders 
      Trader[] traders = new Trader[4];
        
      // Create a type double array to store the stock change percentages of each trader
      double[] stockChangePercentage = {0.61, 0.19, 0.81, 0.42};
        

      for (int i = 0; i < 4; i++) {
         // Filling up the indexes of traders array, we add one to index to prevent it creating trader0, we want it to start at 1 not 0 (when i = 0, add 1 to it, it will be 1 instead)
         traders[i] = new Trader("Trader" + (i + 1));
         
         // Set stock change percentage for each trader/player with the values in the double array called stockChangePercentage
         traders[i].setStockChangePercentage(stockChangePercentage[i]);
         
         // Print each trader's name and the assigned stockChangePercentage
         System.out.println("Name: " + traders[i].getTraderName() + "\nStock Change Percentage: " + traders[i].getStockChangePercentage() + "\n");
      }
      
      // Create new Scanner
      Scanner keyboard = new Scanner(System.in);
      
      // Declare variable, of type double that will be used inside the while loop
      double dollarsSpend;
            
      // An infinite while loop that will only end if dollarsSpend equal to 0
      while (true) {
          
         for (Trader trader : traders) {         
            // Print out to the console the trader's name, money spent, current balance, and net profit
            System.out.println("Name: " + trader.getTraderName() + "\nMoney Spent: " + trader.getDollarsSpent() + "\nCurrent Balance: " + trader.getDollarsMade() + "\nNet profit: " + trader.getNetProfit() + "\n");
         }
         
         // Ask user for input of how much money they will put in and bet, this then will be stored in the declared variable dollarsSpend
         System.out.println("How much money will you put in? ");
         dollarsSpend = keyboard.nextDouble();
         
         // If conditional statement that terminate the while loop if the input is equal to 0, bascially betting 0 dollars
         if (dollarsSpend == 0) {
            break;
         }
         
         // If amount does not equal to 0 then it will bet the money that was stored in dollarsSpend
         else {
            for (Trader trader : traders)
            trader.tradeSomeMore(dollarsSpend);
         }
      }
   }
}