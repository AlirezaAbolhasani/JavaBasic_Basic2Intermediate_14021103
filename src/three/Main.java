package three;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * *Developer: ALireza Abolhasani
 * 2/6/2024
 * 7:18 PM
 **/


public class Main {
    public  static final String EXAMPLE ="Ali Reza  ";
    public static void main(String[] args) throws InterruptedException{
       // Thread.sleep(1000);
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(EXAMPLE);
        System.out.println(matcher.replaceAll("\t"));
        int i=1 , j=10;
        for(;i<j;j--){
            System.out.println("I'm before j = " + j);
            if(j == 5){
                System.out.println("I'm j = " + j);
                continue;
            }
        }
    }


    public void changeI(int i){
        i = 1;
    }

}
