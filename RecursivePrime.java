
package recursive.prime;

import java.util.Scanner;

public class RecursivePrime {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println(primenumber(number));
    }
    
    public static String primenumber(int number){
        String s=null;
        if(number%number==0){
            return s="Prime";
        }
        else{
            return s="Not Prime";
        }
    }
    
}
