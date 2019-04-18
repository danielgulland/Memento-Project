/* Daniel Gulland & John Bui
   April 18, 2019
   Purpose: restore object states
   Inputs: n/a
   Outputs: n/a
 */
import java.util.ArrayList;
import java.util.List;

public class Caretaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   /**
    * adds a memento to the list
    *
    * @param state memento state
    */
   public void add(Memento state) {
      mementoList.add(state);
   }

   /**
    * gets a memento at an index
    *
    * @param index index of arraylist
    * @return memento object
    */
   public Memento get(int index) {
      return mementoList.get(index);
   }

   /**
    * string representation of a caretaker object
    *
    * @return string representation of a caretaker object
    */
   public String toString() {
      return "This is a Caretaker object.\n";
   }
}
