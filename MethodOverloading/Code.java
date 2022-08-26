//package MethodOverloading;

public class Code {
    public static void main(String args[])
    {
        Student ravi = new Student("Ravi");
        Student john = new Student("John");
        Student rohan = new Student("Rohan");
        System.out.println(rohan); //toString called implicitly
        System.out.println(ravi + " " + john);
        System.out.println(ravi.compareTo(john) > 0);
        System.out.println(rohan.compareTo(ravi));
    }
}
