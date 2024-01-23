package sessionone;

import sessionone.Bill;
import sessionone.Mobile;
import sessionone.Power;
import sessionone.Water;
import utill.Status;

/**
 * *Developer: ALireza Abolhasani
 * 1/16/2024
 * 8:10 PM
 **/

public class Main {

    public static void main(String[] args) {
        Bill mMobile = new Mobile("Alireza Abolhasani" , " 20800" , Status.MOBILE,8796523);
        Bill mPower = new Power("Reza Jafari","158000", Status.POWER,9861222);
        Bill mWater = new Water("Hosein Khalili","65580000",Status.WATER, 7896666);
        mMobile.billing();
        mPower.billing();
        mWater.billing();
    }
}
