package testing.com;

public class StringBufferMethods
{
    public static void main(String args[])
    {
        //Insert Method -> Inserting value at a given position
        StringBuffer sbf1 = new StringBuffer("Hello World");
        sbf1.insert(1,90);
        System.out.println(sbf1.toString());

        sbf1.insert(6,'&');
        System.out.println(sbf1.toString());


        //Reverse method -

        StringBuffer sbf2 = new StringBuffer("Hello Test World");
        System.out.println(sbf2.reverse().toString());

        //Delete method
        //The delete() method of the StringBuffer class deletes the string
        // from the specified beginIndex to endIndex-1.
        StringBuffer sbf3 = new StringBuffer("Hello Test");
        sbf3.delete(3,5);
        System.out.println(sbf3.toString());


    }
}
