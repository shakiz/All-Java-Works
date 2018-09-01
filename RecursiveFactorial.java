
package recursive.factorial;

import java.util.Scanner;


public class RecursiveFactorial {

   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values to calculate factoral : ");
        int fact=scan.nextInt();
        
        System.out.println(""+recursivefact(fact));;
    }
    public static int recursivefact(int number){
        if(number<=1){
            return 1;
        }
        else{
            return number*recursivefact(number-1);
        }
    }
}
