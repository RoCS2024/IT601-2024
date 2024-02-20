import com.inheritance.demo.animal.Animal;
import com.inheritance.demo.animal.cat.Cat;
import com.inheritance.demo.animal.dog.Dog;

public class Main {

    public static void main(String[] args) {
        //Creating instance of a class
        Animal animal = new Animal(4);
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        //Testing base speak method
        animal.speak();

        //Overriding speak method
        dog1.speak();
        cat.speak();

        //Testing default toString Object method
        System.out.println("This is the default toString method of Animal class " + animal.toString());

        //Testing overridden toString method in Dog class
        System.out.println("This is the overridden toString method of Dog class " + dog1.toString());

        //Comparing two objects
        Dog dog2 = new Dog();
        System.out.println(dog1.equals(dog2));

        //Upcasting classes
        Animal anAnimal = new Dog();

        //Downcasting classes
        Animal anotherAnimal = new Animal(4);
        Dog anotherDog = (Dog) anotherAnimal;

    }

}
