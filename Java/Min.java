public class Min { 
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();

        genericAnimal.makeSound(); // Output: Some generic animal sound
        dog.makeSound();           // Output: Bark
    }
}