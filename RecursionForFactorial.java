
package recursion.pkgfor.factorial;

import java.util.InputMismatchException;
import java.util.Scanner;


public class RecursionForFactorial {

  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number : ");
        long number=0;
        try{
            number=scan.nextLong();
        }
        catch(InputMismatchException e){
            System.out.println(""+e.getMessage());
        }
        System.out.println("Factorial is : "+factorial(number));
    }
    
    public static long factorial(long num){
        if(num<=1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    
}
