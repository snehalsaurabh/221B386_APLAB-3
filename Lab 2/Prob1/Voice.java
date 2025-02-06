/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Voice {
    private Animal[] animals = new Animal[5];

    public void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public void hear() {
        for (Animal animal : animals) {
            System.out.println(animal.makeVoice());
        }
    }
}

abstract class Animal {
    public abstract String makeVoice();
}

class Cow extends Animal {
    @Override
    public String makeVoice() {
        return "Moo";
    }
}

class Dog extends Animal {
    @Override
    public String makeVoice() {
        return "Bark";
    }
}

class Pig extends Animal {
    @Override
    public String makeVoice() {
        return "Oink";
    }
}

class Goat extends Animal {
    @Override
    public String makeVoice() {
        return "Bleat";
    }
}

class Lion extends Animal {
    @Override
    public String makeVoice() {
        return "Roar";
    }
}
