public class Datatypes {
    public static void main(String args[])
    {
        int x = 23;
        double y = 18.4;
        char c = '&';
        boolean b = true;
        String s = "Hello there";
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);

        //int emptyval;
        //System.out.println(emptyval);
        /*
         * Error: Uninitialized variable being used, essentially
         */

        double val = Math.pow(x, 3);
        System.out.println(val);

        /*
         * All 6 relational operators are valid for int, double, etc
         * but only == & != are valid for Strings
         * Preferably use s.equals(s_) for comparison
         */
    }
}
