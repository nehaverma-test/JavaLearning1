package testing.com;

public class StringBufferInsertMethod {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append("Test");
        sb.append(30.50);

        System.out.println(sb.toString());
        //Replace method will take 3 parameters
        //Start, end and new string
        //End position will be End-1
        sb.replace(0,2,"@@");
        System.out.println(sb.toString());


    }
}

