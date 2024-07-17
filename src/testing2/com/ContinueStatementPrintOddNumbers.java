package testing2.com;

public class ContinueStatementPrintOddNumbers
{
    public static void main(String[] args) {
        //If i is divisible by 2, loop is skipped and control goes to next iteration
         for(int i =1;i<=10;i++) {
             if(i%2==0) {
                 continue;
             }            System.out.println(i);
         }


    }
}
