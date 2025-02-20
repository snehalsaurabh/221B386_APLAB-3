// // Interface FlyBehavior
// public interface FlyBehavior {
//     void fly();
// }

// Class FlyWithWings
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!");
    }
}