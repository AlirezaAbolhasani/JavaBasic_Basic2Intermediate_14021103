package sessionone;

import utill.Status;

/**
 * *Developer: ALireza Abolhasani
 * 1/16/2024
 * 8:00 PM
 **/


public class Bill {
    private String price;
    private String name;
    private String typeOfBill;
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeOfBill() {
        return typeOfBill;
    }

    public void setTypeOfBill(String typeOfBill) {
        this.typeOfBill = typeOfBill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Bill(){}
    public Bill(String name , String price,String typeOfBill, Integer id){
        setId(id);
        setName(name);
        setPrice(price);
        setTypeOfBill(typeOfBill);
    }
    //Base Billing Code By Constructing Bill Base Class
    public void billing(){
        System.out.println(Status.STARS);
        System.out.println("Billing Calculation...");
        System.out.println("It's your "+getTypeOfBill());
        System.out.println("Your Bill ID = " + getId());
        System.out.println("Name = " + getName() + "- Price = " + getPrice() + Status.TOMAN);
        System.out.println(Status.STARS);
    }
}
