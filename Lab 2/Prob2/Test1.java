/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Animal {
    String name;
    String voice;

    Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    void makeVoice() {
        System.out.println(name + " says " + voice);
    }
}

class Voice {
    Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Animal("Cow", "Moo");
        animals[1] = new Animal("Dog", "Bark");
        animals[2] = new Animal("Pig", "Oink");
        animals[3] = new Animal("Goat", "Bleat");
        animals[4] = new Animal("Lion", "Roar");
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}


public class Test1 {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
        voice.hear();
    }
}

