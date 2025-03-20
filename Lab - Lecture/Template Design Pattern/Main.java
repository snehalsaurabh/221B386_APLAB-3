// Snehal Saurabh - Notes from the lecture - AP3
public class Main
{
	public static void main(String[] args) {
		Beverage b = new Whiskey();
		b.templateMethod(30);
		b = new Beer();
		b.templateMethod(200);
	}
}