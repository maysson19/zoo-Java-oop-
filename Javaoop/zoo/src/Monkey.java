public class Monkey extends Animal{
    public Monkey(String name,int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("ooah ooah ooah");
    }
    @Override
    public void eat(){
        System.out.println("eating banana");
    }

}
