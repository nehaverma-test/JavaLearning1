package testing.com;

public class StringBufferAppendMethod {

    public static void main(String[] args) {

        StringBuffer sf = new StringBuffer();
        //Append method is used to concat the strings
        sf.append("aa");
        sf.append("bb");
        sf.append("cc");
        sf.append("dd");

        //toString method of StringBuffer class converts content of StringBuffer to a string
        //Then you can print that that String
        String res = sf.toString();
        System.out.println(res);

        //Appending int, float and char to already existing string store in
        //StringBuffer object
        sf.append(1);
        sf.append(2);
        sf.append('c');
        sf.append(44.5);
        System.out.println(sf.toString());

    }

    }

