public class eximb extends Animal {
    public eximb(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("sound");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}
