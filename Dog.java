// Author: JiaYang Wu 
// Date: 12/1/2021
// File: Dog.java
// Description: This is a dog class that contains private field, setters, and getters. It sets the height, age, name, if it likes to 
// bark or not. Also, the getter method will return the input information stored in the private fields. 

public class Dog {
   
   // Instantiate four fields
   private double heightIn;
   private int ageYears;
   private String name;
   private boolean likesBarking;
   
   // Setter that takes in a double for dog height and sets the private field heightIn equal to the argument
   public void setHeight(double height) {
      heightIn = height;
   }
   
   // Setter that takes in a integer for dog age and set the field ageYears equal to the argument
   public void setAge(int age) {
      ageYears = age;
   }
   
   // Setter that sets the field name equal to the argument
   public void setName(String dogName) {
      name = dogName;
   }
   
   // Setter for the private field likesBarking, the argument coming in has to be a boolean
   public void setLikesBarking(boolean barking) {
      likesBarking = barking;
   }
   
   // Getter for the heightIn field, return the height of the dog
   public double getHeight() {
      return heightIn;
   }
   
   // Getter for the ageYears field, returns the age of the dog
   public int getAge() {
      return ageYears;
   }
   
   // Getter for the name field, it returns the dog name
   public String getName() {
      return name;
   }
   
   // Getter for the likesBarking field, this will return true of false whether the dog likes to bark or not
   public boolean getLikesBarking() {
      return likesBarking;
   }
}