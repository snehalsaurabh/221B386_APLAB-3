public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.display();
    }
}