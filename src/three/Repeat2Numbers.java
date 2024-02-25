package three;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * *Developer: ALireza Abolhasani
 * 2/20/2024
 * 8:09 AM
 **/


public class Repeat2Numbers {

    public static final String PATTERN = "([1-9])\\1\\d{6}";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(PATTERN,Pattern.MULTILINE);
        Matcher  matcher;
        String whileStr;
        System.out.println("****In each Step with A KEY you can Escape The program.******");
        do {
            System.out.print("Please Enter A eight numbers String :");
            whileStr = scanner.nextLine().trim();
            if(whileStr.equals("A")) continue;
            matcher= pattern.matcher(whileStr);
            if (matcher.find()) {
                System.out.println("Your String Was Match");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Error > "+whileStr +" Repeat again...");
                System.out.println();
            }

        }while (!whileStr.equals("A"));
    }

}
