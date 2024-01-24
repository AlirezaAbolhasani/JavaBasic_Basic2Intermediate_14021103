package sessionone;

import utilities.Status;

/**
 * *Developer: ALireza Abolhasani
 * 1/16/2024
 * 8:10 PM
 **/

public class Main {

    public static void main(String[] args) {
        Bill mobile = new Mobile("Alireza Abolhasani" , " 20800" , Status.MOBILE,8796523);
        Bill power = new Power("Reza Jafari","158000", Status.POWER,9861222);
        Bill water = new Water("Hosein Khalili","65580000",Status.WATER, 7896666);

        //Polymorphism
        mobile.billCalculator();
        power.billCalculator();
        water.billCalculator();

    }
}
