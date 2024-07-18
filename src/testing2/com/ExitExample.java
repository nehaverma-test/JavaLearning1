package testing2.com;

public class ExitExample {
    public static void main(String[] args) {

        for(int i =0;i<=5;i++)
        {
            if(i==3)
                System.exit(0);
                System.out.println(i);}

        //When i = 3, as exit statement is encountered,
        //JVM stops running and hence below statements would not be executed.
        System.out.println("A");
        System.out.println("B");
    }
}
