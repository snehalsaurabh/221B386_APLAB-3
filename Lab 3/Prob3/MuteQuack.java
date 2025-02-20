// // Interface QuackBehavior
// public interface QuackBehavior {
//     void quack();
// }

// Class MuteQuack
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}