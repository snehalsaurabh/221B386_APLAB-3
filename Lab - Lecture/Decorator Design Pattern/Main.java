/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Offering offering1 = new Coffee();
		offering1 = new Rum(offering1);
		offering1 = new Icecream(offering1);
		offering1 = new Gin(offering1);
		System.out.println(offering1.getName() + " has a price of " + offering1.getPrice());
		Offering offering2 = new Tea();
		offering2 = new Rum(offering2);
		System.out.println(offering2.getName() + " has a price of " + offering2.getPrice());
	}
}
