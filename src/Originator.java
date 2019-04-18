/* Daniel Gulland & John Bui
   April 18, 2019
   Purpose: creates and stores states in memento objects
   Inputs: n/a
   Outputs: n/a
 */
public class Originator {
   private AdvancedIceCreamCone state;

   /**
    * initializes the originators state
    *
    * @param state current state
    */
   public void setState(AdvancedIceCreamCone state) {
      this.state = state;
   }

   /**
    * gets the state
    *
    * @return the state
    */
   public AdvancedIceCreamCone getState() {
      return state;
   }

   /**
    * saves this state to a memento object and returns it
    *
    * @return the new memento object
    */
   public Memento saveStateToMemento() {
      return new Memento(state);
   }

   /**
    * gets the state from a memento object
    *
    * @param memento the object we're getting the state from
    */
   public void getStateFromMemento(Memento memento) {
      state = memento.getState();
   }

   /**
    * string representation of an originator object
    *
    * @return string representation of an originator object
    */
   public String toString() {
      return "This is an Originator object.\n";
   }
}