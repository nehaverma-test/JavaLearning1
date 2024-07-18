package testing2.com;

public class BreakExample {
    public static void main(String[] args) {
        for(int i =0;i<5;i++)
        {
            if(i==3)
                break;
            System.out.println(i);
        }
        //When i = 3 , control gets transferred to immediate statement after the loop
        System.out.println("After loop");

    }

}
