package Inheritance;

public class Code {
    public static void main(String args[])
    {
        Animal animal = new Animal("Shadow", 9);
        Cat cat = new Cat("Pixie", 2, "white");
        Dog dog = new Dog("Brutus", 10, "German Shepherd");
        //Note: These labels are generated by VS Code and aren't actually present or to be written

        animal.display();
        cat.display();
        dog.display();
        cat.changeAge(3);
        cat.display();
        dog.changeName("Fireblaze");
        dog.changeAge(5);
        dog.display();
        animal.changeName("Wolf");
        animal.display();
        animal.name = "Oof"; //Protected members are accessible by any file from the same package!
        animal.display();
        Animal.showCount();
        //animal.showCount(); -> Once again, not a static way of accessing
    }
}