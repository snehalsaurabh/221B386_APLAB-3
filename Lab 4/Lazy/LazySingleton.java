public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() {
       
        System.out.println("LazySingleton instance created.");
    }
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    public void display() {
        System.out.println("Lazy Singleton instance is working!");
    }
}