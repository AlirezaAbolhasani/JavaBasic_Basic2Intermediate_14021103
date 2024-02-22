package five;

/**
 * *Developer: ALireza Abolhasani
 * 2/20/2024
 * 10:15 AM
 **/


public class Main {

    public static void main(String[] args) {

        CustomerType customerType = CustomerType.HAGHIGHI;

        switch(customerType) {
            case HAGHIGHI:
                System.out.println(customerType.getValue());
                break;
            case HOGHOGHI:
                System.out.println(customerType.getValue());
                break;
            default:
                System.out.println("None");
                break;
        }

        AccountType accountType = AccountType.LOAN;

        switch (accountType){
            case LOAN:
                System.out.println(accountType.getValue());
                break;
            case SHORT:
                System.out.println(accountType.getValue());
                break;
            case LONG:
                System.out.println(accountType.getValue());
                break;
            case CHEQUE:
                System.out.println(accountType.getValue());
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
