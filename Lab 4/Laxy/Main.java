public class Main {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        singleton1.display();
        LazySingleton singleton2 = LazySingleton.getInstance();
        singleton2.display();
    }
}