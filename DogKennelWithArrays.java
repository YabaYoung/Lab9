// Author: JiaYang Wu 
// Date: 12/10/2021
// File: DogKennelWithArrays.java
// Description: A program that uses the Dog class to create dogs, then assign and print the attributes of the dogs

// Had to rename the file DogKennelWithArrays instead of DogKennel so I can save in lab 9 folder

import java.util.Random;

public class DogKennelWithArrays {
   // Main method 
   public static void main(String[] args) {
      
      // Create new arrays of dog instances
      Dog[] dogs = new Dog[3];
      
      // Create new random
      Random random = new Random();
      
      // Create variables to hold attributes of the dogs and initialize them to 0
      double sumOfHeights = 0;
      int sumOfAges = 0;
      int numDogLikeBarking = 0;
      
      for (int i = 0; i < 3; i++) {
         // Loop through all the index in the dogs array and add a dog instance in each index
         dogs[i] = new Dog();
         
         // Set the height of the dogs to a double between 8-38
         dogs[i].setHeight(8 + random.nextInt(30) + random.nextDouble()); // random.nextDouble() only generate number from 0-1, this will turn the height into a double
         
         // Set the age of the dogs to int between 1-15, it is 1 + because we cannot have a age 0 dog
         dogs[i].setAge(1 + random.nextInt(15));
         
         // Set the dogs name, reason it is (i + 1) is because we do not want Dog0, so adding 1 to the index makes avoids that and will be Dog1 instead.\
         dogs[i].setName("Dog" + (i + 1));
         
         // Set the dogs likes barking to true or false for each dog
         dogs[i].setLikesBarking(random.nextBoolean());
         
         // Get the sum of the dogs' age
         sumOfAges+= dogs[i].getAge();
         // Get the sum of the dogs' height
         sumOfHeights+= dogs[i].getHeight();       
         // See if the dogs like to bark or not, if likes to bark is true than increment numDogLikeBarking by 1
         if (dogs[i].getLikesBarking()) {
            ++numDogLikeBarking;
         }
      } 
                 
      // Message to welcome the user
      System.out.println("Welcome to the dog kennel!");
      // Get the sum of the dogs' age and print it to the console 
      System.out.println("The sum of the dogs' ages is " + sumOfAges); 
      // Print sum of the dogs' height
      System.out.println("The sum of the dogs' heights is " + sumOfHeights);
      // Get the names of the dogs and print them to the console
      System.out.println("The dogs are: " + dogs[0].getName() + ", " + dogs[1].getName() + ", " + dogs[2].getName());
      // Get the number of dogs that likes to bark
      System.out.println(numDogLikeBarking + " dogs like barking");
   }
}      
