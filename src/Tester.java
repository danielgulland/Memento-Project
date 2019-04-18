import java.util.Scanner;

public class Tester {
   public static void main(String[] args) {

      Originator originator = new Originator();
      Caretaker careTaker = new Caretaker();

      AdvancedIceCreamCone cone1 = new AdvancedIceCreamCone(1, "Vanilla", "regular");
      cone1.addToppings("Sprinkles");

      originator.setState(cone1);
      careTaker.add(originator.saveStateToMemento());

      AdvancedIceCreamCone cone2 = new AdvancedIceCreamCone(1, "Chocolate", "regular");

      cone2.addToppings("Fudge");
      originator.setState(cone2);
      careTaker.add(originator.saveStateToMemento());

      AdvancedIceCreamCone cone3 = new AdvancedIceCreamCone(2, "Strawberry", "regular");

      cone3.addToppings("Cookie Dough");
      originator.setState(cone3);
      careTaker.add(originator.saveStateToMemento());


      System.out.println("Which cone would you like?\n1)Vanilla\n2)Chocolate\n3)Strawberry");
      Scanner input = new Scanner(System.in);
      originator.getStateFromMemento(careTaker.get(input.nextInt() - 1));
      System.out.println(originator.getState());


//      System.out.println("Current State: " + originator.getState());
//
//      originator.getStateFromMemento(careTaker.get(0));
//      System.out.println("First saved State: " + originator.getState());
//      originator.getStateFromMemento(careTaker.get(1));
//      System.out.println("Second saved State: " + originator.getState());
   }
}