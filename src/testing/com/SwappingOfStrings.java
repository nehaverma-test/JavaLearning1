package testing.com;

public class SwappingOfStrings {

    public static void main(String[] args) {

        String s1 = "Automation";
        String s2 = "Testing";

        //Combine Two strings
        String s3 = s1 + s2;

        s1 = s3.substring(10);
        System.out.println("After swapping first string -> "+s1);

        s2 = s3.substring(0,10);
        System.out.println("After swapping second string -> "+s2);
    }
}
