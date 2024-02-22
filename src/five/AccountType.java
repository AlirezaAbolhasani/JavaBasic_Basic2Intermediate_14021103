package five;

/**
 * *Developer: ALireza Abolhasani
 * 2/21/2024
 * 8:06 PM
 **/

public enum AccountType {
    LOAN(1),
    SHORT(2),
    LONG(3),
    CHEQUE(4);

    private final int value;

    AccountType(int value){
        this.value = value;
    }
    int getValue(){
        return this.value;
    }
}
