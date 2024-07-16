package testing1.com;

public class PreincreamentOperator {

    public static void main(String[] args) {

        int b = 10;
        int c  = ++b;
        System.out.println(b);
        System.out.println(c);
        int x  = ++b + c++;
        //Value of expression ++b = 12 , value of c++ -> 11
        System.out.println(x);
    }
}
