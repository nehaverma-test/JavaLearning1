package testing2.com;

import java.util.Scanner;

public class CurrencyConcersionUsingSwitch {

    public static void main(String[] args) {

        System.out.println("Enter currency value");
        Scanner sc = new Scanner(System.in);
        String currency =  sc.next();
        int indianValue = 100;
        float convertedValue;

        switch(currency)
        {
            case "USD":
                convertedValue =  0.01197f * indianValue;
                System.out.println(convertedValue);
                break;
            case "UAE":
                convertedValue =   0.0439f * indianValue;
                System.out.println(convertedValue);
                break;

            case "CAD":
                 convertedValue =  0.0164f * indianValue;
                 System.out.println(convertedValue);
                 break;

            default : System.out.println("Invalid currency entered. Try again");
        }


    }
}
