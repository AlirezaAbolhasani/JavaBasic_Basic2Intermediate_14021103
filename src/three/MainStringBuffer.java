package three;

import java.util.Scanner;

/**
 * *Developer: ALireza Abolhasani
 * 2/12/2024
 * 4:00 PM
 **/


public class MainStringBuffer {
    public static void main(String[] args) {
        StrBuffer stringBuffer = new StrBuffer();
        Scanner scanner = new Scanner(System.in);
        String st = stringBuffer.reverse(scanner.nextLine());
        System.out.println(st);
    }
}
