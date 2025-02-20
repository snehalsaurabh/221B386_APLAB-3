/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface Testable {
    void display();
}

class Test implements Testable{
    int x = 10; 
    public void display(){
        System.out.println("Value of x = " + x);
    }
}

public class Classic
{
	public static void main(String[] args) {
		Test ob = new Test();
		ob.display();
		AbsTest ob2 = new AbsTest();
		ob2.display();
	}
}
