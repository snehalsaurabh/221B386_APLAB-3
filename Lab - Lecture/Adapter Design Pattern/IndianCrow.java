public class IndianCrow implements Crow {
    @Override
    public void fly() {
        System.out.println("Flying high over the mountains");
    }

    @Override
    public void cry() {
        System.out.println("Cawling");
    }

    @Override
    public void eat() {
        System.out.println("Eating pearls");
    }
}