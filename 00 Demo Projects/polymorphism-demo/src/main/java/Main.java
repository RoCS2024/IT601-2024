import com.polymorphism.demo.animal.Animal;
import com.polymorphism.demo.animal.bird.Bird;
import com.polymorphism.demo.animal.cat.Cat;
import com.polymorphism.demo.animal.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        List<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(dog);
        animals.add(cat);

        for(Animal a: animals) {
            a.eat();
            a.move();
        }
    }
}
