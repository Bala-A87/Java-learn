package Classes;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void output()
    {
        System.out.println("I am " + name + " and I am " + age + " years old!");
    }
}
