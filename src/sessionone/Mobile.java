package sessionone;

import utill.Status;

/**
 * *Developer: ALireza Abolhasani
 * 1/16/2024
 * 7:59 PM
 **/


public class Mobile extends Bill{

    public Mobile(){
    }
    public Mobile (String name, String price ,String typeOfBill, Integer id){
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
