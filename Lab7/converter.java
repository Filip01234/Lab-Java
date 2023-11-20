package Lab7;

import java.util.Locale;

public class converter {
    public static void main(String[] args)
    {
        String originalString = "hello world";

        String upperCaseString =
                originalString.toUpperCase();

        System.out.println("Original String: " + originalString);
        System.out.println("Uppercase String: " + upperCaseString);
    }
}
