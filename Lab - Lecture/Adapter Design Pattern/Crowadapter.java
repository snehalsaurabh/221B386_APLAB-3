public class Crowadapter implements Swan {
    private Crow crow;
    public Crowadapter(Crow crow) {
        this.crow = crow;
    }
    @Override
    public void swim() {
        crow.fly();
    }
    @Override
    public void sing() {
       crow.cry();
    }
    @Override
    public void eat() {
        crow.eat();
    }
}