package Practice;

class Animal {
    public void animalSound() { // Added parentheses to define the method properly
        System.out.println("animal sound is ok");
    }
}

class Dog extends Animal {
   
    public void animalSound() { // Added parentheses to define the method properly
        super.animalSound(); // Calls the parent class's method
        System.out.println("dog says bow bow");
    }
}

public class Main { // Class names should be capitalized
    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalSound(); // Calls the method from the Dog class
    }
}
