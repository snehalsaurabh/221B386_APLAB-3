public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        
        System.out.println("EagerSingleton instance created.");
    }
    public static EagerSingleton getInstance() {
        return instance;
    }
    public void display() {
        System.out.println("Eager Singleton instance is working!");
    }
}