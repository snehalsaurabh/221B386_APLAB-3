class Voice2 {
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

    void templateMethod() {
        prepareVoice();
        hear();
    }
}

public class Test2 {
    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();
        voice2.templateMethod();
    }
}