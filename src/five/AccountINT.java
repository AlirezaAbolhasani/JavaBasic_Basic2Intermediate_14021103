package five;

/**
 * *Developer: ALireza Abolhasani
 * 2/22/2024
 * 3:21 PM
 **/


public interface  AccountINT {
    public static String getName(String name){
        return "Your name " + name;
    }
    default void getFamily(String family){
        System.out.println("Your Family " + family);
    }
}
