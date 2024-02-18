package two;

/**
 * *Developer: ALireza Abolhasani
 * 1/23/2024
 * 6:16 PM
 **/


public class Account {
    //Instance Variables

    private int accNO;
    private int branche;
    private int extAccNo;
    private int extCustId;
    private double balance;
    private Customer customer;

    private static int accCounter;
    private static double maxBalance;

    public static double getMaxBalance(){
        return maxBalance;
    }
    public static int  getAccCounter(){
        return accCounter;
    }
    public Account(){
        accCounter +=1;
        if (maxBalance < balance){
            maxBalance = balance;
        }
    }

    public Account(int accNO, int branche, double balance, Customer customer) {
        accCounter +=1;
        if (maxBalance < balance){
            maxBalance = balance;
        }
        this.accNO = accNO;
        this.branche = branche;
        this.balance = balance;
        this.customer = customer;

    }

    public int getAccNO() {
        return accNO;
    }

    public void setAccNO(int accNO) {
        this.accNO = accNO;
    }

    public int getBranche() {
        return branche;
    }

    public void setBranche(int branche) {
        this.branche = branche;
    }

    public int getExtAccNo() {
        return extAccNo;
    }

    public void setExtAccNo(int extAccNo) {
        this.extAccNo = extAccNo;
    }

    public int getExtCustId() {
        return extCustId;
    }

    public void setExtCustId(int extCustId) {
        this.extCustId = extCustId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
