abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        System.out.println("Prafull kumar");
        System.out.println("MCA-C ");
        Animal myDog = new Dog();
        Dog n=(Dog)myDog;
        myDog.makeSound();
        myDog.eat();
    }
}