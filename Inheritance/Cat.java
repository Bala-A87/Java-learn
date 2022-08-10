package Inheritance;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String color)
    {
        super(name, age); //Parent/Super class constructor needs to be explicitly called
        this.color = color;
    }

    public void display()
    {
        System.out.println("I am " + name + ", a " + color + "-colored cat and I am " + age + " years old!");
    }
}
