import java.util.Scanner;

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}

class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Birds love to eat seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("Birds sleep for 10-12 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cats love to eat fish.");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleep for 12-16 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs love to eat bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep for 8-10 hours a day.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

public class RunAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = scanner.nextLine();

        Animal animal;

        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        animal.eat();
        animal.sleep();
        animal.makeSound();

        scanner.close();
    }
}