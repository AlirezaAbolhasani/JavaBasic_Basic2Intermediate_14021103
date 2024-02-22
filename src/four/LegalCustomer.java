package four;

/**
 * *Developer: ALireza Abolhasani
 * 2/20/2024
 * 2:41 PM
 **/


public class LegalCustomer {

    public void LegalCustomer(){

    }
    public static void testInstance(Customer i){

        if(i instanceof JCustomer ){
            ((JCustomer) i).test();
        }
    }


}
