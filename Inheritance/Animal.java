package Inheritance;

public class Animal {
    protected String name; //private won't be accessible to child classes
    protected int age; //These are called instance variables, as values are specific to the instance
    //Static variables are called class variables as they are common to the class as a whole
    protected static int count = 0;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
        //this.count++; -> Wrong, not a "static" way of accessing (Would work, but not nice)
        //count++; -> Good!
        Animal.count++; //Also good!
    }

    public void display()
    {
        System.out.println("I am " + name + " and I am " + age + " years old!");
    }

    public void changeName(String name)
    {
        this.name = name;
    }

    public void changeAge(int age)
    {
        this.age = age;
    }

    public static void showCount()
    {
        System.out.println("There are " + count + " animals");
    }
}
