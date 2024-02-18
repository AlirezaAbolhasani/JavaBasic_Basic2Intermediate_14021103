package three;

/**
 * *Developer: ALireza Abolhasani
 * 2/12/2024
 * 3:56 PM
 **/


public class StrBuffer {
    public String reverse(String str){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = str.length()-1 ; i>=0; i--){
            stringBuffer.append(str.charAt(i));
        }
        return stringBuffer.toString();
    }
}
