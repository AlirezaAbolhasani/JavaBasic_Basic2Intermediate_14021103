package five;

/**
 * *Developer: ALireza Abolhasani
 * 2/21/2024
 * 8:15 PM
 **/


public enum CustomerType {
    HAGHIGHI(1),
    HOGHOGHI(2),
    ESHTERAKI(3);

    private final int value;

    CustomerType(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
