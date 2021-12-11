// Author: JiaYang Wu 
// Date: 11/28/2021
// File: Trader.java
// Description: This is a trader class that will trade money based off the amount in dollars given, which it will give the analystics about all the traders

// Import the Random class
import java.util.Random;

// A Class that defines an object of type Trader
public class Trader {

   // Create 4 fields that will store the properties of the traders
   private String traderName; // traderName, of type String
   private double stockChangePercentage; // stockChangePercentage, of type double
   private double dollarsSpent; // dollarsSpent, of type double
   private double dollarsMade; // dollarsMade, of type double
   
   // Getter method that will return the stock change percentage from the field: stockChangePercentage
   public double getStockChangePercentage() {
      return stockChangePercentage;
   }
      
   // Setter method that will assign the private field stockChangePercentage to percentage 
   public void setStockChangePercentage(double percentage) {
      stockChangePercentage = percentage;
   }
      
   // Method that will output if the traders won or lost money as well as how much they won or lost
   public void tradeSomeMore(double dollars) {
            
      // Add dollarsSpent to the amount of money all the traders bet
      dollarsSpent += dollars;
      
      // Create a Random double 
      Random randomNumbers = new Random();
      double randomDouble = randomNumbers.nextDouble();
      
      // This is a conditional statement that will decide whether the trader make or lose money
      // If the generated randomDouble is smaller than the trader's stockChangePercentage then the trader will make money
      if (randomDouble < stockChangePercentage) {
         System.out.println(traderName + " made");
         dollarsMade += (dollars*2);
      }
      
      // If the generated randomDouble is larger than or equal to the trader's stockChangePercentage then the trader will lose money
      else {
         System.out.println(traderName + " lost");
         dollarsMade -= (dollars*3);
      }
      
   }
          
   // Getter method that will return traderName     
   public String getTraderName() {
     return traderName;
   }
    
   // Getter method that will return dollarsSpent
   public double getDollarsSpent() {
     return dollarsSpent;
   }
    
   // Getter method that will return dollarsMade
   public double getDollarsMade() {
     return dollarsMade;
   }
    
   // Method that will return the trader's net profit 
   public double getNetProfit() {
     return (dollarsMade - dollarsSpent);
   }
   
   // Non-default constructor that sets the default value for each of the private fields  
   public Trader(String name) {
        traderName = name;
        dollarsMade = 1000;
        dollarsSpent = 0;
   }
}
