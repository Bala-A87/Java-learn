public class Arrays {
    public static void main(String args[])
    {
        int arr[] = new int[5];
        //Alternate declaration: int arr[] = {23, 42, 0, 0, 0};
        arr[0] = 23;
        arr[1] = 42;
        arr[2] = 0; //unitialized is set to 0
        for(int i = 0; i < 5; i++)
            System.out.println("arr[" + i + "]: " + arr[i]);
        
        String s[] = new String[3];
        s[0] = "hello";
        s[1] = "world"; //s[2] is set to null (unitialized => null)
        for(int i = 0; i < s.length; i++) //Size of array: .length
            System.out.println(s[i]);
        //Equivalently,
        for(String str : s)
            System.out.println(str);
    }
}
