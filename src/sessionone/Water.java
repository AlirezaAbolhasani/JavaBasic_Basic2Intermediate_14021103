package sessionone;

import utill.Status;

/**
 * *Developer: ALireza Abolhasani
 * 1/16/2024
 * 8:00 PM
 **/

public class Water extends Bill{

    public Water(){
    }
    public Water (String name, String price ,String typeOfBill, Integer id){
        super(name,price,typeOfBill,id);
    }
    public void claculate(){
        System.out.println(Status.STARS);
        System.out.println("Billing Calculation...");
        System.out.println("It's your "+getTypeOfBill());
        System.out.println("Your Bill ID = " + getId());
        System.out.println("Name = " + getName() + "- Price = " + getPrice());
        System.out.println(Status.STARS);
    }
}
