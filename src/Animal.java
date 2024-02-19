public class Animal {
    protected String name;
    protected int age;
    protected String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "Woof");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "Meow");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age, "Chirp");
    }
}
