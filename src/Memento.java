public class Memento {
   private AdvancedIceCreamCone state;

   public Memento(AdvancedIceCreamCone state) {
      this.state = state;
   }

   public AdvancedIceCreamCone getState() {
      return state;
   }
}
