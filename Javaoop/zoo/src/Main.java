public class Main {
        public static void main(String[] args){
            Zoo zoo = new Zoo();

            Lion lion = new Lion("sooooo", 10);
            Monkey monkey = new Monkey("booooooo", 8);

            zoo.addAnimal(lion);
            zoo.addAnimal(monkey);

            zoo.feedAnimals();
            zoo.makeAnimalsMakeSound();

            zoo.removeAnimal(lion);

            zoo.feedAnimals();
            zoo.makeAnimalsMakeSound();
        }
    }
