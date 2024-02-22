package test;

/**
 * *Developer: ALireza Abolhasani
 * 2/22/2024
 * 5:36 AM
 **/


public class Main {
    public static void main(String[] args) {

        try {
            int[] a = {1, 2, 6, 5, 8, 4, 1};
            int[] b;
            b = a.clone();
            int i = 0;
            while (i < b.length) {
                i++;
                System.out.println(b[i]);
                i++;
            }
        }catch (ExceptionA e){
            System.out.println(e.getMessage());

        }
    }


}
