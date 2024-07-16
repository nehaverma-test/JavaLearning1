package testing1.com;

public class NarrowingExample {
    public static void main(String[] args) {

        int a = 300;

        //This is invalid as byte range is 128 to 127
        //int range is -2147483648 to 2147483647
        //We cannot store bigger value in smaller one

        // Incorrect ->byte b  = a;
        //We need to type cast int to byte
        //Here we are narrowing while conversion from int to byte and there
        //is a loss of data
        //Binary value of 300 is 100101100 -> 1 byte  = 8 bits
        // byte value -> 00101100
        //Converting 00101100 to decimal -> 44

        byte b = (byte) a;
        System.out.println(b);

    }
}
