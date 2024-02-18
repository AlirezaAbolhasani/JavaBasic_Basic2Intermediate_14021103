package four;

import four.exceptions.NationalIdException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(System.in);
            Customer customer = new Customer();
            String str = scanner.nextLine();
            customer.setId(str);
        }catch (NationalIdException n){
            System.out.println(n);
        }

    }
}
