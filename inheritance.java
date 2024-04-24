// Parent class (Superclass)
class Animal {
    // Method in the superclass
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    // Method overridden in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Additional method specific to Dog class
    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the superclass
        Animal animal = new Animal();
        // Call method of the superclass
        animal.sound();

        // Create an object of the subclass
        Dog dog = new Dog();
        // Call method of the subclass
        dog.sound();
        // Call method specific to Dog class
        dog.wagTail();
    }
}
