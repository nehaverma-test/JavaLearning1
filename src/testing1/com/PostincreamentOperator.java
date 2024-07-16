package testing1.com;

public class PostincreamentOperator {
    public static void main(String[] args) {

        int a = 5;
        //Value of a will be printed and then it is incremented
        System.out.println(a++);
        //Updated value of a is printed
        System.out.println(a);

        //Value of expression a++ -> 6
        a = a++ + 3;
        System.out.println(a);
    }
}
