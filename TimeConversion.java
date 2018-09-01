
package time.conversion;

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String time=scan.next();
        char[] toChar=time.toCharArray();
        char[] out=Arrays.copyOfRange(toChar, 0, 8);
        if(toChar[8]=='A' && time.substring(0, 2).equals("12")){
            out[0]=0;
            out[1]=0;
        }
        else if(toChar[8]=='P' && time.substring(0, 2)!="12"){
            String s = "" + (Integer.parseInt(time.substring(0,2)) + 12);
                char[] f = s.toCharArray();
                out[0] = f[0];
                out[1] = f[1];
        }
        System.out.println(out);
    }
    
}
