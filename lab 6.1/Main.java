class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    @Override
    void makeSound() {
        System.out.println("Dog makes a sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // ✅ Upcasting
        a.makeSound();         // Calls overridden method in Dog class
        // a.bark(); ❌ Not allowed - only Animal methods accessible

        Dog d = (Dog) a; // 👈 Downcasting
        d.bark();        // ✅ Now you can access Dog's method
    }
}
