import java.lang.reflect.Array;
import java.security.cert.CertPathValidatorException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //pg14 Review Java String documentation and mention 3 more functions that seem interesting
        //isEmpty() - Returns true if, and only if, length() is 0.
        //join(CharSequence delimiter, CharSequence... elements) - Returns a new String composed of copies of the CharSequence elements joined together with a copy of the specified delimiter.
        //repeat(int count) - Returns a string whose value is the concatenation of this string repeated count times.
        //pg15 Create four more string variables to implement the above mentioned special characters.
        String herString = "She said \"This is my string\"";
        System.out.println(herString);
        //The backslash itself  \\
        String string1 = "The value is: \"True\\False\"";
        System.out.println(string1);
        //The single quote \’
        String string2 = "The name of the company is Billy\'s Burger Joint";
        System.out.println(string2);
        //The newline character \n
        String string3 = "The way of life\nis to always\nput Jesus in your\neveryday prayer !";
        System.out.println(string3);
        //The tab character \t
        String string4 = "Come on\tmate! STEP\tUP";
        System.out.println(string4);
        System.out.println("_________________________________________________");
        //pg18 Create a list of floats and initialize it with the following values: 0.4, 0.56, 0.21, 0.9
        //How to print a list of strings?
        double[] values = {0.4,0.56,0.21,0.9};
        System.out.println(Arrays.toString(values));
        System.out.println("_________________________________________________");
        //pg35 Use the random method of Math to generate a number between 0 and 100
        int min = 0;
        int max = 100;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int);
        System.out.println("_________________________________________________");
        //pg38 Home Work
        //1. Create a Scanner object for user input
        //2. Prompt the user to enter the radius of a circle, it can be a decimal number
        //3. Calculate the area and circumference of the circle using Math class to get the constant of pi and also for the operation of raising a number to the power of an exponent
        //4. Display the results
        //Bonus: round the results to 3 decimals - DecimalFormat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of com.shapes.Circle:");
        double circleRadius = scanner.nextDouble();
        double area = circleRadius * circleRadius * Math.PI;
        double circumference = 2 * Math.PI * circleRadius;
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Area of com.shapes.Circle: " + df.format(area));
        System.out.println("Circumference of com.shapes.Circle: " + df.format(circumference));
    }

}
