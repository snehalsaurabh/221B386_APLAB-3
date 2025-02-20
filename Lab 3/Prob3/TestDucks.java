public class TestDucks {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println();

        woodenDuck.display();
        woodenDuck.swim();
        woodenDuck.performFly();
        woodenDuck.performQuack();

        System.out.println();

        redHeadDuck.display();
        redHeadDuck.swim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println();

        lakeDuck.display();
        lakeDuck.swim();
        lakeDuck.performFly();
        lakeDuck.performQuack();
    }
}
