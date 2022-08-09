import java.util.Scanner;

public class LineInput {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // String next_line = scan.next();
        String next_line = scan.nextLine();
        /*
         * Observe the difference
         */
        System.out.println(next_line);
        scan.close();
    }
}
