public class Originator {
   private AdvancedIceCreamCone state;

   public void setState(AdvancedIceCreamCone state) {
      this.state = state;
   }

   public AdvancedIceCreamCone getState() {
      return state;
   }

   public Memento saveStateToMemento() {
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento) {
      state = memento.getState();
   }
}