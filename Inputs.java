import java.util.Scanner;

public class Inputs {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int val = scan.nextInt();
        boolean truth = scan.nextBoolean();
        double dec = scan.nextDouble();
        System.out.println(word);
        System.out.println(val);
        System.out.println(truth);
        System.out.println(dec);

        /*
         * Cool, we can get different datatype inputs differently
         * Or we can get everything as a string and convert:
         */

        String temp;
        temp = scan.next();
        val = Integer.parseInt(temp);
        temp = scan.next();
        truth = Boolean.parseBoolean(temp);
        temp = scan.next();
        dec = Double.parseDouble(temp);
        System.out.println(val);
        System.out.println(truth);
        System.out.println(dec);
        scan.close();
    }
}
