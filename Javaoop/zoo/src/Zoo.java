import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal>animals;

    public Zoo(){
        animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }
    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void makeAnimalsMakeSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
