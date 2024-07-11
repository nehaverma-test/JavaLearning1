package testing.com;

public class TrimMethod {

    public static void main(String[] args) {

        String s1 = "       Testing      is important      ";


        //Trim method reduces space from front and end
        //Space in middle is not affected
        String s2 = s1.trim();
        System.out.println(s2);
    }
}
