// // Interface QuackBehavior
// public interface QuackBehavior {
//     void quack();
// }

// Class Quack
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}