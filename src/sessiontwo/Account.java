package sessiontwo;

/**
 * *Developer: ALireza Abolhasani
 * 1/23/2024
 * 6:16 PM
 **/


public class Account {
    private String name;
    private int id;
    private int balance;
    private static Integer accCount = 0;
    private static Integer maxBalance =0;

    public static Integer getAccCount(){
        return accCount;
    }
    public static Integer getMaxBalance(){
        return maxBalance;
    }

    public Account() {
        accCount +=1;
        if(maxBalance < balance){
            maxBalance = balance;
        }
    }

    public Account(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        accCount +=1;
        if(maxBalance < balance){
            maxBalance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static void setAccCount(Integer accCount) {
        Account.accCount = accCount;
    }

    public static void setMaxBalance(Integer maxBalance) {
        Account.maxBalance = maxBalance;
    }
}
