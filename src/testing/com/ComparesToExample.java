package testing.com;

public class ComparesToExample {
    public static void main(String[] args) {

        String s1 = "bat";
        String s2 = "cat";

        //Unicode value of b is 98,
        //Value for c is 99
        //compareTo function will give -ve result as 97 is less than 98
        int value = s1.compareTo(s2);
        System.out.println(value);

        //Unicode value of T is 84 and For t value is 116
        //Output will be -32
        String s3 = "TEST";
        String s4 = "test";
        System.out.println(s3.compareTo(s4));

    }
}
