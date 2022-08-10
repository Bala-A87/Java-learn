package Classes;
import java.util.Scanner;

//Note that every class needs to be defined in a separate file!

public class Code {
    public static void main(String args[])
    {
        String dog_name;
        int dog_age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dog's name: ");
        dog_name = sc.next();
        System.out.print("Enter the dog's age: ");
        dog_age = sc.nextInt();
        Dog doge = new Dog(dog_name, dog_age);
        doge.output();
        sc.close();
    }
}
