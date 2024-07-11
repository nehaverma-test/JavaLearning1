package testing.com;

public class replaceMethod
{
    public static void main(String arg[])
    {
        String s1 = "Testing";
        String s2 = s1.replace('e','@');
        System.out.println(s2);

        //character is present at more than one place
        //All characters will be replaced
        String s3 = "Testing is important";
        String s4 = s3.replace('i','@');
        System.out.println(s4);

        String a = "Test Test Test";
        //This is invalid ->   a = a.replace('Te','@@');


    }
}
