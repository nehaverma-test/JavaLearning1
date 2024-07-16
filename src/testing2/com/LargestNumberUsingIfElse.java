package testing2.com;

public class LargestNumberUsingIfElse {

    public static void main(String[] args) {

        int a = 60,b=160,c =40;
        int largest ;

        if(a>=b && a>=c)
            largest = a;
        else if(b>=a && b>=c)
            largest = b;
        else
            largest = c;

        System.out.println("Largest Number is "+largest);
    }

}
