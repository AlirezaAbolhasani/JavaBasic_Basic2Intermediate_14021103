package sessiontwo;

/**
 * *Developer: ALireza Abolhasani
 * 1/23/2024
 * 7:10 PM
 **/


public class main {

    public static void main(String[] args) {
//        Account account1 = new Account("Alireza",1,1000);
//        Account account2 = new Account("Javad",2,4000);
//        Account account3 = new Account("Reza",3,3000);
//
//        System.out.println("Count Of Account = " + Account.getAccCount());
//        System.out.println("Max Balance = " + Account.getMaxBalance());

        Account account1 = new Account();
        account1.setName("Alireza");
        account1.setBalance(1500);
        account1.setId(1);
        Account account2 = new Account();
        account2.setName("Javad");
        account2.setBalance(8400);
        account2.setId(2);
        Account account3 = new Account();
        account3.setName("Reza");
        account3.setBalance(98);
        account3.setId(3);

        System.out.println("Count Of Account = " + Account.getAccCount());
        System.out.println("Max Balance = " + Account.getMaxBalance());

    }
}
