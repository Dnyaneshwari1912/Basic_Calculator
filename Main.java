// Parent class
package intern;
class Animal {
    // Method that will be overridden
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class Dog (inherits Animal)
class Dog extends Animal {
    // Overriding sound method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

// Child class Cat (inherits Animal)
class Cat extends Animal {
    // Overriding sound method
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent class reference
        Animal a;

        // Dog object
        a = new Dog();
        a.sound(); // Calls Dog's overridden method

        // Cat object
        a = new Cat();
        a.sound(); // Calls Cat's overridden method

        // Direct parent class object
        a = new Animal();
        a.sound(); // Calls Animal's original method
    }
}
