/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Student{
    int age;
    String name;
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Main
{
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		for(int i = 0; i < 11; i++)
		    System.out.println(x + " x " + i + " = " + x*i);
		System.out.println(" ");
		Student ob = new Student();
		ob.setName("Snehal");
		ob.setAge(21);
		System.out.println(ob.getName());
		System.out.println(ob.getAge());
	}
}

