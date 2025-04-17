public class Application {
    public static void main(String[] args) {
        Crow crow = new IndianCrow();
        Crowadapter crowAdapter = new Crowadapter(crow);
        client(crowAdapter);
    }
    public static void client(Swan swan) {
        swan.swim();
        swan.sing();
        swan.eat();
    }
}