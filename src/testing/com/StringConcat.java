package testing.com;

public class StringConcat {

public static void main(String[] args) {


    //Concat method takes only one argument

    String s1 = "Test";
    String s2 = "World";
    String s3 = s1.concat(s2 + "Hello"); //This is valid
    System.out.println(s3);

    String s4 = "Java".concat("Selenium");
    System.out.println(s4);

    String s6 = "Automation";
  //This is invalid  String s7 = s6.concat(s1,s3);

    // + Method can take any number of strings
    String z = s1 + s2;
    System.out.println(z);

    String a = "Test";
    String b = "Auto";
    String c = a +b + " alpha" + " beta";// This is valid
    System.out.println(c);

    String d = "India" + 45 + 12 + "Country"; //This is valid
    System.out.println(d);
}
}
