package MethodOverloading;

public class Student implements Comparable<Student>{
    //We must implement comparison this way
    private String name;

    public Student(String name)
    {
        this.name = name;
    }

    public int compareTo(Student other) //Defining a measure of difference between objects of the class
    {
        return this.name.compareTo(other.name); //Using String's default comparison
    }

    public String toString() //Called by default when an object is expected to behave as a string
    {
        return name;
    }
    
}
