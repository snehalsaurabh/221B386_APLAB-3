// Snehal Saurabh - Notes from the lecture - AP3

abstract class Beverage{
    private void pour(int qty){
        System.out.println("Pour " + qty + " ml of beverage in a glass.");
    }
    protected abstract void addCondiment();
    protected void stir(){};
    private void serve(){
        System.out.println("Serve the beverage.");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}

class Whiskey extends Beverage{
    protected void addCondiment(){
        System.out.println("Add some ice.");
    }
    protected void stir(){
        System.out.println("Stir for 30 seconds");
    }
}

class Beer extends Beverage{
    protected void addCondiment(){
        System.out.println("Nothing is to be added here.");
    }
}


public class Main
{
	public static void main(String[] args) {
		Beverage b = new Whiskey();
		b.templateMethod(30);
		b = new Beer();
		b.templateMethod(200);
	}
}