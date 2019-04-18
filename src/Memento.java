/* Daniel Gulland & John Bui
   April 18, 2019
   Purpose: keeps track of our state to be restored
   Inputs: n/a
   Outputs: n/a
 */
public class Memento {
   private AdvancedIceCreamCone state;

   /**
    * constructor
    *
    * @param state object that we assign the Memento AdvancedIceCreamCone to
    */
   public Memento(AdvancedIceCreamCone state) {
      this.state = state;
   }

   /**
    * gets state
    *
    * @return the state
    */
   public AdvancedIceCreamCone getState() {
      return state;
   }

   /**
    * string representation of a memento object
    *
    * @return string representation of a memento object
    */
   public String toString() {
      return "This is a Memento object.\n";
   }
}
