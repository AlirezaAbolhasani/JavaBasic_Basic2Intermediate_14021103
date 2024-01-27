package sessiontwo;

/**
 * *Developer: ALireza Abolhasani
 * 1/23/2024
 * 7:10 PM
 **/


public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Alireza");
        customer.setFamily("Abolhasani");
        Account account1 = new Account(14,65359,10000.52,customer);
        Account account2 = new Account(15,65359,10000.59,customer);
        Account account3 = new Account(16,65359,10000.58,customer);

        StringBuffer a =new StringBuffer(2);
        a.append(3);
        System.out.println(a);

//        Account account1 = new Account();
//        account1.setName("Alireza");
//        account1.setBalance(1500);
//        account1.setId(1);
//        Account account2 = new Account();
//        account2.setName("Javad");
//        account2.setBalance(8400);
//        account2.setId(2);
//        Account account3 = new Account();
//        account3.setName("Reza");
//        account3.setBalance(98);
//        account3.setId(3);

        System.out.println("Count Of Account = " + Account.getAccCounter());
        System.out.println("Max Balance = " + Account.getMaxBalance());

    }
}
