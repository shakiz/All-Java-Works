
package consecutive.ones;

import java.util.Scanner;


public class ConsecutiveOnes {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int remainder=0,s=0,t=0;
        while(n>0){
            remainder=n%2;
            n=n/2;
            if(remainder==1){
                s++;
                if(s>=t){
                    t=s;
                }
            }
            else{
                    s=0;
            }
        }
        System.out.println(t);
    }
    
}
