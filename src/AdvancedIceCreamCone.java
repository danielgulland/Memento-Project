/* Daniel Gulland & John Bui
   April 18, 2019
   Purpose: the advanced ice cream cone class
   Inputs: n/a
   Outputs: n/a
 */
/* This class is used to model the properties and behaviors of an ice cream cone.
   There are currently restriction on the construction of the cone: only one
   flavor of ice cream is allowed. */
import java.util.*;
public class AdvancedIceCreamCone {
   private int numberOfScoops;
   private String flavor;
   private String typeOfCone;
   private ArrayList<String> toppings = new ArrayList<String>();


   /**
    * default constructor
    */
   //the default constructor creates a one scoop, vanilla ice cream cone using the regular type of cone and no toppings
   public AdvancedIceCreamCone() {
      numberOfScoops=1;
      flavor="vanilla";
      typeOfCone="regular";
   }

   /**
    * constructor that initializes all fields
    *
    * @param ns number of scoops
    * @param flv flavor
    * @param cone cone
    */
   /*this constructor lets you create an ice cream code to your liking. It takes in three parameters:
     the number of scoops, the flavor of the ice cream and the type of cone */
   public AdvancedIceCreamCone(int ns,String flv,String cone) {
      numberOfScoops=ns;
      flavor=flv;
      typeOfCone=cone;
   }

   /**
    * gets number of scoops
    *
    * @return number of scoops
    */
   //this method returns the number of scoops in the cone
   public int getNumberOfScoops () {
      return numberOfScoops;
   }

   /**
    * gets flavor
    *
    * @return flavor
    */
   //this method returns the ice cream flavor
   public String getFlavor() {
      return flavor;
   }

   /**
    * gets type of cone
    *
    * @return type of cone
    */
   //this method returns the type of cone
   public String getTypeOfCone() {
      return typeOfCone;
   }

   /**
    * adds 1 scoop
    */
   //this method allows you to add one scoop of ice cream at a time
   public void addScoop() {
      numberOfScoops=numberOfScoops+1;
   }

   /**
    * sets flavor
    * @param flv the new flavor
    */
   //this method allows you to change the ice cream flavor
   public void setFlavor(String flv) {
      flavor=flv;
   }

   /**
    * sets the type of cone
    *
    * @param cone the new cone
    */
   //this method allows you to change the type of cone
   public void setTypeOfCone(String cone) {
      typeOfCone=cone;
   }

   /**
    * adds toppings
    *
    * @param top the topping to be added
    */
   //this method allows you to add  toppings
   public void addToppings(String top) {
      toppings.add(top);
   }

   /**
    * gets all toppings
    *
    * @return the list of toppings
    */
   //this method returns a String with a list of the toppings
   public ArrayList<String> getToppings () {
      return toppings;
   }

   /**
    * string representation of an AdvancedIceCreamCone object
    *
    * @return string representation of an AdvancedIceCreamCone object
    */
   //this method overrides the inherited toString()
   public String toString() {
      return ("The number of scoops is " + numberOfScoops + ". The flavor is " +
            flavor + ". And the type of cone is " + typeOfCone + " and the toppings are: " + getToppings());
   }

}