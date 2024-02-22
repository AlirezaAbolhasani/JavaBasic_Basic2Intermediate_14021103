package five;

/**
 * *Developer: ALireza Abolhasani
 * 2/22/2024
 * 5:32 PM
 **/


public class ABS extends AccountABS implements AccountINT{
    public static void main(String[] args) {
        ABS abs = new ABS();
        AccountINT.getName("Alireza");
        System.out.println(abs.showName("Marziyeh"));
        abs.showFamily("Kazemi");

        System.out.println(abs.showName("Elsa"));
        String str= "Alireza";
        str.substring(1);

        StringBuffer stringBuffer =new StringBuffer( "Alireza");
        stringBuffer.substring(1);

        StringBuilder stringBuilder = new StringBuilder("Alireza");



    }

    @Override
    public void getFamily(String family) {
        AccountINT.super.getFamily(family);
    }

    @Override
    public String showName(String name) {
        return "Your Name is :" + name;
    }
}
